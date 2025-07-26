public class Main
{
	public static void main(String[] args) {
	    String str = "karthik";
	    String vowels = "aeiouAEIOU";
	    int c = 0, v = 0;
	    for(int i = 0; i < str.length(); i++){
	        if(vowels.indexOf(str.charAt(i)) == -1)
	            c++;
	        else
	            v++;
	    }
	    System.out.println("Consonents count is: " + c +"\n" + "Vowels count is: " + v);
	}
}
