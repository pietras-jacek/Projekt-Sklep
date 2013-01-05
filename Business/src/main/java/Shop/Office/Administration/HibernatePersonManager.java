package Shop.Office.Administration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Shop.Office.Persons.Person;

public class HibernatePersonManager implements ManagerInterface<Person>{

Session session;

public HibernatePersonManager(Session session)
{
	this.session=session;
}

public Person get(int id) {

	List<Person> result = 
			session.getNamedQuery("Person.id").setInteger("id", id).list();
	if(result.size()==0)
		return null;

	Person returnValue = new Person(
			result.get(0).getName(), 
			result.get(0).getPesel(),
			result.get(0).getAddress());
	returnValue.setId(result.get(0).getId());
	return returnValue;
}

public List<Person> getAll() {
	List<Person> result =
			session.getNamedQuery("Person.all").list();
	return result;
}

public boolean save(Person obj) {

	try{
		session.beginTransaction();
		session.persist(obj);
		session.getTransaction().commit();
		return true;
	}catch(Exception ex){}

	return false;
}

public boolean delete(Person obj) {

	try
	{
		session.beginTransaction();
		session.getNamedQuery("Person.delete")
		.setInteger("id", obj.getId())
		.executeUpdate();

		session.getTransaction().commit();
		return true;
	}catch(Exception ex)
	{}

	return false;
}

}