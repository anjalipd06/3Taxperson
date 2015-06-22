package preparation;

public class LuxuryItems implements Taxable{
	double price;
	public LuxuryItems(double price){
		this.price = price;
	}

	@Override
	public double computeTax() {		
		return price * .09;
	}

}
