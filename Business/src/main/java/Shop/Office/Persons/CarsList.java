package Shop.Office.Persons;

import java.util.*;

import Shop.Office.Cars.Car;


class CarsList implements Collection<Car>{

	private List<Car> cars=new ArrayList<Car>();
	private Person owner;
	
	public CarsList(Person owner)
	{
		this.owner=owner;
	}
	
	
	public int size() {
		return cars.size();
	}

	
	public boolean isEmpty() {
		return cars.isEmpty();
	}


	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return cars.contains(o);
	}

	
	public Iterator<Car> iterator() {
		// TODO Auto-generated method stub
		return cars.iterator();
	}

	
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return cars.toArray();
	}

	
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return cars.toArray(a);
	}

	
	public boolean add(Car e) {
		// TODO Auto-generated method stub
		e.setOwner(owner);
		return cars.add(e);
	}

	
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return cars.remove(o);
	}

	
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return cars.containsAll(c);
	}

	
	public boolean addAll(Collection<? extends Car> c) {
		
		for(Car car : cars)
		{
			car.setOwner(owner);
		}
		
		return cars.addAll(c);
	}

	
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return cars.removeAll(c);
	}

	
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return cars.retainAll(c);
	}

	
	public void clear() {
		// TODO Auto-generated method stub
		cars.clear();
	}

	

}
