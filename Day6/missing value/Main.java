/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] a = {2, 0, 1,4};
	    int sum = 0;
	    for(int val : a){
	        sum += val;
	    }
	    int n = a.length;
	    int missingValue = (n * (n + 1) / 2) - sum;
	    System.out.print(missingValue);
	}
}
