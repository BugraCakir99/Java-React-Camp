package business.concretes;


import Entities.concretes.Customer;
import business.abstracts.ICustomerService;

public abstract class  BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer){
		
		
	System.out.println("Customer added to dB:"+customer.getNationalityId());
		
	}

	
}
