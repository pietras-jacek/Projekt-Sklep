package Shop.Office.Administration;

import java.util.List;

import Shop.Office.Persons.Person;

public interface ManagerInterface<TEntity> {
	
	public TEntity get(int id);
	public List<TEntity> getAll();
	public boolean save(TEntity obj);
	public boolean delete(TEntity obj);
	
	/**
	 * inne metody
	 */

}
