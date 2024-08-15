package java12e1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainTaschenrechner extends Application{
	@Override
	public void start(Stage meineStage) throws Exception {
		//Datei aus dem FXMLLoader laden
		Parent root = FXMLLoader.load(getClass().getResource("taschenrechner.fxml"));
		//die Szene erzeugen
		//an den Konstruktor werden der oberste Knoten und die Größe übergeben
		Scene meineScene = new Scene (root,450,200);
		//den Titel über stage setzen
		meineStage.setTitle("Taschenrechner");
		//die Szene setzen
		meineStage.setScene(meineScene);
		//Groesse nicht veraenderbar
		meineStage.setResizable(false);
		//und anzeigen
		meineStage.show();
	}

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		launch(args);
	}
}
