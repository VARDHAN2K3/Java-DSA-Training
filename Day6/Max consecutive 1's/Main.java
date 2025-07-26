public class Main
{
	public static void main(String[] args) {
	    int[] a = {1, 1, 0, 1, 1, 0, 1};
	    int maxCnt = 0;
	    int cnt = 0;
	    for(int val : a){
	        if(val == 1){
	            cnt++;
	            if(cnt > maxCnt)
	                maxCnt = cnt;
	        }
	        else
	            cnt = 0;
	    }
	    System.out.println(maxCnt);
	}
}
