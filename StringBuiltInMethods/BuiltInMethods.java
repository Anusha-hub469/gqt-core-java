package StringBuiltInMethods;

public class BuiltInMethods {
	public static void main(String[] args) {
		String str = "SachinRameshTendulkar";
		//1. length()
		int len = str.length(); // it will provide the total length of the string
		
		//2. charAt()
		System.out.println("The length of the string is = "+len);
		char c = str.charAt(0);// it will provide the character at the specified position
		System.out.println("The character at 0th position = "+c);
		
		//c = str.charAt(100);// it leads to IndexOutOfBounds exception as we have only 21 positions
		//System.out.println("The character at 0th position = "+c)
		
		//3. concat()
		String str1 = str.concat(" is the best batsman in the world"); //it merges the content of 2 strings
		System.out.println(str1);
		
		//4. contains()
		boolean res1 = str.contains("Ramesh");//it will check if substring is present in the main string
		System.out.println(res1);
		res1 = str.contains("Umesh");//it will check if substring is present in the main string
		System.out.println(res1);
		
		//5.endsWith()
		boolean res2 = str.endsWith("Tendulkar");//it will check if substring present at the end of the main string
		System.out.println(res2);
		res2 = str.endsWith("Pendulkar");//it will check if substring present at the end of the main string
		System.out.println(res2);
		
		//6.startsWith()
		boolean res3 = str.startsWith("Sachin");//it will check if substring present at the start of the main string
		System.out.println(res3);
		res3 = str.startsWith("Pachin");//it will check if substring present at the end of the main string
		System.out.println(res3);
		
		//7.getClass()
		Class class1 = str.getClass();//it will provide the root class path of the object
		System.out.println(class1);
		
		//8. hashCode()
		int hashCode = str.hashCode();//it will return the hash value of the given object
		System.out.println(hashCode);
		
		//9. indexOf()
		int index1 = str.indexOf('S');//it will provide the index of the specified character in the main string
		System.out.println(index1);
		index1 = str.indexOf('Z');//it will provide the index of the specified character in the main string
		System.out.println(index1);
		
		//10. isBlank()
		boolean res4 = str.isBlank();//checks if the string is empty or has only spaces
		System.out.println(res4);
		String str2 = "           ";
		res4 = str2.isBlank();//checks if the string is empty or has only spaces
		System.out.println(res4);
		String str3 = "";
		res4 = str3.isBlank();//checks if the string is empty or has only spaces
		System.out.println(res4);
		
		//11. isEmpty()
		boolean res5 = str.isEmpty();//checks if the string is empty
		System.out.println(res5);
		res5 = str2.isEmpty();
		System.out.println(res5);
		res5 = str3.isEmpty();
		System.out.println(res5);
		
		//12. lastIndexOf()
		int lastindex = str.lastIndexOf('e');//it will provide the last occurrence position of the specified character
		System.out.println(lastindex);
		lastindex = str.lastIndexOf('z');//it will provide the last occurrence position of the specified character
		System.out.println(lastindex);
		
		//13. replace()
		String replace = str.replace('S', '$');//It will replace the old character with new character
		System.out.println(replace);
		
		//14. substring(int start)
		String substring = str.substring(6);//provide the substring from the specified position
		System.out.println(substring);
		
		//15. substring(int start,int end)
		substring = str.substring(6,12);//provide the substring from the specified position to the specified position
		System.out.println(substring);
		
		//16. toUpperCase()
		String upperCase = str.toUpperCase();//it convert string to upper case
		System.out.println(upperCase);
		
		//17. toLowerCase()
		String lowerCase = str.toLowerCase();//it convert string to lower case
		System.out.println(lowerCase);
	}
}











