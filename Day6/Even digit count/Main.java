public class Main
{
	public static void main(String[] args) {
	    int[] a = {12, 345, 2, 6, 7896};
	    int count = 0;
	    for(int val : a){
	        String str = Integer.toString(val);
	        if(str.length() % 2 == 0)
	            count++;
	    }
	    System.out.print(count);
	}
}
