//Name:Andrew Dimarogonas
//Student ID:1212736250
//Class: CSE360 W-9:45

package cse360assign2;

public class AddingMachine {
	private int total;
	private String transHistory;
	/**
	 * initializes initial variables
	 */
	public AddingMachine() {
		total=0;//not required to but kept for clarity
		transHistory="0";
	}
	/**
	 * Returns total
	 * @return
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * adds to total
	 * @param value
	 */
	public void add(int value) {
		transHistory += " + " + value; //adds value and operation type to string
		total+=value;
	}
	/**
	 * subtracts from total
	 * @param value
	 */
	public void subtract(int value) {
		transHistory += " - " + value;//adds value and operation type to string
		total-=value;
	}
	/**
	 * returns entire history of operations
	 */
	public String toString() {
		return transHistory;
	}
	/**
	 * clears entire history of operations and the total
	 */
	public void clear() {
		total=0;
		transHistory="0";//resets object to defaults
	}
}
