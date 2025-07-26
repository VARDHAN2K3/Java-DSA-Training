
public class Main
{
	public static void main(String[] args) {
	    String str = "aeiouxyzws";
	    String s1 = str.substring(0, str.length()/2);
	    String s2 = str.substring(str.length()/2, str.length());
	    int cnt = 0;
	    for(int i = 0; i < s1.length(); i++)
	        if("aeiouAEIOU".indexOf(s1.charAt(i)) != -1)
	            cnt++;
	    for(int i = 0; i < s2.length(); i++)
	        if("aeiouAEIOU".indexOf(s2.charAt(i)) != -1)
	            cnt--;
	    System.out.println(Math.abs(cnt));
	}
}
