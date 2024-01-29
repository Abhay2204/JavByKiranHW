package Assignmnent1;

class InventoryItem{
	static int totalItems = 0;
	String itemName  ;
	int quantity ;
	public InventoryItem (String name, int quantity) {
        this.itemName = name;
        this.quantity = quantity;
        totalItems = totalItems + quantity;
    }
	public String getName() {
        return itemName;
    }
	public int getQuantity() {
        return quantity;
    }
	public void addToInventory(int amount) {
        this.quantity =quantity+ amount; 
        InventoryItem.totalItems = InventoryItem.totalItems + amount; 
}
	public void removeFromInventory(int amount) {
        if (amount > this.quantity) {
            System.out.println("Cannot remove " + amount + " items, only " + this.quantity + " available.");
        } else {
            this.quantity = this.quantity - amount; 
            InventoryItem.totalItems =  InventoryItem.totalItems- amount; 
        }
	}
	 public static int getTotalItems() {
	        return totalItems;
	    }
	}
public class Inventory{
	public static void main(String args[]) {
		InventoryItem item1 = new InventoryItem("java",40);
		InventoryItem item2 = new InventoryItem("c++",20);
		InventoryItem item3 = new InventoryItem("python",70);
		 item1.addToInventory(7);
	     item2.addToInventory(1);
	     item3.removeFromInventory(4);
	        System.out.println("Total items in stock: " + InventoryItem.getTotalItems());
	        System.out.println("Item 1 " + item1.getName() + " "+  item1.getQuantity());
	        System.out.println("Item 2 " + item2.getName() +" "+ item2.getQuantity());
	        System.out.println("Item 3 " + item3.getName()  +" "+ item3.getQuantity());
	}
}
