package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import tablemodels.BookCopyTableModel;
import tablemodels.BooksTableModel;
import tablemodels.GenresTableModel;
import tablemodels.MembershipTableModel;
import tablemodels.RentalsTableModel;
import tablemodels.StaffTableModel;
import tablemodels.UsersTableModel;

public class Window extends JFrame {
	private JTabbedPane tabbedPane;
	
	private JPanel usersPanel;
	private JPanel booksPanel;
	private JPanel staffPanel;
	private JPanel booksCopyPanel;
	private JPanel rentalsPanel;
	private JPanel genresPanel;
	private JPanel membershipPanel;
	private JPanel libraryPanel;
	
	private JTable usersTable;
	private JTable booksTable;
	private JTable staffTable;
	private JTable rentalsTable;
	private JTable bookCopyTable;
	private JTable genresTable;
	private JTable membershipTable;
	
	private RentalsTableModel rentalsTableModel;
	private UsersTableModel usersTableModel;
	private BooksTableModel booksTableModel;
	private StaffTableModel staffTableMode;
	private BookCopyTableModel bookCopyTableModel;
	private GenresTableModel genresTableModel;
	private MembershipTableModel membershipTableModel;
	
	private JScrollPane rentalsScrollPane;
	private JScrollPane usersScrollPane;
	private JScrollPane booksScrollPane;
	private JScrollPane staffScrollPane;
	private JScrollPane copyBooksScrollPane;
	private JScrollPane genreScrollPane;
	private JScrollPane membershipScrollPane;
	
	private JPanel usersBackPanel;
	private JPanel booksBackPanel;
	private JPanel staffBackPanel;
	private JPanel rentalsBackPanel;
	private JPanel booksCopyBackPanel;
	private JPanel genreBackPanel;
	private JPanel membershipBackPanel;
	private JPanel libraryBackPanel;
	
	private JButton addUser;
	private JButton removeUser;
	private JButton updateUser;
	private JButton viewUser;
	private JButton extendUser;
	
	private JButton addBook;
	private JButton removeBook;
	private JButton updateBook;
	private JButton viewBook;
	
	private JButton addStaff;
	private JButton removeStaff;
	private JButton updateStaff;
	private JButton viewStaff;
	
	private JButton addRental;
	private JButton updateRental;
	private JButton viewRental;
	private JButton removeRental;
	
	private JButton addBookCopy;
	private JButton removeBookCopy;
	private JButton updateBookCopy;
	private JButton viewBookCopy;
	
	private JButton addGenre;
	private JButton removeGenre;
	private JButton editGenre;
	private JButton viewGenre;
	
	private JButton addMembership;
	private JButton removeMembership;
	private JButton updateMembership;
	private JButton viewMembership;
	
	private JButton updateLibrary;
	
	private JLabel lblTitle, lblAddress, lblPhoneNumber, lblWorkingTime;
	private JTextField txtTitle, txtAddress, txtPhoneNumber, txtWorkingTime;
	
