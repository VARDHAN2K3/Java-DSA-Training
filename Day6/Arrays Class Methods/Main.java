/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++)
	        a[i] = s.nextInt();
	    // Sort(Array)
	    Arrays.sort(a);
	    // toString(Array)
	    System.out.println(Arrays.toString(a));
	    // equals
	    int[] b = new int[n];
	    for(int i = 0; i < n; i++)
	        b[i] = s.nextInt();
	    System.out.println(Arrays.equals(a, b));
	    // copyOf
	    int[] c = Arrays.copyOf(a, 7);
	    System.out.println("Copy Elements are:" + Arrays.toString(c));
	    // copy of range
	    int[] d = Arrays.copyOfRange(a, 0, 4);
	    System.out.println("Copy of Range Elements are:" + Arrays.toString(d));
	    // fill 
	    int[] e = new int[n];
	    Arrays.fill(e, 10);
	    System.out.println("Filled are:" + Arrays.toString(e));
	    // Binary search
	    System.out.println("Index: " + Arrays.binarySearch(a, 4));
	    // deep equals
	    int[][] mat1 = {{1, 2, 3}, {3, 2, 1}};
	    int[][] mat2 = {{1, 2, 3}, {3, 2, 4}};
	    System.out.println(Arrays.deepEquals(mat1, mat2));
	}
}
