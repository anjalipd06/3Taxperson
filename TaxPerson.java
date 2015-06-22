package preparation;

import java.util.ArrayList;
import java.util.List;

public class TaxPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TaxPerson taxperson = new TaxPerson();
		List<Taxable> items = new ArrayList<Taxable>();
		items.add(new NonLuxuryItems(100));
		items.add(new LuxuryItems(100));
		System.out.println("tax  " + taxperson.computeTax(items));
	}

	public double computeTax(List<Taxable> items){
		double tax = 0;
		for(Taxable item : items){
			tax += item.computeTax();
		}
		return tax;
	}
}
