/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//find the area of triangle using herons formula;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int a = Integer.parseInt(br.readLine());
	        int b = Integer.parseInt(br.readLine());
	        int c = Integer.parseInt(br.readLine());
	        int s = (a+b+c)/2;
	        System.out.printf("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	    }catch(Exception e) {
	        System.out.println("Something Went wrong");
	    }
	    
	}
}
