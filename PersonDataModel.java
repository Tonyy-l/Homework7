package fmi.informatics.gui;

import javax.swing.table.AbstractTableModel;

import fmi.informatics.extending.Person;

// Създаваме клас PersonDataModel
public class PersonDataModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	
	private Person[] people;

	// constructor
	public PersonDataModel(Person[] people) {
		this.people = people;
	}

	@Override
	public int getColumnCount() {
		return 3; // брой колони в таблицата
	}

	@Override
	public int getRowCount() {
		return people.length; // брой редове в таблицата
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0:
				return people[rowIndex].getName();
			case 1:
				return people[rowIndex].getSecondName();
			case 2:
				return people[rowIndex].getThirdName();
			
				
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
			case 0:
				return "Име";
			case 1:
				return "Презиме";
			case 2:
				return "Фамилия";
			
			default:
				return super.getColumnName(column);
		}
	}
}
