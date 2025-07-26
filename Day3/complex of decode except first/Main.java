/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n=7352964;
	    int temp =n;
	    int s=0;
	    while(n>0){
	        int a = n%10;
	        s=s*10+a;
	        n/=100;
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
	    int first = (int)(f*Math.pow(10,c)+res);
	    s=0;
	    while(temp>0){
	        int a = temp%10;
	        s=s*10+a;
	        temp/=10;
	    }
	    s/=10;
	    f=s%10;
	    res=0;
	    c=0;
	    while(s>99){
	        int a=s%10;
	        s =s/100;
	        int b =s%10;
	        res = res*10+Math.abs(a-b);
	        c++;
	    }
	    int second = (int)(f*Math.pow(10,c)+res);
	    System.out.print(first+" "+second+"="+""+(first-second));
	}
}///run all possible test cases for the above program
//input:8357
//output:8522
