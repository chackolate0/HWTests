import java.util.*;
public class Invoice {
	//Part number (String)
	//Part description (String)
	//Quantity of item being purchased (Int)
	//Price per item (Double)
String number;
String description;
int quantity;
double price;
	public String getNum() {
		return number;
	}
	public String getDesc() {
		return description;
	}
	public int getQuant() {
		if(quantity < 0) {
			return 0;
		}
		else{
			return quantity;
		}
	}
	public double getPrice() {
		if(price < 0) {
			return 0.00;
		}
		return price;
	}
	
	public double getInvoiceAmount() {
		if(quantity<0) {
			quantity = 0;
			return 0.00;
		}
		if(price<0) {
			price = 0.00;
			return 0.00;
		}
		else {
			return quantity * price;
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice iv = new Invoice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Making a new object of class Invoice:");
		System.out.print("Enter the part number:");
		iv.number = sc.nextLine();
		System.out.print("Enter the part description:");
		iv.description = sc.nextLine();
		System.out.print("Enter the Quantity of Items:");
		iv.quantity = sc.nextInt();
		System.out.println("Enter the Price Per Item with cents in decimals:");
		iv.price = sc.nextDouble();
		System.out.printf("\n");
		System.out.println("Using all the get methods the state of the object is:");
		System.out.println("The part number: " + iv.getNum());
		System.out.println("The part description: " + iv.getDesc());
		System.out.println("The Quantity of Items: " + iv.getQuant());
		System.out.println("The Price Per Item with cents in decimals: " + String.format("%.2f", iv.getPrice()));
		System.out.println("Using getInvoiceAmount the Invoice is: "+ String.format("%.2f", iv.getInvoiceAmount()));
		System.out.println("");
		System.out.println("Using the setters to mutate the object one step at a time:");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.println("Enter the new Price Per Item with cents in decimals:");
		iv.price = sc.nextDouble();
		System.out.println("Using all the get methods the state of the object is:");
		System.out.println("The part number: " + iv.getNum());
		System.out.println("The part description: " + iv.getDesc());
		System.out.println("The Quantity of Items: " + iv.getQuant());
		System.out.println("The Price Per Item with cents in decimals: " + String.format("%.2f", iv.getPrice()));
		System.out.println("Using getInvoiceAmount the Invoice is: "+ String.format("%.2f", iv.getInvoiceAmount()));
		System.out.println("");
		System.out.println("Enter the new Quantity of Items:");
		iv.quantity = sc.nextInt();
		System.out.println("Using all the get methods the state of the object is:");
		System.out.println("The part number: " + iv.getNum());
		System.out.println("The part description: " + iv.getDesc());
		System.out.println("The Quantity of Items: " + iv.getQuant());
		System.out.println("The Price Per Item with cents in decimals: " + String.format("%.2f", iv.getPrice()));
		System.out.println("Using getInvoiceAmount the Invoice is: "+ String.format("%.2f", iv.getInvoiceAmount()));
		System.out.println("");
		System.out.println("Enter the new part description:");
		iv.description = sc.next();
		System.out.println("Using all the get methods the state of the object is:");
		System.out.println("The part number: " + iv.getNum());
		System.out.println("The part description: " + iv.getDesc());
		System.out.println("The Quantity of Items: " + iv.getQuant());
		System.out.println("The Price Per Item with cents in decimals: " + String.format("%.2f", iv.getPrice()));
		System.out.println("Using getInvoiceAmount the Invoice is: "+ String.format("%.2f", iv.getInvoiceAmount()));
		System.out.println("");
		System.out.println("Enter the new part number:");
		iv.number=sc.next();
		System.out.println("Using all the get methods the state of the object is:");
		System.out.println("The part number: " + iv.getNum());
		System.out.println("The part description: " + iv.getDesc());
		System.out.println("The Quantity of Items: " + iv.getQuant());
		System.out.println("The Price Per Item with cents in decimals: " + String.format("%.2f", iv.getPrice()));
		System.out.println("Using getInvoiceAmount the Invoice is: "+ String.format("%.2f", iv.getInvoiceAmount()));
		System.out.println("");
		
	}

}
