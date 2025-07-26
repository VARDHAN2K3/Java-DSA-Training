public class Main
{
	public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder("Vardhan");
	    sb.append(" Allavari");
	    System.out.println(sb);
	    sb.insert(7, " Kumar");
	    System.out.println(sb);
	    sb.replace(7, 13, "      ");
	    System.out.println(sb);
	    sb.delete(7,13);
	    System.out.println(sb);
	    sb.reverse();
	    System.out.println(sb);
	    String fs = sb.toString();
	    System.out.println(fs);
	}
}
