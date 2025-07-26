public class Main
{
	public static void main(String[] args) {
	    String s = "Madam";
	    String str = "";
	    for(int i = s.length()-1; i >= 0; i--){
	        str += s.charAt(i);
	    }
	    System.out.println(s.equalsIgnoreCase(str));
	}
}
