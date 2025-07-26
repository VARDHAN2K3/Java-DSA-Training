public class Main
{
	public static void main(String[] args) {
	    String str = "Hi, hello how are you?";
	    String[] strs = str.trim().split(" ");
	    for(String s : strs){
	        System.out.print(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase()+ " ");
	    }
	}
}