	public Window() {
		setTitle("Biblioteka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(800, 600);
		setLocationRelativeTo(null);
		
		createTabbedPanels();	
		
	}
	
	public void createTabbedPanels() {
		tabbedPane = new JTabbedPane();
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		usersPanel = new JPanel(false);
		usersPanel.setLayout(new BorderLayout());
		tabbedPane.addTab("Users",null, usersPanel, "Show all users");
		
		booksPanel = new JPanel(false);
		tabbedPane.addTab("Books", null, booksPanel, "Show all books");
		
		staffPanel = new JPanel(false);
		tabbedPane.addTab("Staff", null, staffPanel, "Show all staff");
		
		rentalsPanel = new JPanel(false);
		tabbedPane.addTab("Rentals", null, rentalsPanel, "Show all rentals");

		booksCopyPanel = new JPanel(false);
		tabbedPane.addTab("Books Copy", null, booksCopyPanel, "Show all books copy");

		genresPanel = new JPanel(false);
		tabbedPane.addTab("Genres", null, genresPanel, "Show all genres");
		
		membershipPanel = new JPanel(false);
		tabbedPane.addTab("Membership", null, membershipPanel, "Show all memberships");
		
		libraryPanel = new JPanel(false);
		tabbedPane.addTab("Library", null, libraryPanel, "Show library info");
		
		createTables();
		createUsersBackPanel();
		createBooksBackPanel();
		createStaffBackPanel();
		createRentalsBackPanel();
		createBooksCopyBackPanel();
		createGenresBackPanel();
		createMembershipBackPanel();
		createLibraryInterface();
	}
	private JPanel createLibraryBackPanel() {
		libraryBackPanel = new JPanel();
		libraryBackPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Library Actions", TitledBorder.LEFT, TitledBorder.TOP, null, Color.black));
		
		updateLibrary = new JButton("Update Library");
		libraryBackPanel.add(updateLibrary);
		return libraryBackPanel;
	}
	private void createMembershipBackPanel() {
		membershipBackPanel = new JPanel();
		membershipBackPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Membership actions", TitledBorder.LEFT, TitledBorder.TOP, null, Color.black));
		membershipPanel.add(membershipBackPanel);
		
		addMembership = new JButton("Add Membership");
		updateMembership = new JButton("Update Membership");
		removeMembership = new JButton("Remove Membership");
		viewMembership = new JButton("View Membership");
		
		membershipBackPanel.add(addMembership);
		membershipBackPanel.add(updateMembership);
		membershipBackPanel.add(removeMembership);
		membershipBackPanel.add(viewMembership);
	}
	
	private void createGenresBackPanel() {
		genreBackPanel = new JPanel();
		genreBackPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Genre actions", TitledBorder.LEFT, TitledBorder.TOP, null, Color.black));
		genresPanel.add(genreBackPanel);
		
		addGenre = new JButton("Add Genre");
		editGenre = new JButton("Update Genre");
		removeGenre = new JButton("Remove Genre");
		viewGenre = new JButton("View Genre");
		
		genreBackPanel.add(addGenre);
		genreBackPanel.add(editGenre);
		genreBackPanel.add(removeGenre);
		genreBackPanel.add(viewGenre);
	}
	private void createBooksCopyBackPanel() {
		booksCopyBackPanel = new JPanel();
		booksCopyBackPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Book actions", TitledBorder.LEFT, TitledBorder.TOP, null, Color.black));
		booksCopyPanel.add(booksCopyBackPanel);
		
		addBookCopy = new JButton("Add Book");
		updateBookCopy = new JButton("Update Book");
		removeBookCopy = new JButton("Remove Book");
		viewBookCopy = new JButton("View Book");
		
		booksCopyBackPanel.add(addBookCopy);
		booksCopyBackPanel.add(updateBookCopy);
		booksCopyBackPanel.add(removeBookCopy);
		booksCopyBackPanel.add(viewBookCopy);
	}
	private void createRentalsBackPanel() {
		rentalsBackPanel = new JPanel();
		rentalsBackPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Book actions", TitledBorder.LEFT, TitledBorder.TOP, null, Color.black));
		rentalsPanel.add(rentalsBackPanel, BorderLayout.SOUTH);
		
		addRental = new JButton("Add Rental");
		updateRental = new JButton("Update Rental");
		removeRental = new JButton("Remove Rental");
		viewRental = new JButton("View Rental");
		
		rentalsBackPanel.add(addRental);
		rentalsBackPanel.add(updateRental);
		rentalsBackPanel.add(removeRental);
		rentalsBackPanel.add(viewRental);
	}
	private void createBooksBackPanel() {
		booksBackPanel = new JPanel();
		booksBackPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Book actions", TitledBorder.LEFT, TitledBorder.TOP, null, Color.black));
		booksPanel.add(booksBackPanel, BorderLayout.SOUTH);
		
		addBook = new JButton("Add Book");
		removeBook = new JButton("Remove Book");
		updateBook = new JButton("Edit Book");
		viewBook = new JButton("View Book");
		
		booksBackPanel.add(addBook);
		booksBackPanel.add(removeBook);
		booksBackPanel.add(updateBook);
		booksBackPanel.add(viewBook);
	}
	
	private void createUsersBackPanel() {
		usersBackPanel = new JPanel();
		usersBackPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "User actions", TitledBorder.LEFT, TitledBorder.TOP, null, Color.black));
		usersPanel.add(usersBackPanel, BorderLayout.SOUTH);
		
