import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int len = s.nextInt();
	    int[] arr = new int[len];
	    for(int i = 0; i < len; i++)
	        arr[i] = s.nextInt();
	    int sum = 0;
	    System.out.print(arr[0] + " ");
	    for(int i = 1; i < len; i++){
	        sum += arr[i-1];
	        System.out.print(sum + " ");
	    }
	}
}
