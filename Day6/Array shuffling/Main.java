import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a = {2, 5, 1, 3, 4, 7};
	    int n = 3;
	    for(int i = 0; i < n; i++)
	        System.out.print(a[i] + " " + a[n+i] + " ");
	}
}
