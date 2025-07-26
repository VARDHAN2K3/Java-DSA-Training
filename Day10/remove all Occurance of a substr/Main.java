import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    String rem = sc.next();
	    String[] res = str.trim().split(rem);
	    for(String strs : res){
	        if(!strs.isEmpty())
	            System.out.print(strs);
	    }
	}
}
