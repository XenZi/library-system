package tablemodels;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Book;
import model.Genre;

@SuppressWarnings("serial")
public class GenresTableModel extends AbstractTableModel {
	private final String[] columnNames = {"Name", "Description"};
	
	private ArrayList<Genre> genres;
	
	public GenresTableModel(ArrayList<Genre> list) {
		super();
		this.genres = new ArrayList<Genre>();
		genres.addAll(list);
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return genres.size();
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
	 * "Name", "Description", "Deleted"
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(rowIndex >= genres.size()) return null;
		Genre genre = genres.get(rowIndex);
		Object retVal = null;
		switch (columnIndex) {
			case 0: retVal = genre.getName();	
					break;
			case 1: retVal = genre.getDescription();
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
}
