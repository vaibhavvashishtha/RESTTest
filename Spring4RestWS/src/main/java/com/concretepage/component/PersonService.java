package com.concretepage.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.concretepage.Address;
import com.concretepage.Person;

@Component
public class PersonService implements IPersonService {
	@Override
	public Person getPersonDetail(Integer id){
		Person p = new Person();
		p.setId(id);
		p.setLocation("Delhi");
		p.setName("Vaibhav");
		
		List<String> siblings = new ArrayList<String>();
		siblings.add("Swati");
		siblings.add("Shalini");
		p.setSiblings(siblings);
		
		Address address = new Address();
		address.setHouseNo("1461");
		address.setStreetName("Faridabad");
		p.setAdress(address);
		return p;
	}
}
