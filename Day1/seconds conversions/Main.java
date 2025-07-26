/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int total = 3600;
	    int hours = total/3600;
	    int min = (total - (hours * 3600))/60;
	    int sec = total - (hours * 3600) - (min * 60);
	    System.out.print(hours+" "+min + " " + sec);
	}
}
