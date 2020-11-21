package server.Model;
import java.util.ArrayList;
public class Shop {
	
	private Inventory theInventory;
	private SupplierList theSuppliers;

	
	public Shop (Inventory inventory, SupplierList suppliers) {
		
		theInventory = inventory;
		theSuppliers = suppliers;
		
	}
	
	public Inventory getTheInventory () {
		return theInventory;
	}
	public void setTheInventory (Inventory inventory) {
		theInventory = inventory;
	}
	
	

	public void listAllItems() {
		System.out.println(theInventory);
		
	}
	public String decreaseItem (String name) {
		if (theInventory.manageItem(name) == null)
			return "Couldn't not decrease item quantity!\n";
		else
			return "Item quantity was decreased!\n";
	}

	public void listAllSuppliers() {
		theSuppliers.listAllSuppliers();
	}

	public String getItem(String name) {
		// TODO Auto-generated method stub
		Item theItem = theInventory.searchForItem(name);
		if (theItem == null)
		     return "Item " + name + " could not be found!";
		else
			 return outputItem (theItem);
			
	}

	public String getItem(int id) {
		// TODO Auto-generated method stub
		Item theItem = theInventory.searchForItem(id);
		if (theItem == null)
		     return "Item number " + id + " could not be found!";
		else
			return outputItem (theItem);
			 
		
	}
	
	private String outputItem (Item theItem){
		return "The item information is as follows: \n" + theItem;
	}

	public String getItemQuantity(String name) {
		// TODO Auto-generated method stub
		int quantity = theInventory.getItemQuantity(name);
		if (quantity < 0)
		    return "Item " + name + " could not be found!";
		else
			return "The quantity of Item " + name + " is: " + quantity + "\n";
	}

	public String printOrder() {
		// TODO Auto-generated method stub
		
		return theInventory.printOrder();
	}

	

}
