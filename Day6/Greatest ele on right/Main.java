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
	    int[] b = new int[n];
	    for(int i = 0; i < n-1; i++){
	        int[] rightEle = Arrays.copyOfRange(arr, i+1, n);
	        int max = rightEle[0];
	        for(int j = 1; j < rightEle.length; j++){
	            if(rightEle[j] > max)
	                max = rightEle[j];
	        }
	        b[i] = max;
	    }
	    b[n-1] = -1;
	    System.out.println(Arrays.toString(b));
	}
}
