package preparation;

public class NonLuxuryItems implements Taxable {

	double price;
	public NonLuxuryItems(double price){
		this.price = price;
	}

	@Override
	public double computeTax() {
		// TODO Auto-generated method stub
		return price * 0.01;
	}

}
