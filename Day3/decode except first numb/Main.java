/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n=1234;
	    int s=0;
	    while(n>0){
	        int a = n%10;
	        s=s*10+a;
	        n/=10;
	    }
	    int f=s%10;
	    int res=0;
	    int c=0;
	    while(s>9){
	        int a=s%10;
	        s =s/10;
	        int b =s%10;
	        res = res*10+Math.abs(a-b);
	        c++;
	    }
	    System.out.println((int)(f*Math.pow(10,c)+res));
	}
}///run all possible test cases for the above program
//input:8357
//output:8522
