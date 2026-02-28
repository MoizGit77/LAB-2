public class Product{
	private String ID,name;
	private double price;
	private int quantity;
	static int counter = 0;

   Product(String name,double price , int quantity){
	System.out.println(""+(++counter));
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	
}
	String getName(){
		return name;
}
	double getPrice(){
		return price;
}
	int getQuantity(){
		return quantity;
}
}