public class Main
{
	public static void main(String[] args) {
	    char chr = 'g';
	    System.out.println(chr >='A' && chr <= 'Z' ? (char)(chr+32) : (char)(chr-32));
	}
}
