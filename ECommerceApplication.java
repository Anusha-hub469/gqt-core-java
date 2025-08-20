package ECommerce;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;

public class ECommerceApplication extends JFrame {
    // User info fields
    JTextField nameField, emailField, contactField;
    JButton proceedBtn;

    // Category/Subcategory/Product selection
    JComboBox<String> categoryBox, subcategoryBox, productBox;
    JTextArea productDetailsArea;
    JButton addToCartBtn, buyNowBtn, checkoutBtn;

    // Cart display
    JTextArea cartArea;

    // Data structures for categories, products, cart
    Map<String, Map<String, List<Product>>> catalog = new HashMap<>();
    List<CartItem> cart = new ArrayList<>();

    // Selected user info
    String userName, userEmail, userContact;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ECommerceApplication().setVisible(true));
    }

    public ECommerceApplication() {
        setTitle("Simple E-Commerce Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        initCatalog();
        initUserInfoPanel();
    }

    // Initialize categories, subcategories, and products
    void initCatalog() {
        // Electronics subcategories and products
        Map<String, List<Product>> electronics = new HashMap<>();
        electronics.put("Mobile", List.of(
                new Product("iPhone 13", "Apple", 4.7, "Latest Apple iPhone", 999),
                new Product("Galaxy S21", "Samsung", 4.5, "Flagship Samsung phone", 899),
                new Product("Pixel 6", "Google", 4.6, "Google's own smartphone", 799),
                new Product("OnePlus 9", "OnePlus", 4.4, "Fast charging & smooth UI", 729),
                new Product("Redmi Note 10", "Xiaomi", 4.3, "Affordable with great specs", 199)
        ));
        electronics.put("Headphones", List.of(
                new Product("Sony WH-1000XM4", "Sony", 4.8, "Industry leading noise cancellation", 350),
                new Product("Bose QuietComfort 35 II", "Bose", 4.7, "Comfortable and clear sound", 299),
                new Product("Apple AirPods Pro", "Apple", 4.6, "Wireless earbuds with ANC", 249),
                new Product("JBL Tune 750BTNC", "JBL", 4.2, "Good bass and noise cancelling", 120),
                new Product("Sennheiser HD 450BT", "Sennheiser", 4.4, "Hi-fi sound quality", 199)
        ));
        electronics.put("Speakers", List.of(
                new Product("Sony SRS-XB12", "Sony", 4.5, "Portable bluetooth speaker", 60),
                new Product("AVL Speaker X300", "AVL", 4.1, "Loud and clear sound", 80),
                new Product("Philips BT3900", "Philips", 4.0, "Compact wireless speaker", 50),
                new Product("Bose SoundLink", "Bose", 4.7, "Premium portable speaker", 130),
                new Product("JBL Flip 5", "JBL", 4.6, "Waterproof and powerful", 110)
        ));
        electronics.put("Laptops", List.of(
                new Product("MacBook Pro", "Apple", 4.8, "Powerful laptop for professionals", 1999),
                new Product("Dell XPS 13", "Dell", 4.6, "Compact and powerful ultrabook", 1299),
                new Product("HP Spectre x360", "HP", 4.5, "2-in-1 convertible laptop", 1399),
                new Product("Lenovo ThinkPad X1", "Lenovo", 4.7, "Business grade durability", 1599),
                new Product("Asus ZenBook 14", "Asus", 4.4, "Lightweight and fast", 999)
        ));
        electronics.put("Digital Camera", List.of(
                new Product("Canon EOS R5", "Canon", 4.9, "Professional mirrorless camera", 3899),
                new Product("Sony Alpha A7 III", "Sony", 4.8, "Excellent full-frame sensor", 1999),
                new Product("Nikon Z6 II", "Nikon", 4.7, "Versatile mirrorless camera", 1599),
                new Product("Fujifilm X-T4", "Fujifilm", 4.6, "Retro design and great image quality", 1699),
                new Product("Panasonic Lumix GH5", "Panasonic", 4.5, "Great for video shooters", 1299)
        ));

        // Furnitures
        Map<String, List<Product>> furnitures = new HashMap<>();
        furnitures.put("Sofas", List.of(
                new Product("Leather Sofa", "Ikea", 4.2, "Comfortable leather sofa", 500),
                new Product("Fabric Sofa", "Ashley", 4.1, "Soft fabric with modern design", 450),
                new Product("Recliner Sofa", "La-Z-Boy", 4.6, "Perfect for relaxation", 700),
                new Product("Sectional Sofa", "West Elm", 4.4, "Spacious sectional", 1200),
                new Product("Sleeper Sofa", "Wayfair", 4.0, "Convert to bed easily", 800)
        ));
        furnitures.put("Beds", List.of(
                new Product("King Size Bed", "Ikea", 4.5, "Spacious and sturdy", 1000),
                new Product("Queen Size Bed", "Ashley", 4.3, "Comfortable and stylish", 800),
                new Product("Bunk Bed", "Wayfair", 4.2, "Ideal for kids", 600),
                new Product("Day Bed", "West Elm", 4.0, "Multifunctional day bed", 750),
                new Product("Platform Bed", "Zinus", 4.1, "Modern platform design", 500)
        ));
        furnitures.put("Tables", List.of(
                new Product("Dining Table", "Ikea", 4.3, "Seats 6 comfortably", 700),
                new Product("Coffee Table", "Ashley", 4.1, "Modern design", 300),
                new Product("Office Desk", "Wayfair", 4.2, "Spacious working surface", 400),
                new Product("Console Table", "West Elm", 4.0, "Decorative and useful", 250),
                new Product("Bedside Table", "Zinus", 4.1, "Compact and sturdy", 150)
        ));
        furnitures.put("Chairs", List.of(
                new Product("Office Chair", "Herman Miller", 4.7, "Ergonomic chair", 1200),
                new Product("Recliner Chair", "La-Z-Boy", 4.5, "Comfortable recliner", 700),
                new Product("Dining Chair", "Ikea", 4.2, "Set of 4 chairs", 350),
                new Product("Rocking Chair", "Ashley", 4.0, "Classic wooden rocking", 400),
                new Product("Accent Chair", "Wayfair", 4.3, "Stylish design", 450)
        ));
        furnitures.put("Wardrobes", List.of(
                new Product("2-Door Wardrobe", "Ikea", 4.2, "Compact and spacious", 600),
                new Product("3-Door Wardrobe", "Ashley", 4.3, "Modern style", 900),
                new Product("Sliding Door Wardrobe", "Wayfair", 4.4, "Space saving", 1100),
                new Product("Corner Wardrobe", "West Elm", 4.1, "Fits in corners", 700),
                new Product("Mirrored Wardrobe", "Zinus", 4.0, "Includes full-length mirror", 850)
        ));

        // Floppings (Assuming meant as Clothing categories)
        Map<String, List<Product>> floppings = new HashMap<>();
        floppings.put("Mens", List.of(
                new Product("Men's T-Shirt", "Levi's", 4.3, "Cotton, comfortable fit", 25),
                new Product("Men's Jeans", "Wrangler", 4.5, "Classic fit jeans", 40),
                new Product("Men's Jacket", "North Face", 4.6, "Waterproof jacket", 120),
                new Product("Men's Shoes", "Nike", 4.7, "Running shoes", 75),
                new Product("Men's Watch", "Fossil", 4.4, "Analog wrist watch", 90)
        ));
        floppings.put("Womens", List.of(
                new Product("Women's Dress", "H&M", 4.2, "Summer dress", 35),
                new Product("Women's Handbag", "Gucci", 4.8, "Luxury handbag", 500),
                new Product("Women's Heels", "Steve Madden", 4.5, "Elegant heels", 85),
                new Product("Women's Scarf", "Zara", 4.1, "Silk scarf", 25),
                new Product("Women's Sunglasses", "Ray-Ban", 4.6, "UV protection sunglasses", 150)
        ));
        floppings.put("Childrens", List.of(
                new Product("Children's T-Shirt", "Gap Kids", 4.3, "Soft cotton", 15),
                new Product("Children's Shorts", "Carter's", 4.1, "Comfortable shorts", 20),
                new Product("Children's Shoes", "Adidas", 4.5, "Durable shoes", 40),
                new Product("Children's Jacket", "Columbia", 4.6, "Warm jacket", 60),
                new Product("Children's Hat", "The North Face", 4.2, "Sun protection hat", 15)
        ));
        floppings.put("Boys", List.of(
                new Product("Boys' Jeans", "Levi's", 4.4, "Rugged jeans", 25),
                new Product("Boys' Sneakers", "Nike", 4.6, "Sporty sneakers", 45),
                new Product("Boys' Hoodie", "Adidas", 4.5, "Comfortable hoodie", 35),
                new Product("Boys' Cap", "Under Armour", 4.2, "Adjustable cap", 20),
                new Product("Boys' Backpack", "JanSport", 4.7, "Durable backpack", 50)
        ));
        floppings.put("Girls", List.of(
                new Product("Girls' Dress", "Carter's", 4.3, "Pretty summer dress", 30),
                new Product("Girls' Sandals", "Stride Rite", 4.5, "Comfortable sandals", 40),
                new Product("Girls' Sweater", "Gap", 4.4, "Warm and soft", 35),
                new Product("Girls' Backpack", "Disney", 4.6, "Colorful backpack", 45),
                new Product("Girls' Hairband", "Claire's", 4.1, "Cute accessories", 10)
        ));

        // Daily Needs / Groceries
        Map<String, List<Product>> groceries = new HashMap<>();
        groceries.put("Vegetables", List.of(
                new Product("Tomatoes", "Farm Fresh", 4.5, "Organic red tomatoes", 3),
                new Product("Potatoes", "Farm Fresh", 4.4, "Fresh potatoes", 2),
                new Product("Onions", "Farm Fresh", 4.3, "Red onions", 2),
                new Product("Carrots", "Farm Fresh", 4.6, "Crunchy carrots", 4),
                new Product("Spinach", "Farm Fresh", 4.2, "Fresh spinach leaves", 3)
        ));
        groceries.put("Fruits", List.of(
                new Product("Apples", "Farm Fresh", 4.6, "Sweet red apples", 4),
                new Product("Bananas", "Farm Fresh", 4.7, "Ripe yellow bananas", 2),
                new Product("Oranges", "Farm Fresh", 4.5, "Juicy oranges", 3),
                new Product("Mangoes", "Farm Fresh", 4.8, "Seasonal mangoes", 5),
                new Product("Grapes", "Farm Fresh", 4.3, "Fresh grapes", 4)
        ));
        groceries.put("Dairy", List.of(
                new Product("Milk", "DairyPure", 4.7, "Full cream milk", 2),
                new Product("Butter", "Amul", 4.6, "Creamy butter", 3),
                new Product("Cheese", "Kraft", 4.4, "Cheddar cheese", 5),
                new Product("Yogurt", "Chobani", 4.5, "Greek yogurt", 4),
                new Product("Ice Cream", "Breyers", 4.3, "Vanilla ice cream", 6)
        ));
        groceries.put("Bakery", List.of(
                new Product("Bread", "Wonder", 4.2, "Whole wheat bread", 2),
                new Product("Croissant", "Bakery Fresh", 4.3, "Buttery croissant", 3),
                new Product("Muffin", "Dunkin", 4.1, "Blueberry muffin", 4),
                new Product("Bagel", "Einstein", 4.0, "Plain bagel", 2),
                new Product("Donut", "Krispy Kreme", 4.4, "Glazed donut", 3)
        ));
        groceries.put("Beverages", List.of(
                new Product("Coffee", "Starbucks", 4.7, "Ground coffee", 10),
                new Product("Tea", "Twinings", 4.5, "Black tea bags", 5),
                new Product("Juice", "Tropicana", 4.3, "Orange juice", 4),
                new Product("Soda", "Coca Cola", 4.1, "Carbonated drink", 3),
                new Product("Water", "Aquafina", 4.6, "Bottled water", 1)
        ));

        catalog.put("Electronics", electronics);
        catalog.put("Furnitures", furnitures);
        catalog.put("Floppings", floppings);
        catalog.put("Daily Needs / Groceries", groceries);
    }

    // Initial panel to collect user info
    void initUserInfoPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel label = new JLabel("Enter your details:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2; gbc.insets = new Insets(10,10,20,10);
        panel.add(label, gbc);

        gbc.gridwidth = 1; gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Name: "), gbc);
        nameField = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Email: "), gbc);
        emailField = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Contact No: "), gbc);
        contactField = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(contactField, gbc);

        proceedBtn = new JButton("Proceed to Shop");
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        panel.add(proceedBtn, gbc);

        setContentPane(panel);

        proceedBtn.addActionListener(e -> {
            userName = nameField.getText().trim();
            userEmail = emailField.getText().trim();
            userContact = contactField.getText().trim();
            if(userName.isEmpty() || userEmail.isEmpty() || userContact.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields.");
                return;
            }
            initShoppingPanel();
        });
    }

    // Shopping panel with categories, products, cart, checkout
    void initShoppingPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Top panel - user info
        JLabel userInfo = new JLabel("User: " + userName + " | Email: " + userEmail + " | Contact: " + userContact);
        userInfo.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        mainPanel.add(userInfo, BorderLayout.NORTH);

        // Left panel - selection panel
        JPanel selectionPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Category combo
        gbc.gridx = 0; gbc.gridy = 0;
        selectionPanel.add(new JLabel("Category:"), gbc);
        categoryBox = new JComboBox<>(catalog.keySet().toArray(new String[0]));
        gbc.gridx = 1; gbc.gridy = 0;
        selectionPanel.add(categoryBox, gbc);

        // Subcategory combo
        gbc.gridx = 0; gbc.gridy = 1;
        selectionPanel.add(new JLabel("Subcategory:"), gbc);
        subcategoryBox = new JComboBox<>();
        gbc.gridx = 1; gbc.gridy = 1;
        selectionPanel.add(subcategoryBox, gbc);

        // Product combo
        gbc.gridx = 0; gbc.gridy = 2;
        selectionPanel.add(new JLabel("Product:"), gbc);
        productBox = new JComboBox<>();
        gbc.gridx = 1; gbc.gridy = 2;
        selectionPanel.add(productBox, gbc);

        // Product details
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        productDetailsArea = new JTextArea(10, 25);
        productDetailsArea.setEditable(false);
        productDetailsArea.setLineWrap(true);
        productDetailsArea.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(productDetailsArea);
        selectionPanel.add(scroll, gbc);

        // Buttons
        gbc.gridwidth = 1;
        addToCartBtn = new JButton("Add to Cart");
        buyNowBtn = new JButton("Buy Now");
        checkoutBtn = new JButton("Checkout");

        JPanel btnPanel = new JPanel();
        btnPanel.add(addToCartBtn);
        btnPanel.add(buyNowBtn);
        btnPanel.add(checkoutBtn);

        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        selectionPanel.add(btnPanel, gbc);

        mainPanel.add(selectionPanel, BorderLayout.WEST);

        // Right panel - cart
        JPanel cartPanel = new JPanel(new BorderLayout());
        cartPanel.setBorder(BorderFactory.createTitledBorder("Shopping Cart"));
        cartArea = new JTextArea(25, 30);
        cartArea.setEditable(false);
        JScrollPane cartScroll = new JScrollPane(cartArea);
        cartPanel.add(cartScroll, BorderLayout.CENTER);

        mainPanel.add(cartPanel, BorderLayout.EAST);

        setContentPane(mainPanel);
        revalidate();
        repaint();

        // Populate subcategories based on category
        categoryBox.addActionListener(e -> loadSubcategories());
        // Populate products based on subcategory
        subcategoryBox.addActionListener(e -> loadProducts());
        // Show product details on product selection
        productBox.addActionListener(e -> showProductDetails());

        addToCartBtn.addActionListener(e -> addSelectedProductToCart());
        buyNowBtn.addActionListener(e -> buyNowSelectedProduct());
        checkoutBtn.addActionListener(e -> checkoutCart());

        // Load initial data
        loadSubcategories();
    }

    void loadSubcategories() {
        String cat = (String)categoryBox.getSelectedItem();
        if(cat == null) return;
        Map<String, List<Product>> subs = catalog.get(cat);
        subcategoryBox.removeAllItems();
        for(String sub : subs.keySet()) {
            subcategoryBox.addItem(sub);
        }
        loadProducts();
    }

    void loadProducts() {
        String cat = (String)categoryBox.getSelectedItem();
        String sub = (String)subcategoryBox.getSelectedItem();
        if(cat == null || sub == null) return;

        List<Product> prods = catalog.get(cat).get(sub);
        productBox.removeAllItems();
        for(int i = 0; i < prods.size(); i++) {
            productBox.addItem((i+1) + ". " + prods.get(i).name);
        }
        showProductDetails();
    }

    void showProductDetails() {
        String cat = (String)categoryBox.getSelectedItem();
        String sub = (String)subcategoryBox.getSelectedItem();
        int idx = productBox.getSelectedIndex();
        if(cat == null || sub == null || idx < 0) {
            productDetailsArea.setText("");
            return;
        }
        Product p = catalog.get(cat).get(sub).get(idx);
        String details = "Name: " + p.name + "\n" +
                         "Company: " + p.company + "\n" +
                         "Rating: " + p.rating + "\n" +
                         "Price: $" + p.price + "\n" +
                         "Description: " + p.description + "\n" +
                         "Features:\n" + p.getFeaturesText();
        productDetailsArea.setText(details);
    }

    void addSelectedProductToCart() {
        String cat = (String)categoryBox.getSelectedItem();
        String sub = (String)subcategoryBox.getSelectedItem();
        int idx = productBox.getSelectedIndex();
        if(cat == null || sub == null || idx < 0) {
            JOptionPane.showMessageDialog(this, "Select a product first.");
            return;
        }
        Product p = catalog.get(cat).get(sub).get(idx);
        // Check if product already in cart - increase quantity
        for(CartItem item : cart) {
            if(item.product.equals(p)) {
                item.quantity++;
                updateCartArea();
                JOptionPane.showMessageDialog(this, "Added one more " + p.name + " to cart.");
                return;
            }
        }
        // Else add new item
        cart.add(new CartItem(p, 1));
        updateCartArea();
        JOptionPane.showMessageDialog(this, p.name + " added to cart.");
    }

    void buyNowSelectedProduct() {
        String cat = (String)categoryBox.getSelectedItem();
        String sub = (String)subcategoryBox.getSelectedItem();
        int idx = productBox.getSelectedIndex();
        if(cat == null || sub == null || idx < 0) {
            JOptionPane.showMessageDialog(this, "Select a product first.");
            return;
        }
        Product p = catalog.get(cat).get(sub).get(idx);
        String message = "Buying now:\n" +
                         p.name + " - $" + p.price + "\n\nThank you for your purchase, " + userName + "!";
        JOptionPane.showMessageDialog(this, message);
    }

    void updateCartArea() {
        StringBuilder sb = new StringBuilder();
        double total = 0;
        for(CartItem item : cart) {
            double itemTotal = item.product.price * item.quantity;
            sb.append(item.product.name).append(" x").append(item.quantity)
              .append(" = $").append(itemTotal).append("\n");
            total += itemTotal;
        }
        sb.append("\nTotal: $").append(total);
        cartArea.setText(sb.toString());
    }

    void checkoutCart() {
        if(cart.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Your cart is empty.");
            return;
        }
        StringBuilder bill = new StringBuilder();
        bill.append("**** Bill ****\n");
        bill.append("Customer: ").append(userName).append("\n\n");
        double total = 0;
        for(CartItem item : cart) {
            double itemTotal = item.product.price * item.quantity;
            bill.append(item.product.name).append(" | Qty: ").append(item.quantity)
                .append(" | Price: $").append(item.product.price)
                .append(" | Total: $").append(itemTotal).append("\n");
            total += itemTotal;
        }
        bill.append("\nTotal Amount Payable: $").append(total).append("\n");
        JOptionPane.showMessageDialog(this, bill.toString(), "Checkout Bill", JOptionPane.INFORMATION_MESSAGE);
        cart.clear();
        updateCartArea();
    }

    // Product class
    static class Product {
        String name;
        String company;
        double rating;
        String description;
        double price;

        public Product(String name, String company, double rating, String description, double price) {
            this.name = name;
            this.company = company;
            this.rating = rating;
            this.description = description;
            this.price = price;
        }

        String getFeaturesText() {
            // For simplicity, just repeating description. You can customize per product.
            return "- High Quality\n- Best Seller\n- Available on Amazon";
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return name.equals(product.name) && company.equals(product.company);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, company);
        }
    }

    // Cart item class
    static class CartItem {
        Product product;
        int quantity;
        public CartItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }}}


