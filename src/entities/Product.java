package entities;

public class Product {
	
	private String name;
	private Double price;
	
	
	public String priceTag() {
		return name +
				" $ "
				+ price;
	}

}
