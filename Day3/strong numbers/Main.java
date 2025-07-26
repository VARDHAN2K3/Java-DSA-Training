/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int fact(int n){
        if(n == 1 || n == 0)    return 1;
        int res = 1;
        for(int i = n; i > 1; i--)
            res *= i;
        return res;
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int l = s.nextInt();
	    int h = s.nextInt();
	    System.out.println("Strong Numbers are");
	    for(int i = l; i <= h; i++){
	        int temp = i;
    	    int sum = 0;
    	    while(temp > 0){
    	        int a = temp % 10;
    	        sum += fact(a);
    	        temp /= 10;
    	    }
    	    if(sum == i)    System.out.println(i);
	    }
	}
}
