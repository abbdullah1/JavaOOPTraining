package youTubeDemo_;


public class CustomerManager {
	private ICreditManager creditManager;
	private Customer customer;
	public CustomerManager(Customer customer,ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager=creditManager;
	}
public void GiveCredit() {
	this.creditManager.calculate();
	System.out.println("Credit Gived");
}
}
