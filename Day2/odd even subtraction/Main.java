/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int num = 123456;
	    String even = "", odd = "";
	    while(num > 0){
	        Integer a = num % 10;
	        if(a % 2 == 0)  even = a.toString() + even;
	        else    odd = a.toString() + odd;
	        num = num / 10;
	    }
	    int e = even.length() == 0 ? 0 : Integer.parseInt(even);
	    int o = odd.length() == 0 ? 0 : Integer.parseInt(odd);
	    System.out.println(e-o);
	}
}
