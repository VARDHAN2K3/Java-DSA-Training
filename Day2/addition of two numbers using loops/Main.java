/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int ch = 1;
	    while(ch == 1){
	        int a = s.nextInt();
	        int b = s.nextInt();
	        System.out.println("Addition of " + a +" and " + b + " is:" + (a+b));
	        System.out.print("Do you want to continue: ");
	        ch = s.nextInt();
	    }
	}
}
