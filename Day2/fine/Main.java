/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int days = 12;
	    int total = 0;
        if(days <= 0)   System.out.println("Invalid");
        else{
            if(days <= 5)   System.out.println(days * 2);
            else if(days <= 10) System.out.println(10+(3*(days-5)));
            else    System.out.println(25 + (5 * (days -10)));
        }
	}
}
