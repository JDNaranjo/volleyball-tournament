package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("volleyball.fxml"));
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("IV Copa Panamericana de Voleibol Masculino Sub-21");
		stage.getIcons().add(new Image("file:media/logo.png"));
		stage.show();
	}

}
