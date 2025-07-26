//Project Title: Restaurant Billing System 
class FoodItem{
    String itemId;
    String itemName;
    double unitPrice;
    int quantity;
    double subTotal = 0.0;
    double gst;
    double dis = 0.0;
    FoodItem(String id, String name, double price, int q){
        itemId = id;
        itemName = name;
        unitPrice = price;
        quantity = q;
    }
    double calculateBill(){
        subTotal = unitPrice * quantity;
        if(subTotal > 1000.0)
            dis = subTotal * 0.1;
        gst =  subTotal * 0.05;
        double total = subTotal + gst - dis;
        return total;
    }
    void display(){
        double total = calculateBill();
        System.out.println("Food Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + dis);
        System.out.println("Total Bill: " + total);
    }
}

class DineIn extends FoodItem{
    final double serviceCharge = 50.0;
    DineIn(String id, String name, double price, int q){
        super(id, name, price, q);
    }
    @Override
    double calculateBill(){
        subTotal = unitPrice * quantity;
        if(subTotal > 1000.0)
            dis = subTotal * 0.1;
        gst = subTotal * 0.05;
        double total = subTotal + serviceCharge + gst - dis;
        return total;
    }
    @Override
    void display(){
        double total = calculateBill();
        System.out.println("Food Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + dis);
        System.out.println("Total Bill: " + total);
    }
}

class TakeAway extends FoodItem{
    final double packingCharge = 20.0;
    TakeAway(String id, String name, double price, int q){
        super(id, name, price, q);
    }
    @Override
    double calculateBill(){
        subTotal = unitPrice * quantity;
        if(subTotal > 1000.0)
            dis = subTotal * 0.1;
        gst = subTotal * 0.05;
        double total = subTotal + packingCharge + gst - dis;
        return total;
    }
    @Override
    void display(){
        double total = calculateBill();
        System.out.println("Food Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Packing Charge: " + packingCharge);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + dis);
        System.out.println("Total Bill: " + total);
    }
}

class Delivery extends FoodItem{
    final double deliveryFee = 40.0;
    Delivery(String id, String name, double price, int q){
        super(id, name, price, q);
    }
    @Override
    double calculateBill(){
        subTotal = unitPrice * quantity;
        if(subTotal > 1000.0)
            dis = subTotal * 0.1;
        gst = subTotal * 0.05;
        double total = subTotal + deliveryFee + gst - dis;
        return total;
    }
    @Override
    void display(){
        double total = calculateBill();
        System.out.println("Food Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Delivery Charge: " + deliveryFee);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + dis);
        System.out.println("Total Bill: " + total);
    }
}
public class Main
{
	public static void main(String[] args) {
	    DineIn di = new DineIn("F101", "Paneer Butter Masala", 250, 4);
	    di.display();
	    System.out.println();
	    TakeAway ta = new TakeAway("F102", "Veg Biryani", 180, 2);
	    ta.display();
	    System.out.println();
	    Delivery d = new Delivery("F103", "Chicken Pizza", 300, 4);
	    d.display();
	}
}