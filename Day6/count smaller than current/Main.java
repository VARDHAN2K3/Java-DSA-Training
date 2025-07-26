import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int[] a = {8, 1, 2, 2, 3};
	    int[] stc = new int[a.length];
	    for(int i = 0; i < a.length; i++){
	        int count = 0;
	        for(int j = 0; j < a.length; j++){
                if(a[j] < a[i])
                    count++;
	        }
	        stc[i] = count;
	    }
	    System.out.print(Arrays.toString(stc));
	}
}
