package tablemodels;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Book;
import model.RentBook;

public class RentalsTableModel extends AbstractTableModel {
	private final String[] columnNames = {"Member", "Staff", "Rental Date", "Returning Date", "No. Books"};
	
	private ArrayList<RentBook> rentals;
	
	public RentalsTableModel() {
		super();
		this.rentals = new ArrayList<RentBook>();
	}
	
	public RentalsTableModel(ArrayList<RentBook> list) {
		super();
		this.rentals = new ArrayList<RentBook>();
		rentals.addAll(list);
	}
	
	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return rentals.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	/*
	 * "Member", "Staff", "Rental Date", "Returning Date", "No. Books"
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(rowIndex >= rentals.size()) return null;
		RentBook rental = rentals.get(rowIndex);
		Object retVal = null;
		switch (columnIndex) {
			case 0: retVal = rental.getMember().getFirstName();
					break;
			case 1: retVal = rental.getLibrerian().getUsername();
					break;
			case 2: retVal = rental.getRentalDate();
					break;
			case 3: retVal = rental.getReturningDate();
					break;
			case 4: retVal = rental.getRentedBooks().size();
					break;
			default:
					retVal = null;
		}
		return retVal;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
	public String[] getColumnNames() {
		return columnNames;
	}

	public ArrayList<RentBook> getRentals() {
		return rentals;
	}
}
