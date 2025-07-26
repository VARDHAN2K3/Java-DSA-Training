public class Main
{
	public static void main(String[] args) {
	    String str1 = "Vardhan";
	    String str2 = "Vllavari";
	    System.out.println("Length: " + str1.length());
	    System.out.println("Char at 1: " + str1.charAt(1));
	    System.out.println("Sub String: " + str1.substring(2));
	    
	    System.out.println("Sub String from 2 to 7: " + str1.substring(2, 7));
	    System.out.println("To lower case: " + str1.toLowerCase());
	    System.out.println("To upper case: " + str1.toUpperCase());
	    
	    System.out.println("Trim: " + str2.trim());
	    System.out.println("Equals: " + str1.equals(str2));
	    System.out.println("Equals ignore case: " + str1.equalsIgnoreCase(str2));
	    
	    System.out.println("Compare to: " + str1.compareTo(str2));
	    System.out.println("Contains: " + str1.contains("dha"));
	    System.out.println("replace: " + str1.replace('a', '@'));
	    
	    String[] parts = "   Vardhan Allavari   ".trim().split(" ");
	    System.out.println("First: " + parts[0] + " Sencond: " + parts[1]);
	    
	    System.out.println("index of: " + str2.indexOf("r"));
	    System.out.println("last index of: " + str2.lastIndexOf("a"));
	    System.out.println("Starts with: " + str2.startsWith("All"));
	    System.out.println("Ends with: " + str2.endsWith("ari"));
	    
	}
}
