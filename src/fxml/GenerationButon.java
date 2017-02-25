package fxml;

import java.io.FileWriter;
import java.io.IOException;

public class GenerationButon {
	public static void GenerationButonFXML() {
		String text;
		GeneratedFXML GB = new GeneratedFXML();
		// для генераціїї @FXML
		try (FileWriter writer = new FileWriter("D:/Dropbox/GSP/Saper/src/logic/FXMLButon.java", false)) {
			 text = "package logic;"+ "\r\n"
					 +"	 import javafx.fxml.FXML;" + "\r\n"
					 +"	 import objects.Button;" + "\r\n"
					 +"public class FXMLButon {" + "\r\n";
			writer.write(text);
			for (int i = 0; i < GB.button;) {
				String curentID = "b" + (i + 1);
				text = "@FXML" + "\r\n" + " public Button " + curentID + ";" + "\r\n";
				writer.write(text);
				i++;
			}
			text= "}";
			writer.write(text);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}
	public static void GenerationButon() {
		GeneratedFXML GB = new GeneratedFXML();
		String text;
		// для генераціїї Button
		try (FileWriter writer = new FileWriter("D:/Dropbox/GSP/Saper/src/logic/Buton.java", false)) {
			text = "package logic;"+ "\r\n"
					+"import objects.Button;" + "\r\n"
					+"public class Buton {" + "\r\n";
			
			writer.write(text);
			for (int i = 0; i < GB.button;) {
				String curentID = "b" + (i + 1);
				text =  " public Button " + curentID + ";" + "\r\n";
				writer.write(text);
				i++;
			}
			text= "}";
			writer.write(text);
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}
	public static void GenerationMC() {
		GeneratedFXML GB = new GeneratedFXML();
		String text;
		// для генераціїї Button
		try (FileWriter writer = new FileWriter("D:/Dropbox/GSP/Saper/src/controllers/MainController.java", false)) {
			text = "package controllers;"+ "\r\n"
					+"import fxml.GeneratedFXML;"+ "\r\n"
					+"import javafx.fxml.FXML;"+ "\r\n"
					+"import javafx.scene.Node;"+ "\r\n"
					+"import javafx.scene.Scene;"+ "\r\n"
					+"import javafx.scene.control.Button;"+ "\r\n"
					+"import javafx.scene.input.MouseEvent;"+ "\r\n"
					+"import logic.DrawField;"+ "\r\n"
					+"public class MainController {"+ "\r\n";
			writer.write(text);
			for (int i = 0; i < GB.button;) {
				String curentID = "b" + (i + 1);
				text = "@FXML" + "\r\n" + " public Button " + curentID + ";" + "\r\n";
				writer.write(text);
				i++;
			}
			text = "private static final DrawField DF = new DrawField();" + "\r\n" 
+"	private String valueOfClickedButton;" + "\r\n"
+"	private Button buttonToMakeChange;" + "\r\n"
+"	private boolean wasClicked = false;" + "\r\n"
+"	private boolean isRun = true;" + "\r\n"
	+"private Scene sc;" + "\r\n"
+"	private String idwka;" + "\r\n"
+"	public String curentID;" + "\r\n"
+"	@FXML" + "\r\n"
+"	private void initialize() {	}" + "\r\n"
+"	@FXML" + "\r\n"
+"	public void mouseClick(MouseEvent event) {" + "\r\n"
+"		Object source = event.getSource();" + "\r\n"
+"		Button clickedButton = (Button) source;" + "\r\n"
+"		sc = ((Node) source).getScene();" + "\r\n"
+"		valueOfClickedButton = DF.valueOfButton(clickedButton.getId());" + "\r\n"
+"		buttonToMakeChange = clickedButton;" + "\r\n"
+"		clickedButton.setDisable(true);" + "\r\n"
+"		clickedButton.setText(valueOfClickedButton);" + "\r\n"
+"		if (valueOfClickedButton == "+ "\"" +"X"+ "\"" +") {" + "\r\n"
+"			buttonToMakeChange.setStyle("+ "\"" +" -fx-base: red;"+ "\"" +");" + "\r\n"
			+"			System.out.println("+ "\"" +"boom"+ "\"" +");" + "\r\n"
			+"			gameOver();" + "\r\n"
+"			win();}" + "\r\n"
		+"		wasClicked = true;" + "\r\n"
+"		isRun = false;}" + "\r\n"
+"	public void gameOver() {" + "\r\n"
+"		for (int i = 1; i < GeneratedFXML.button; i++) {" + "\r\n"
		+"		String curentID = "+ "\"" +"#b"+ "\"" +" + i;" + "\r\n"
		+"			Button nodeToFind = (Button) sc.lookup(curentID);" + "\r\n"
		+"			if (nodeToFind.isDisable() == false) {" + "\r\n"
		+"				nodeToFind.setDisable(true);" + "\r\n"
		+"				nodeToFind.setText(DF.valueOfButton("+ "\"" +"b"+ "\"" +" + i));" + "\r\n"
		+"			}}}" + "\r\n"
		+"		public void win() { // äîðîáèòè âèãðàø ïîâ³äîìëåííÿ" + "\r\n"
				+"			int count = 0;" + "\r\n"
				+"			if (count == 1) {" + "\r\n"
				+"	System.out.println("+ "\"" +"WIN"+ "\"" +");" + "\r\n"
			+"			}" + "\r\n"
			+"		}" + "\r\n"
			+"	}" + "\r\n";
			
			
			
writer.write(text);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}
}
