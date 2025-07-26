public class Main
{
    public static void main(String[] args){
        int a = 775;
        int years = a/365;
        int months = (a-(years*365))/30;
        int weeks = (a - (years*365)-(months*30))/7;
        int days = a - (years*365) - (months*30) - (weeks*7);
        System.out.print(years + " " + months + " " + weeks + " " + days);
    }
}