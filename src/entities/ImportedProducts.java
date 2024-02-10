package entities;

public class ImportedProducts extends Product {
	
	private Double customsFee;
	
	public ImportedProducts() {
		super();
	}
	
	public ImportedProducts(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice(Double customsFee) {
		return price + customsFee;
	}
	
	@Override
	public final String priceTag() {
		return name +
				" $ "
				+ totalPrice(customsFee)
				+" (Customs fee: $ " + customsFee + " )";
	}

}
