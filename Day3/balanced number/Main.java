public class Main
{
	public static void main(String[] args) {
	    int n=1234006;
	    int c=0;
	    int temp =n;
	    while(temp >0){
	        int a = temp%10;
	        temp /= 10;
	        c++;
	    }
	    temp =n;
	    if (c%2!=0){
	        int f1 =temp/(int)Math.pow(10,(c/2));
	        System.out.println(f1);
	    }
	}
}
