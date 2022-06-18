package tablemodels;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.MembershipFee;

public class MembershipTableModel extends AbstractTableModel {
private final String[] columnNames = {"Type", "Price"};
	
	private ArrayList<MembershipFee> memberships;
	
	public MembershipTableModel(ArrayList<MembershipFee> list) {
		super();
		this.memberships = new ArrayList<MembershipFee>();
		memberships.addAll(list);
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return memberships.size();
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
		if(rowIndex >= memberships.size()) return null;
		MembershipFee membership = memberships.get(rowIndex);
		Object retVal = null;
		switch (columnIndex) {
			case 0: retVal = membership.getType();	
					break;
			case 1: retVal = membership.getPrice();
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
