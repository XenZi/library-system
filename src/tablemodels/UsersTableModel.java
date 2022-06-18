package tablemodels;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Member;

public class UsersTableModel extends AbstractTableModel {
	private final String[] columnNames = {"Card Number", "Name", "Surname", "Membership Extension", "Membership Extension", "Membership Type", "Membership Due Date", "Active"};
	
	private ArrayList<Member> userArray;
	
	public UsersTableModel() {
		super();
		this.userArray = new ArrayList<Member>();
	}
	
	public UsersTableModel(ArrayList<Member> list) {
		super();
		this.userArray = new ArrayList<Member>();
		userArray.addAll(list);
	}
	
	
	public void setUserArray(ArrayList<Member> userArray) {
		this.userArray = userArray;
		fireTableDataChanged();
	}

	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return userArray.size();
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
		if(rowIndex >= userArray.size()) return null;
		Member member = userArray.get(rowIndex);
		Object retVal = null;
		switch (columnIndex) {
			case 0: retVal = member.getCardNumber();	
					break;
			case 1: retVal = member.getFirstName();
					break;
			case 2: retVal = member.getLastName();
					break;
			case 3: retVal = member.getLastMembershipExtension();
					break;
			case 4: retVal = member.getMembershipDuration();
					break;
			case 5: retVal = member.getMembership().getType();
					break;
			case 6: retVal = member.getMembershipDueDate();
					break;
			case 7: retVal = member.isActive();
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

	public ArrayList<Member> getUserArray() {
		return userArray;
	}
	
	

}
