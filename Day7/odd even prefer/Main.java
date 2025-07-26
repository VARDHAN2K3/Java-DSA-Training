import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int[] a = { 3, 1, 2, 4};
	    int[] b = new int[a.length];
	    int c = 0;
	    for(int val : a){
	        if(val % 2 == 1)
	            c++;
	    }
	    for(int i = 0, j = 0, k = a.length - c; i < a.length; i++){
	        if(a[i] % 2 == 0)
	            b[j++] = a[i];
	        else
	            b[k++] = a[i];
	    }
	    System.out.println(Arrays.toString(b));
	}
}
