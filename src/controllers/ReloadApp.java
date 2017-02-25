package controllers;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReloadApp extends Application {
	boolean state = true;
	public static Object re1;
	@Override
	public void start(final Stage primaryStage) throws IOException {
		System.out.println("state is " + state);
		playGame();
		System.out.println("state is " + state);
		Parent root =FXMLLoader.load(getClass().getResource("/fxml/main10x10.fxml"));
		final Scene scene = new Scene(root);
//		scene -> {
//			System.out.println("Restarting app!");
//			primaryStage.close();
//			Platform.runLater(() -> new ReloadApp().start(new Stage()));

		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	private void playGame() {
		state = false;
	}

	public static void main(final String[] args) {
		launch(args);
	}
}