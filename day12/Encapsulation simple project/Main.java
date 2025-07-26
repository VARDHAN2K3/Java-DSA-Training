//Project Title: College Tech Fest Registration System using Java Encapsulation
class Participant{
    private int participantId;
    private String name;
    private double baseRegFee;
    private int noOfEvents;
    private double eventChargePerEvent;
    
    void setPartiDetails(int id, String name){
        participantId = id;
        this.name = name;
    }
    
    void setFeeStruct(double baseFee, int nEvents, double charge_event){
        baseRegFee = baseFee;
        noOfEvents = nEvents;
        eventChargePerEvent = charge_event;
    }
    
    void getDetails(){
        System.out.println("Participant Record");
        System.out.println("ID: " + participantId);
        System.out.println("Name: " + name);
        System.out.println("Base Registration Fee: " + baseRegFee);
        System.out.println("Event Charges: " + noOfEvents + " events @ " + eventChargePerEvent + "/event");
    }
    
    void calculateTotalFee(){
        double total = baseRegFee + (noOfEvents * eventChargePerEvent);
        System.out.println("Total Fee: " + total);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Participant obj = new Participant();
	    obj.setPartiDetails(505, "vardhan");
	    obj.setFeeStruct(200, 3, 100);
	    obj.getDetails();
	    obj.calculateTotalFee();
	}
}