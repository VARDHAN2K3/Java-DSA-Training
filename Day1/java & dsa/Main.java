/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    int a;
    public static void main(String[] args) {
        // System.out.println("Byte:\n"+"Size:"+Byte.SIZE/8+" Min:"+Byte.MIN_VALUE+" Max:"+Byte.MAX_VALUE);
        // System.out.println("Integer:\n"+"Size:"+Integer.SIZE/8+" Min:"+Integer.MIN_VALUE+" Max:"+Integer.MAX_VALUE);
        // System.out.println("Long:\n"+"Size:"+Long.SIZE/8+" Min:"+Long.MIN_VALUE+" Max:"+Long.MAX_VALUE);
        // System.out.println("Float:\n"+"Size:"+Float.SIZE/8+" Min:"+Float.MIN_VALUE+" Max:"+Float.MAX_VALUE);
        // Main ob = new Main();
        // System.out.println(ob.a);
        // Integer a,b = 100;
        // Float c,d=2.5f;
        // System.out.println(a+""+b);
        // System.out.println(c+""+d);
        int a = 775;
        int b = a/365;
        System.out.print(b+" ");
        a = a - (b*365);
        b = a/30;
        System.out.print(b+" ");
        a = a - (b*30);
        b = a/7;
        System.out.print(b+" ");
        a = a-(b*7);
        System.out.print(a);
    }
}
