package java12e1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class taschenrechnerController {
	//Label, Combobox und Textfeld erzeugen
	@FXML private Label ergebnisAnzeige;
    @FXML private ComboBox<String> auswahl;
    @FXML private TextField eingabe2, eingabe1;
    
    //Methode zum beenden
    @FXML protected void beendenKlick(ActionEvent event) {
        Platform.exit();
    }
    
    //Methode zum berechnen
    @FXML protected void berechnenKlick(ActionEvent event) {
        ergebnisAnzeige.setText(berechnen());
    }
    
    //Die Rechenoperationen
    protected String berechnen() {
        double zahl1, zahl2, ergebnis = 0;
        boolean fehlerFlag = false;
        zahl1 = Double.parseDouble(eingabe1.getText());
        zahl2 = Double.parseDouble(eingabe2.getText());
        String tempAuswahl = auswahl.getSelectionModel().getSelectedItem().toString();
        //Addition
        if (tempAuswahl.equals("Addition"))
            ergebnis = zahl1 + zahl2;
        //Subtraktion
        if(tempAuswahl.equals("Subtraktion"))
            ergebnis = zahl1 - zahl2;
        //Multiplikation
        if(tempAuswahl.equals("Multiplikation"))
            ergebnis = zahl1 * zahl2;
        //Division
        if(tempAuswahl.equals("Division")) {
            if(zahl2!=0)
            ergebnis = zahl1 / zahl2;
            else
                fehlerFlag = true;
    }
        
        if(fehlerFlag == false)
            return Double.toString(ergebnis);
        else
            return ("Nicht definiert");    
    }
    
    //Methode zum initialisieren
    @FXML void initialize() {
        auswahl.getItems().addAll("Addition", "Subtraktion", "Multiplikation", "Division");
        auswahl.getSelectionModel().selectFirst();
    }  
}
