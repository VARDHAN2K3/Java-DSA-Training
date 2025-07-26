import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    int[] cnt = new int[256];
	    int max = 0;
	    char mfc = ' ';
	    for(char ch : str.toCharArray()){
	        cnt[ch]++;
	    }
	    for(char ch : str.toCharArray()){
	        if(cnt[ch] > max){
	            max = cnt[ch];
	            mfc = ch;
	        }
	    }
	        
	   System.out.println(mfc + ": " + max);
	}
}
