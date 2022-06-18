package tablemodels;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Member;
import model.Staff;

public class StaffTableModel extends AbstractTableModel {
	private final String[] columnNames = {"Role", "Username", "Name", "Paycheck"};
	
	private ArrayList<Staff> staffArray;
	
	public StaffTableModel() {
		super();
		this.staffArray = new ArrayList<Staff>();
	}
	
	public StaffTableModel(ArrayList<Staff> list) {
		super();
		this.staffArray = new ArrayList<Staff>();
		staffArray.addAll(list);
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return staffArray.size();
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

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(rowIndex >= staffArray.size()) return null;
		Staff staff = staffArray.get(rowIndex);
		Object retVal = null;
		switch (columnIndex) {
			case 0: retVal = staff.getId().charAt(0) == 'A' ? "Admin" : "Librerian";
					break;
			case 1: retVal = staff.getUsername();
					break;
			case 2: retVal = staff.getFirstName();
					break;
			case 3: retVal = staff.getPaycheck();
					break;
			default:
					retVal = null;
		}
		return retVal;
	}
	
	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
	public String[] getColumnNames() {
		return columnNames;
	}
}
