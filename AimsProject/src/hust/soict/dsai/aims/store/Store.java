package hust.soict.dsai.aims.store;

//import java.util.*;
import java.util.ArrayList;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public  ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	
	public void addDVD(DigitalVideoDisc dvd)
	{
		itemsInStore.add(dvd);
	}
	
	public void removeDVD(DigitalVideoDisc dvd)
	{
		itemsInStore.remove(dvd);
	}

	public void printlist()
	{
		for (DigitalVideoDisc x: itemsInStore)
			System.out.println(x.toString());
	}
}


