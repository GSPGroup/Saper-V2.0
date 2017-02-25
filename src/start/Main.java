package start;

import controllers.MainController;
import controllers.ReloadApp;
import fxml.GeneratedFXML;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.DrawField;

public class Main extends Application {
	

	@Override
	public void start(Stage primaryStage) throws Exception {
//		GenerationButon.GenerationButon();
//		GenerationButon.GenerationMC();
//		GeneratedFXML.GenerationFXML();
				
	
		DrawField DrField = new DrawField();
		DrField.makeField();
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/main10x10.fxml"));
		primaryStage.setTitle("MINER");
		Scene scene = new Scene(root);
		primaryStage.close();
		scene.getStylesheets().add(0, "../css/MainWindow.css");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		MainController.ps1=primaryStage;
		ReloadApp.re1=root;
		
	}	

	public static void main(String[] args) {
		launch(args);
	}
}