		addUser = new JButton("Add User");
		removeUser = new JButton("Remove User");
		updateUser = new JButton("Edit User");
		viewUser = new JButton("View User");
		extendUser = new JButton("Extend User Membership");

		usersBackPanel.add(addUser);
		usersBackPanel.add(removeUser);
		usersBackPanel.add(updateUser);
		usersBackPanel.add(viewUser);
		usersBackPanel.add(extendUser);
	}
	
	private void createStaffBackPanel() {
		staffBackPanel = new JPanel();
		staffBackPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Staff actions", TitledBorder.LEFT, TitledBorder.TOP, null, Color.black));
		staffPanel.add(staffBackPanel, BorderLayout.SOUTH);
		
		addStaff = new JButton("Add Staff");
		removeStaff = new JButton("Remove Staff");
		updateStaff = new JButton("Edit Staff");
		viewStaff = new JButton("View Staff");
		
		staffBackPanel.add(addStaff);
		staffBackPanel.add(removeStaff);
		staffBackPanel.add(updateStaff);
		staffBackPanel.add(viewStaff);
	}

	public void createTables() {
		createUserTable();
		createBookTable();
		createStaffTable();
		createRentalsTable();
		createBookCopyTable();
		createGenreTable();
		createMembershipTable();
	}
	
	private void createMembershipTable() {
		membershipTable = new JTable();
		membershipScrollPane = new JScrollPane(membershipTable);
		membershipPanel.add(membershipScrollPane);
	}
	private void createGenreTable() {
		genresTable = new JTable();
		genreScrollPane = new JScrollPane(genresTable);
		genresPanel.add(genreScrollPane);
	}
	private void createBookCopyTable() {
		bookCopyTable = new JTable();
		copyBooksScrollPane = new JScrollPane(bookCopyTable);
		booksCopyPanel.add(copyBooksScrollPane);
	}
	
	private void createRentalsTable() {
		rentalsTable = new JTable();
		rentalsScrollPane = new JScrollPane(rentalsTable);
		rentalsPanel.add(rentalsScrollPane);
	}
	
	private void createStaffTable() {
		staffTable = new JTable();
		staffScrollPane = new JScrollPane(staffTable);
		staffPanel.add(staffScrollPane);
	}
	private void createBookTable() {
		booksTable = new JTable();
		booksScrollPane = new JScrollPane(booksTable);
		booksPanel.add(booksScrollPane);
	}
	
	private void createUserTable() {
		usersTable = new JTable();
		usersScrollPane = new JScrollPane(usersTable);
		usersPanel.add(usersScrollPane);	
		
		Insets insets = new Insets(10,0,0,0);
	}
	
	private void createLibraryInterface() {
		libraryPanel.setLayout(new GridBagLayout());
        Insets insets = new Insets(10,0,0,0);

		lblAddress = new JLabel("Address: ");
		lblTitle = new JLabel("Title: ");
		lblPhoneNumber = new JLabel("Phone Number: ");
		lblWorkingTime = new JLabel("Working time: ");
		addComponent(libraryPanel, lblAddress ,0,0,1,1,GridBagConstraints.NORTH , GridBagConstraints.HORIZONTAL, insets, 0.1,1.0);
		addComponent(libraryPanel, lblTitle ,0,1,1,1,GridBagConstraints.NORTH , GridBagConstraints.HORIZONTAL, insets, 0.1,1.0);
		addComponent(libraryPanel, lblPhoneNumber,0,2,1,1,GridBagConstraints.NORTH , GridBagConstraints.HORIZONTAL, insets, 0.1,1.0);
		addComponent(libraryPanel, lblWorkingTime ,0,3,1,1,GridBagConstraints.NORTH , GridBagConstraints.HORIZONTAL, insets, 0.1,1.0);
		
		txtAddress = new JTextField();
		txtTitle = new JTextField();
		txtPhoneNumber = new JTextField();
		txtWorkingTime = new JTextField();
		addComponent(libraryPanel, txtAddress, 1, 0, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(libraryPanel, txtTitle, 1, 1, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(libraryPanel, txtPhoneNumber, 1, 2, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(libraryPanel, txtWorkingTime, 1, 3, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(libraryPanel, createLibraryBackPanel(), 2, 4, 3, 2, GridBagConstraints.CENTER, GridBagConstraints.CENTER, insets, 100.0, 1.0);	
	}
	
	private void addComponent(Container container, Component component, int x, int y, int width, int height, int anchor, int fill, Insets insets, Double weightx, Double weighty) {
		GridBagConstraints p = new GridBagConstraints(x, y, width, height, weightx, weighty,
	    anchor, fill, insets, 0, 0); 
	    container.add(component, p);
	}
	public JPanel getBooksBackPanel() {
		return booksBackPanel;
	}

	public void setBooksBackPanel(JPanel booksBackPanel) {
		this.booksBackPanel = booksBackPanel;
	}

	public JButton getAddBook() {
		return addBook;
	}

	public void setAddBook(JButton addBook) {
		this.addBook = addBook;
	}

	public JButton getRemoveBook() {
		return removeBook;
	}

	public void setRemoveBook(JButton removeBook) {
		this.removeBook = removeBook;
	}

	public JButton getUpdateBook() {
		return updateBook;
	}

	public void setUpdateBook(JButton updateBook) {
		this.updateBook = updateBook;
	}

	public JButton getViewBook() {
		return viewBook;
	}

	public void setViewBook(JButton viewBook) {
		this.viewBook = viewBook;
	}

	public JButton getExtendUser() {
		return extendUser;
	}

	public void setExtendUser(JButton extendUser) {
		this.extendUser = extendUser;
	}
	
	public BooksTableModel getBooksTableModel() {
		return booksTableModel;
	}

	public void setBooksTableModel(BooksTableModel booksTableModel) {
		this.booksTableModel = booksTableModel;
	}

	public JTable getBooksTable() {
		return booksTable;
	}

	public void setBooksTable(JTable booksTable) {
		this.booksTable = booksTable;
	}

	public JScrollPane getBooksScrollPane() {
		return booksScrollPane;
	}

	public void setBooksScrollPane(JScrollPane booksScrollPane) {
		this.booksScrollPane = booksScrollPane;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public JPanel getUsersPanel() {
		return usersPanel;
	}

	public void setUsersPanel(JPanel usersPanel) {
		this.usersPanel = usersPanel;
	}

	public JPanel getBooksPanel() {
		return booksPanel;
	}

	public void setBooksPanel(JPanel booksPanel) {
		this.booksPanel = booksPanel;
	}

	public JPanel getStaffPanel() {
		return staffPanel;
	}

	public void setStaffPanel(JPanel staffPanel) {
		this.staffPanel = staffPanel;
	}

	public JPanel getRentalsPanel() {
		return rentalsPanel;
	}

	public void setRentalsPanel(JPanel rentalsPanel) {
		this.rentalsPanel = rentalsPanel;
	}

	public JPanel getGenresPanel() {
		return genresPanel;
	}

	public void setGenresPanel(JPanel genresPanel) {
		this.genresPanel = genresPanel;
	}

	public JTable getUsersTable() {
		return usersTable;
	}

	public void setUsersTable(JTable usersTable) {
		this.usersTable = usersTable;
	}

	public UsersTableModel getUsersTableModel() {
		return usersTableModel;
	}

	public void setUsersTableModel(UsersTableModel usersTableModel) {
		this.usersTableModel = usersTableModel;
	}

	public JScrollPane getUsersScrollPane() {
		return usersScrollPane;
	}

	public void setUsersScrollPane(JScrollPane usersScrollPane) {
		this.usersScrollPane = usersScrollPane;
	}

	public JPanel getUsersBackPanel() {
		return usersBackPanel;
	}

	public void setUsersBackPanel(JPanel usersBackPanel) {
		this.usersBackPanel = usersBackPanel;
	}

	public JButton getAddUser() {
		return addUser;
	}

	public void setAddUser(JButton addUser) {
		this.addUser = addUser;
	}

	public JButton getRemoveUser() {
		return removeUser;
	}

	public void setRemoveUser(JButton removeUser) {
		this.removeUser = removeUser;
	}

	public JButton getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(JButton updateUser) {
		this.updateUser = updateUser;
	}

	public JButton getViewUser() {
		return viewUser;
	}

	public void setViewUser(JButton viewUser) {
		this.viewUser = viewUser;
	}


	public JTable getStaffTable() {
		return staffTable;
	}

	public void setStaffTable(JTable staffTable) {
		this.staffTable = staffTable;
	}

	public StaffTableModel getStaffTableMode() {
		return staffTableMode;
	}

	public void setStaffTableMode(StaffTableModel staffTableMode) {
		this.staffTableMode = staffTableMode;
	}

	public JScrollPane getStaffScrollPane() {
		return staffScrollPane;
	}

	public void setStaffScrollPane(JScrollPane staffScrollPane) {
		this.staffScrollPane = staffScrollPane;
	}

	public JPanel getStaffBackPanel() {
		return staffBackPanel;
	}

	public void setStaffBackPanel(JPanel staffBackPanel) {
		this.staffBackPanel = staffBackPanel;
	}

	public JButton getAddStaff() {
		return addStaff;
	}

	public void setAddStaff(JButton addStaff) {
		this.addStaff = addStaff;
	}

	public JButton getRemoveStaff() {
		return removeStaff;
	}

	public void setRemoveStaff(JButton removeStaff) {
		this.removeStaff = removeStaff;
	}

	public JButton getUpdateStaff() {
		return updateStaff;
	}

	public void setUpdateStaff(JButton updateStaff) {
		this.updateStaff = updateStaff;
	}

	public JButton getViewStaff() {
		return viewStaff;
	}

	public void setViewStaff(JButton viewStaff) {
		this.viewStaff = viewStaff;
	}

	public JTable getRentalsTable() {
		return rentalsTable;
	}

	public void setRentalsTable(JTable rentalsTable) {
		this.rentalsTable = rentalsTable;
	}

	public RentalsTableModel getRentalsTableModel() {
		return rentalsTableModel;
	}

	public void setRentalsTableModel(RentalsTableModel rentalsTableModel) {
		this.rentalsTableModel = rentalsTableModel;
	}

	public JScrollPane getRentalsScrollPane() {
		return rentalsScrollPane;
	}

	public void setRentalsScrollPane(JScrollPane rentalsScrollPane) {
		this.rentalsScrollPane = rentalsScrollPane;
	}

	public JPanel getRentalsBackPanel() {
		return rentalsBackPanel;
	}

	public void setRentalsBackPanel(JPanel rentalsBackPanel) {
		this.rentalsBackPanel = rentalsBackPanel;
	}

	public JButton getAddRental() {
		return addRental;
	}

	public void setAddRental(JButton addRental) {
		this.addRental = addRental;
	}

	public JButton getUpdateRental() {
		return updateRental;
	}

	public void setUpdateRental(JButton updateRental) {
		this.updateRental = updateRental;
	}

	public JButton getViewRental() {
		return viewRental;
	}

	public void setViewRental(JButton viewRental) {
		this.viewRental = viewRental;
	}

	public JButton getRemoveRental() {
		return removeRental;
	}

	public void setRemoveRental(JButton removeRental) {
		this.removeRental = removeRental;
	}

	public JPanel getBooksCopyPanel() {
		return booksCopyPanel;
	}

	public void setBooksCopyPanel(JPanel booksCopyPanel) {
		this.booksCopyPanel = booksCopyPanel;
	}

	public JTable getBookCopyTable() {
		return bookCopyTable;
	}

	public void setBookCopyTable(JTable bookCopyTable) {
		this.bookCopyTable = bookCopyTable;
	}

	public BookCopyTableModel getBookCopyTableModel() {
		return bookCopyTableModel;
	}

	public void setBookCopyTableModel(BookCopyTableModel bookCopyTableModel) {
		this.bookCopyTableModel = bookCopyTableModel;
	}

	public JScrollPane getCopyBooksScrollPane() {
		return copyBooksScrollPane;
	}

	public void setCopyBooksScrollPane(JScrollPane copyBooksScrollPane) {
		this.copyBooksScrollPane = copyBooksScrollPane;
	}

	public JPanel getBooksCopyBackPanel() {
		return booksCopyBackPanel;
	}

	public void setBooksCopyBackPanel(JPanel booksCopyBackPanel) {
		this.booksCopyBackPanel = booksCopyBackPanel;
	}

	public JButton getAddBookCopy() {
		return addBookCopy;
	}

	public void setAddBookCopy(JButton addBookCopy) {
		this.addBookCopy = addBookCopy;
	}

	public JButton getRemoveBookCopy() {
		return removeBookCopy;
	}

	public void setRemoveBookCopy(JButton removeBookCopy) {
		this.removeBookCopy = removeBookCopy;
	}

	public JButton getUpdateBookCopy() {
		return updateBookCopy;
	}

	public void setUpdateBookCopy(JButton updateBookCopy) {
		this.updateBookCopy = updateBookCopy;
	}

	public JButton getViewBookCopy() {
		return viewBookCopy;
	}

	public void setViewBookCopy(JButton viewBookCopy) {
		this.viewBookCopy = viewBookCopy;
	}

	public JTable getGenresTable() {
		return genresTable;
	}

	public void setGenresTable(JTable genresTable) {
		this.genresTable = genresTable;
	}

	public GenresTableModel getGenresTableModel() {
		return genresTableModel;
	}

	public void setGenresTableModel(GenresTableModel genresTableModel) {
		this.genresTableModel = genresTableModel;
	}

	public JScrollPane getGenreScrollPane() {
		return genreScrollPane;
	}

	public void setGenreScrollPane(JScrollPane genreScrollPane) {
		this.genreScrollPane = genreScrollPane;
	}

	public JPanel getGenreBackPanel() {
		return genreBackPanel;
	}

	public void setGenreBackPanel(JPanel genreBackPanel) {
		this.genreBackPanel = genreBackPanel;
	}

	public JButton getAddGenre() {
		return addGenre;
	}

	public void setAddGenre(JButton addGenre) {
		this.addGenre = addGenre;
	}

	public JButton getRemoveGenre() {
		return removeGenre;
	}

	public void setRemoveGenre(JButton removeGenre) {
		this.removeGenre = removeGenre;
	}

	public JButton getEditGenre() {
		return editGenre;
	}

	public void setEditGenre(JButton editGenre) {
		this.editGenre = editGenre;
	}

	public JButton getViewGenre() {
		return viewGenre;
	}

	public void setViewGenre(JButton viewGenre) {
		this.viewGenre = viewGenre;
	}

	public JPanel getMembershipPanel() {
		return membershipPanel;
	}

	public void setMembershipPanel(JPanel membershipPanel) {
		this.membershipPanel = membershipPanel;
	}

	public JTable getMembershipTable() {
		return membershipTable;
	}

	public void setMembershipTable(JTable membershipTable) {
		this.membershipTable = membershipTable;
	}

	public MembershipTableModel getMembershipTableModel() {
		return membershipTableModel;
	}

	public void setMembershipTableModel(MembershipTableModel membershipTableModel) {
		this.membershipTableModel = membershipTableModel;
	}

	public JScrollPane getMembershipScrollPane() {
		return membershipScrollPane;
	}

	public void setMembershipScrollPane(JScrollPane membershipScrollPane) {
		this.membershipScrollPane = membershipScrollPane;
	}

	public JPanel getMembershipBackPanel() {
		return membershipBackPanel;
	}

	public void setMembershipBackPanel(JPanel membershipBackPanel) {
		this.membershipBackPanel = membershipBackPanel;
	}

	public JButton getAddMembership() {
		return addMembership;
	}

	public void setAddMembership(JButton addMembership) {
		this.addMembership = addMembership;
	}

	public JButton getRemoveMembership() {
		return removeMembership;
	}

	public void setRemoveMembership(JButton removeMembership) {
		this.removeMembership = removeMembership;
	}

	public JButton getUpdateMembership() {
		return updateMembership;
	}

	public void setUpdateMembership(JButton updateMembership) {
		this.updateMembership = updateMembership;
	}

	public JButton getViewMembership() {
		return viewMembership;
	}

	public void setViewMembership(JButton viewMembership) {
		this.viewMembership = viewMembership;
	}

	public JPanel getLibraryPanel() {
		return libraryPanel;
	}

	public void setLibraryPanel(JPanel libraryPanel) {
		this.libraryPanel = libraryPanel;
	}

	public JPanel getLibraryBackPanel() {
		return libraryBackPanel;
	}

	public void setLibraryBackPanel(JPanel libraryBackPanel) {
		this.libraryBackPanel = libraryBackPanel;
	}

	public JButton getUpdateLibrary() {
		return updateLibrary;
	}

	public void setUpdateLibrary(JButton updateLibrary) {
		this.updateLibrary = updateLibrary;
	}

	public JLabel getLblTitle() {
		return lblTitle;
	}

	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}

	public JLabel getLblAddress() {
		return lblAddress;
	}

	public void setLblAddress(JLabel lblAddress) {
		this.lblAddress = lblAddress;
	}

	public JLabel getLblPhoneNumber() {
		return lblPhoneNumber;
	}

	public void setLblPhoneNumber(JLabel lblPhoneNumber) {
		this.lblPhoneNumber = lblPhoneNumber;
	}

	public JLabel getLblWorkingTime() {
		return lblWorkingTime;
	}

	public void setLblWorkingTime(JLabel lblWorkingTime) {
		this.lblWorkingTime = lblWorkingTime;
	}

	public JTextField getTxtTitle() {
		return txtTitle;
	}

	public void setTxtTitle(JTextField txtTitle) {
		this.txtTitle = txtTitle;
	}

	public JTextField getTxtAddress() {
		return txtAddress;
	}

	public void setTxtAddress(JTextField txtAddress) {
		this.txtAddress = txtAddress;
	}

	public JTextField getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public void setTxtPhoneNumber(JTextField txtPhoneNumber) {
		this.txtPhoneNumber = txtPhoneNumber;
	}

	public JTextField getTxtWorkingTime() {
		return txtWorkingTime;
	}

	public void setTxtWorkingTime(JTextField txtWorkingTime) {
		this.txtWorkingTime = txtWorkingTime;
	}
	
	
	
}
