package Corejavaproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizGameSwing extends JFrame {
    private JButton[] optionButtons;
    private JButton lifeline5050Button, lifelineAudienceButton, quitButton;
    private JLabel questionLabel, prizeLabel, lifelineLabel;
    private int currentQuestionIndex = 0;
    private int prize = 0;
    private int lifeline5050Available = 1;
    private int lifelineAudienceAvailable = 1;

    private Question[] questions = new Question[] {
        new Question("What is the capital of France?",
                new String[]{"London", "Paris", "Berlin", "Madrid"}, 1),
        new Question("Which planet is known as the Red Planet?",
                new String[]{"Earth", "Venus", "Mars", "Jupiter"}, 2),
        new Question("What is 2 + 2?",
                new String[]{"3", "4", "5", "6"}, 1),
        new Question("Who wrote 'Hamlet'?",
                new String[]{"Charles Dickens", "William Shakespeare", "Leo Tolstoy", "Mark Twain"}, 1),
        new Question("What is the largest ocean on Earth?",
                new String[]{"Atlantic", "Indian", "Arctic", "Pacific"}, 3),
        new Question("What is the boiling point of water?",
                new String[]{"90°C", "100°C", "110°C", "120°C"}, 1),
        new Question("Which country hosted the 2016 Summer Olympics?",
                new String[]{"China", "Brazil", "UK", "Russia"}, 1),
        new Question("What is the currency of Japan?",
                new String[]{"Yen", "Won", "Dollar", "Euro"}, 0),
        new Question("What gas do plants absorb?",
                new String[]{"Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"}, 2),
        new Question("Which language is primarily spoken in Brazil?",
                new String[]{"Spanish", "English", "Portuguese", "French"}, 2)
    };

    public QuizGameSwing() {
        setTitle("Quiz App");
        setSize(700, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Top panel for prize and lifelines info
        JPanel topPanel = new JPanel(new GridLayout(3, 1));
        prizeLabel = new JLabel("Prize: ₹" + prize, SwingConstants.CENTER);
        lifelineLabel = new JLabel(getLifelineText(), SwingConstants.CENTER);
        topPanel.add(prizeLabel);
        topPanel.add(lifelineLabel);
        add(topPanel, BorderLayout.NORTH);

        // Question label
        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(questionLabel, BorderLayout.CENTER);

        // Options panel with 4 buttons
        JPanel optionsPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        optionButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JButton();
            optionButtons[i].setFont(new Font("Arial", Font.PLAIN, 16));
            int idx = i;
            optionButtons[i].addActionListener(e -> checkAnswer(idx));
            optionsPanel.add(optionButtons[i]);
        }
        add(optionsPanel, BorderLayout.EAST);

        // Bottom panel with lifeline and quit buttons
        JPanel bottomPanel = new JPanel();
        lifeline5050Button = new JButton("50-50 Lifeline");
        lifelineAudienceButton = new JButton("Audience Poll");
        quitButton = new JButton("Quit");
        bottomPanel.add(lifeline5050Button);
        bottomPanel.add(lifelineAudienceButton);
        bottomPanel.add(quitButton);
        add(bottomPanel, BorderLayout.SOUTH);

        lifeline5050Button.addActionListener(e -> useFiftyFifty());
        lifelineAudienceButton.addActionListener(e -> useAudiencePoll());
        quitButton.addActionListener(e -> System.exit(0));

        loadQuestion();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String getLifelineText() {
        return "Lifelines Available: 50-50 (" + lifeline5050Available + "), Audience Poll (" + lifelineAudienceAvailable + ")";
    }

    private void loadQuestion() {
        if (currentQuestionIndex >= questions.length) {
            JOptionPane.showMessageDialog(this, "Quiz finished! Your prize: ₹" + prize);
            System.exit(0);
        }
        Question q = questions[currentQuestionIndex];
        questionLabel.setText("Q" + (currentQuestionIndex + 1) + ": " + q.question);

        for (int i = 0; i < 4; i++) {
            optionButtons[i].setText(q.options[i]);
            optionButtons[i].setEnabled(true);
            optionButtons[i].setVisible(true);
        }

        lifeline5050Button.setEnabled(lifeline5050Available > 0);
        lifelineAudienceButton.setEnabled(lifelineAudienceAvailable > 0);
    }

    private void checkAnswer(int selectedIndex) {
        Question q = questions[currentQuestionIndex];
        if (selectedIndex == q.correctIndex) {
            prize += 1000;
            prizeLabel.setText("Prize: ₹" + prize);
            JOptionPane.showMessageDialog(this, "Correct!");
        } else {
            JOptionPane.showMessageDialog(this, "Wrong! The correct answer was: " + q.options[q.correctIndex]);
            System.exit(0);
        }
        currentQuestionIndex++;
        loadQuestion();
    }

    private void useFiftyFifty() {
        if (lifeline5050Available <= 0) {
            JOptionPane.showMessageDialog(this, "No 50-50 lifelines left!");
            return;
        }
        lifeline5050Available--;
        lifelineLabel.setText(getLifelineText());

        Question q = questions[currentQuestionIndex];

        List<Integer> incorrectIndexes = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (i != q.correctIndex) incorrectIndexes.add(i);
        }

        // Randomly hide two incorrect options
        Random rand = new Random();
        int removed = 0;
        while (removed < 2 && !incorrectIndexes.isEmpty()) {
            int removeIdx = incorrectIndexes.remove(rand.nextInt(incorrectIndexes.size()));
            optionButtons[removeIdx].setVisible(false);
            removed++;
        }

        lifeline5050Button.setEnabled(false);  // disable after use
    }

    private void useAudiencePoll() {
        if (lifelineAudienceAvailable <= 0) {
            JOptionPane.showMessageDialog(this, "No Audience Poll lifelines left!");
            return;
        }
        lifelineAudienceAvailable--;
        lifelineLabel.setText(getLifelineText());

        Question q = questions[currentQuestionIndex];
        int correct = q.correctIndex;

        // Generate random percentages for options, more weight to correct option
        Random rand = new Random();
        int[] percentages = new int[4];
        int total = 100;
        for (int i = 0; i < 4; i++) percentages[i] = 0;

        percentages[correct] = 40 + rand.nextInt(21); // 40-60% for correct answer
        total -= percentages[correct];

        // distribute remaining percentages among wrong answers randomly
        List<Integer> wrongs = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (i != correct) wrongs.add(i);
        }
        for (int i = 0; i < wrongs.size(); i++) {
            if (i == wrongs.size() - 1) {
                percentages[wrongs.get(i)] = total;
            } else {
                int val = rand.nextInt(total + 1);
                percentages[wrongs.get(i)] = val;
                total -= val;
            }
        }

        // Prepare message for poll
        StringBuilder pollResult = new StringBuilder("Audience Poll Results:\n");
        for (int i = 0; i < 4; i++) {
            pollResult.append(q.options[i]).append(": ").append(percentages[i]).append("%\n");
        }
        JOptionPane.showMessageDialog(this, pollResult.toString());

        lifelineAudienceButton.setEnabled(false);  // disable after use
    }

    private static class Question {
        String question;
        String[] options;
        int correctIndex;

        public Question(String q, String[] opts, int correctIndex) {
            this.question = q;
            this.options = opts;
            this.correctIndex = correctIndex;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizGameSwing::new);
    }
}

