/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String str = "$sgsbd**hg";
		int l = str.length();
		int i = 0,c = 0;
		while(i < l){
		    char ch = str.charAt(i);
		    if(ch == ' ') System.out.print(" ");
		    else if(c == 0 && ch >= 'a' && ch <= 'z') System.out.print(ch);
		    else if(c > 0 && ch >= 'a' && ch <= 'z'){
		        c--;
		    }
		    else c++;
		    i++;
		}
	}
}
