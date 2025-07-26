import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    String str = "Good Morning";
	    for(int i = 0; i < str.length(); i++){
	        char ch = str.charAt(i);
	        if(ch == ' ')
	            System.out.print(" ");
	        else if(Character.isLowerCase(ch))
	            System.out.print(Character.toUpperCase(str.charAt(i)));
	        else
	            System.out.print(Character.toLowerCase(str.charAt(i)));
	    }
	}
}
