package Adapters;

import Entities.concretes.Customer;
import business.abstracts.ICustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;

import java.rmi.RemoteException;


import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

		boolean result = false;

		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
