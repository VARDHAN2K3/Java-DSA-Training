import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++)
	        arr[i] = sc.nextInt();
	    int[] temp = Arrays.copyOf(arr, n);
	    Arrays.sort(temp);
	    int cnt = 0;
	    for(int i = 0; i < n; i++){
	        if(arr[i] != temp[i])
	            cnt++;
	    }
	    System.out.println(cnt);
	}
}
