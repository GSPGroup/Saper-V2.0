package start;

import fxml.GeneratedFXML;
import fxml.GenerationButon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.DrawField;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		GenerationButon.GenerationButon();
		GenerationButon.GenerationMC();
		GeneratedFXML.GenerationFXML();
				
		DrawField DrField = new DrawField();
		DrField.makeField();
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
		primaryStage.setTitle("MINER");
		Scene scene = new Scene(root);
		primaryStage.close();
		scene.getStylesheets().add(0, "../css/MainWindow.css");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}	

	public static void main(String[] args) {

	

		launch(args);
	}

}
