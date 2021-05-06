package business.concretes;

import Entities.concretes.Customer;
import business.abstracts.ICustomerCheckService;
import business.abstracts.ICustomerService;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

	

}
