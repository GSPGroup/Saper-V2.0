package controllers;
import fxml.GeneratedFXML;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import logic.DrawField;
public class MainController {
	

@FXML
 public static Button[] b;

static{
	for (int i = 1; i <100 ; i++) {
		b[i]=new Button();
		
	}
}
	
	
@FXML
 public Button b1;
@FXML
 public Button b2;
@FXML
 public Button b3;
@FXML
 public Button b4;
@FXML
 public Button b5;
@FXML
 public Button b6;
@FXML
 public Button b7;
@FXML
 public Button b8;
@FXML
 public Button b9;
@FXML
 public Button b10;
@FXML
 public Button b11;
@FXML
 public Button b12;
@FXML
 public Button b13;
@FXML
 public Button b14;
@FXML
 public Button b15;
@FXML
 public Button b16;
@FXML
 public Button b17;
@FXML
 public Button b18;
@FXML
 public Button b19;
@FXML
 public Button b20;
@FXML
 public Button b21;
@FXML
 public Button b22;
@FXML
 public Button b23;
@FXML
 public Button b24;
@FXML
 public Button b25;
@FXML
 public Button b26;
@FXML
 public Button b27;
@FXML
 public Button b28;
@FXML
 public Button b29;
@FXML
 public Button b30;
@FXML
 public Button b31;
@FXML
 public Button b32;
@FXML
 public Button b33;
@FXML
 public Button b34;
@FXML
 public Button b35;
@FXML
 public Button b36;
@FXML
 public Button b37;
@FXML
 public Button b38;
@FXML
 public Button b39;
@FXML
 public Button b40;
@FXML
 public Button b41;
@FXML
 public Button b42;
@FXML
 public Button b43;
@FXML
 public Button b44;
@FXML
 public Button b45;
@FXML
 public Button b46;
@FXML
 public Button b47;
@FXML
 public Button b48;
@FXML
 public Button b49;
@FXML
 public Button b50;
@FXML
 public Button b51;
@FXML
 public Button b52;
@FXML
 public Button b53;
@FXML
 public Button b54;
@FXML
 public Button b55;
@FXML
 public Button b56;
@FXML
 public Button b57;
@FXML
 public Button b58;
@FXML
 public Button b59;
@FXML
 public Button b60;
@FXML
 public Button b61;
@FXML
 public Button b62;
@FXML
 public Button b63;
@FXML
 public Button b64;
@FXML
 public Button b65;
@FXML
 public Button b66;
@FXML
 public Button b67;
@FXML
 public Button b68;
@FXML
 public Button b69;
@FXML
 public Button b70;
@FXML
 public Button b71;
@FXML
 public Button b72;
@FXML
 public Button b73;
@FXML
 public Button b74;
@FXML
 public Button b75;
@FXML
 public Button b76;
@FXML
 public Button b77;
@FXML
 public Button b78;
@FXML
 public Button b79;
@FXML
 public Button b80;
@FXML
 public Button b81;
@FXML
 public Button b82;
@FXML
 public Button b83;
@FXML
 public Button b84;
@FXML
 public Button b85;
@FXML
 public Button b86;
@FXML
 public Button b87;
@FXML
 public Button b88;
@FXML
 public Button b89;
@FXML
 public Button b90;
@FXML
 public Button b91;
@FXML
 public Button b92;
@FXML
 public Button b93;
@FXML
 public Button b94;
@FXML
 public Button b95;
@FXML
 public Button b96;
@FXML
 public Button b97;
@FXML
 public Button b98;
@FXML
 public Button b99;
@FXML
 public Button b100;
private static final DrawField DF = new DrawField();
	private String valueOfClickedButton;
	private Button buttonToMakeChange;
	private boolean wasClicked = false;
	private boolean isRun = true;
private Scene sc;
	private String idwka;
	public String curentID;
	@FXML
	private void initialize() {	}
	@FXML
	public void mouseClick(MouseEvent event) {
		Object source = event.getSource();
		Button clickedButton = (Button) source;
		sc = ((Node) source).getScene();
		valueOfClickedButton = DF.valueOfButton(clickedButton.getId());
		buttonToMakeChange = clickedButton;
		clickedButton.setDisable(true);
		clickedButton.setText(valueOfClickedButton);
		if (valueOfClickedButton == "X") {
			buttonToMakeChange.setStyle(" -fx-base: red;");
			System.out.println("boom");
			gameOver();
			win();}
		wasClicked = true;
		isRun = false;}
	public void gameOver() {
		for (int i = 1; i < GeneratedFXML.button; i++) {
		String curentID = "#b" + i;
			Button nodeToFind = (Button) sc.lookup(curentID);
			if (nodeToFind.isDisable() == false) {
				nodeToFind.setDisable(true);
				nodeToFind.setText(DF.valueOfButton("b" + i));
			}}}
		public void win() { // ???????? ?????? ????????????
			int count = 0;
			if (count == 1) {
	System.out.println("WIN");
			}
		}
	}
