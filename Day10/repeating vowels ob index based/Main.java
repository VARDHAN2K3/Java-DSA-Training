public class Main
{
	public static void main(String[] args) {
	    String str = "hello";
	    String res = "";
	    for(int i = 0; i < str.length(); i++){
	        char ch = str.charAt(i);
	        if("aeiouAEIOU".indexOf(ch) != -1){
	            for(int j = 0; j < i; j++)
	                res += ch;
	        }
	        res += ch;
	        
	    }
	    System.out.println(res);
	}
}
