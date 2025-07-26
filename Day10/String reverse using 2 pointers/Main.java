import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int l = 0, r = str.length()-1;
        char[] Schars = str.toCharArray();
        while(l < r){
            char temp = Schars[l];
            Schars[l] = Schars[r];
            Schars[r] = temp;
            l++;
            r--;
        }
        for(char ch : Schars)
            System.out.print(ch);
	}
}
