//Project Title: Movie Ticket Booking System using Java Abstraction
abstract class Movie{
    String movieId;
    String title;
    double ticketPrice;
    int nTickets;
    double gst;
    Movie(String id, String title, double price, int nTickets){
        movieId = id;
        this.title = title;
        ticketPrice = price;
        this.nTickets = nTickets;
    }
    abstract double calculatePrice();
    abstract void displayDetails();
}

class TeluguMovie extends Movie{
    TeluguMovie(String id, String title, double price, int nTickets){
        super(id, title, price, nTickets);
        
    }
    double calculatePrice(){
        double preTotal = ticketPrice * nTickets;
        gst = preTotal * 0.05;
        return preTotal + gst;
    }
    void displayDetails(){
        System.out.println("Movie Record");
        System.out.println("ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + nTickets);
        if(nTickets <= 6)
            System.out.println("Total Price: " + calculatePrice());
        else
            System.out.println("Booking Failed: Cannot book more than 6 Tickets");
    }
}

class HindiMovie extends Movie{
    HindiMovie(String id, String title, double price, int nTickets){
        super(id, title, price, nTickets);
        
    }
    double calculatePrice(){
        double preTotal = ticketPrice * nTickets;
        preTotal = preTotal - (preTotal * 0.1);
        gst = preTotal * 0.05;
        return preTotal + gst;
    }
    void displayDetails(){
        System.out.println("Movie Record");
        System.out.println("ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + nTickets);
        if(nTickets <= 6)
            System.out.println("Total Price: " + calculatePrice());
        else
            System.out.println("Booking Failed: Cannot book more than 6 Tickets");
    }
}

class EnglishMovie extends Movie{
    EnglishMovie(String id, String title, double price, int nTickets){
        super(id, title, price, nTickets);
        
    }
    double calculatePrice(){
        double preTotal = ticketPrice * nTickets;
        preTotal = preTotal + (nTickets * 50);
        gst = preTotal * 0.05;
        return preTotal + gst;
    }
    void displayDetails(){
        System.out.println("Movie Record");
        System.out.println("ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + nTickets);
        if(nTickets <= 6)
            System.out.println("Total Price: " + calculatePrice());
        else
            System.out.println("Booking Failed: Cannot book more than 6 Tickets");
    }
}

public class Main
{
	public static void main(String[] args) {
	    TeluguMovie tm = new TeluguMovie("M101", "RRR", 150, 3);
	    tm.displayDetails();
	    System.out.println();
	    HindiMovie hm = new HindiMovie("M102", "Pathaan", 200, 2);
	    hm.displayDetails();
	    System.out.println();
	    EnglishMovie em = new EnglishMovie("M103", "Avengers", 250, 7);
	    em.displayDetails();
	}
}