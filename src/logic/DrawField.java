package logic;

public class DrawField {

	public int number = 0;
	private static int i = 0;
	private static int j = 0;

	private static CreateField makeField = new CreateField();

	public void makeField() {
		makeField.createFieldForForm();
	}

	public String valueOfButton(String bID) {
		whatNumberForButton(bID);
		whatCellInArray();
		String value = Integer.toString(makeField.pole[i][j]);
		if(makeField.pole[i][j]==-1){
			value="X";
			
		}
		return value;
	}

	public int whatNumberForButton(String bID) {// what number of button that
												// was clicked
		number = Integer.parseInt(bID.replace('b', '0'));
		return number;
	}

	public int[][] whatCellInArray() { // coordinates for array
		int[][] arr = new int[1][1];
		double newNumber = (number - 1) / 10;
		i = (int) newNumber;
		j = (number - (int) (newNumber * 10)) - 1;
		return arr;
	}

}