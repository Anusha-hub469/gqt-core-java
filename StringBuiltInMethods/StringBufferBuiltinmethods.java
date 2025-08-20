package StringBuiltInMethods;

public class StringBufferBuiltinmethods {

	    public static void main(String[] args) {
	        // Using StringBuilder
	        StringBuilder sb = new StringBuilder("Hello");

	        System.out.println("Original StringBuilder: " + sb);

	        // length()
	        System.out.println("Length: " + sb.length());

	        // charAt(int)
	        System.out.println("Character at index 1: " + sb.charAt(1));

	        // append(String)
	        sb.append(" World");
	        System.out.println("After append: " + sb);

	        // insert(int, String)
	        sb.insert(6, "Java ");
	        System.out.println("After insert: " + sb);

	        // replace(int, int, String)
	        sb.replace(6, 10, "Awesome");
	        System.out.println("After replace: " + sb);

	        // delete(int, int)
	        sb.delete(6, 13);
	        System.out.println("After delete: " + sb);

	        // reverse()
	        sb.reverse();
	        System.out.println("After reverse: " + sb);

	        // toString()
	        String str = sb.toString();
	        System.out.println("Converted to String: " + str);

	        // indexOf(String)
	        int index = sb.indexOf("olleH");
	        System.out.println("Index of 'olleH': " + index);

	        // deleteCharAt(int)
	        sb.deleteCharAt(0);
	        System.out.println("After deleteCharAt(0): " + sb);

	        // capacity()
	        System.out.println("Current capacity: " + sb.capacity());

	        // ensureCapacity(int)
	        sb.ensureCapacity(50);
	        System.out.println("Capacity after ensuring 50: " + sb.capacity());

	        // setCharAt(int, char)
	        sb.setCharAt(0, 'H');
	        System.out.println("After setCharAt(0, 'H'): " + sb);

	        // substring(int)
	        String substr1 = sb.substring(2);
	        System.out.println("Substring from index 2: " + substr1);

	        // substring(int, int)
	        String substr2 = sb.substring(0, 3);
	        System.out.println("Substring from 0 to 3: " + substr2);

	        System.out.println("\n--- Now Using StringBuffer ---");

	        // Now demonstrating the same using StringBuffer
	        StringBuffer buffer = new StringBuffer("Welcome");

	        System.out.println("Original StringBuffer: " + buffer);

	        buffer.append(" Java");
	        System.out.println("After append: " + buffer);

	        buffer.insert(8, "to ");
	        System.out.println("After insert: " + buffer);

	        buffer.replace(8, 11, "in");
	        System.out.println("After replace: " + buffer);

	        buffer.delete(0, 4);
	        System.out.println("After delete: " + buffer);

	        buffer.reverse();
	        System.out.println("After reverse: " + buffer);

	        System.out.println("Character at index 2: " + buffer.charAt(2));
	        System.out.println("Length: " + buffer.length());
	    }
	}