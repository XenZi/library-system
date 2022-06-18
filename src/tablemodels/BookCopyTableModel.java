package tablemodels;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.BookCopy;

@SuppressWarnings("serial")
public class BookCopyTableModel extends AbstractTableModel {
private final String[] columnNames = {"Book", "Binding", "Language", "Page Numbers", "Rented"};
	
	private ArrayList<BookCopy> copies;
	
	public BookCopyTableModel() {
		super();
		this.copies = new ArrayList<BookCopy>();
	}
	
	public BookCopyTableModel(ArrayList<BookCopy> list) {
		super();
		this.copies = new ArrayList<BookCopy>();
		copies.addAll(list);
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return copies.size();
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
	 * "Book", "Binding", "Language", "Page Numbers", "Rented"
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(rowIndex >= copies.size()) return null;
		BookCopy rental = copies.get(rowIndex);
		Object retVal = null;
		switch (columnIndex) {
			case 0: retVal = rental.getBook().getTitle();
					break;
			case 1: retVal = rental.getBinding();
					break;
			case 2: retVal = rental.getPrintingLanguage();
					break;
			case 3: retVal = rental.getPageNumbers();
					break;
			case 4: retVal = rental.isRented();
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

	public ArrayList<BookCopy> getRentals() {
		return copies;
	}
}
