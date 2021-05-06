package business.concretes;

import Entities.concretes.Customer;
import business.abstracts.ICustomerCheckService;
import business.abstracts.ICustomerService;

public class StarbucksCustomerManager extends BaseCustomerManager {

	 
	private ICustomerCheckService icustomerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.icustomerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer)
	{
		if (icustomerCheckService.CheckIfRealPerson(customer)) {
			
			super.Save(customer);
			
		}
		else
		{		System.out.println("Not a valid person");
		
}
	}
	
	
	
	

}
