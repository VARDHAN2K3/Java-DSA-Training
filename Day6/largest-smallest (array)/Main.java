import java.util.Scanner;
public class Main
{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        int large = arr[0];
        for(int i = 1; i < size/2; i++)
            if(arr[i] > large)
                large = arr[i];
                
        int small = arr[size/2];
        for(int i = size/2 + 1; i < size; i++)
            if(arr[i] < small)
                small = arr[i];
        System.out.println(large - small);
	}
}