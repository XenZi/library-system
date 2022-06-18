package tablemodels;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Book;
import model.Member;

public class BooksTableModel extends AbstractTableModel {
	private final String[] columnNames = {"Title", "Writer", "Release Date", "Language", "Genre"};
	
	private ArrayList<Book> bookArray;
	
	public BooksTableModel() {
		super();
		this.bookArray = new ArrayList<Book>();
	}
	
	public BooksTableModel(ArrayList<Book> list) {
		super();
		this.bookArray = new ArrayList<Book>();
		bookArray.addAll(list);
	}
	
	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return bookArray.size();
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
	 * "Title", "Writer", "Release Date", "Language", "Genre"
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(rowIndex >= bookArray.size()) return null;
		Book book = bookArray.get(rowIndex);
		Object retVal = null;
		switch (columnIndex) {
			case 0: retVal = book.getTitle();	
					break;
			case 1: retVal = book.getWriter();
					break;
			case 2: retVal = book.getReleaseDate();
					break;
			case 3: retVal = book.getOriginalLanguage();
					break;
			case 4: retVal = book.getGenre().getName();
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

	public ArrayList<Book> getBookArray() {
		return bookArray;
	}
	
	

}
