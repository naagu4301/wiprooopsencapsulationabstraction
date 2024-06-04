package wipro_oops.com;

public class book{
	private String name;
	private author a;
	private double price;
	private int qtyInStock;
	public book(String name, author a, double price, int qtyInStock) {
	        this.name = name;
	        this.a= a;
	        this.price = price;
	        this.qtyInStock = qtyInStock;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public author getAuthor() {
	        return a;
	    }

	    public void setAuthor(author a) {
	        this.a =a;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getQtyInStock() {
	        return qtyInStock;
	    }

	    public void setQtyInStock(int qtyInStock) {
	        this.qtyInStock = qtyInStock;
	    }
	}


