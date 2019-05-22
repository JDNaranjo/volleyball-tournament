package ui;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.Participant;
import model.Spectator;
import model.Tournament;

public class VolleyballTournamentGUI {

    @FXML
    private Label attendeeInfo;

    @FXML
    private ImageView attendeeIamage;

    @FXML
    private TextField uploadTxtBox;

    @FXML
    private Button exploreButton;

    @FXML
    private Button uploadButton;

    @FXML
    private Label attendeesUpload;

    @FXML
    private TextField spectatorsTxtBox;

    @FXML
    private Button spectatorsButton;

    @FXML
    private Label spectatorNotFound;

    @FXML
    private Label spectatorsTime;

    @FXML
    private TextField participantTxtBox;

    @FXML
    private Button participantButton;

    @FXML
    private Label participantNotFound;

    @FXML
    private Label participantsTime;

    @FXML
    private AnchorPane estructurePane;

    @FXML
    private Button pStructureButton;

    @FXML
    private Button eStructureButton;
    
    private Tournament tournament;
    
    @FXML
    void initialize() {
        tournament = new Tournament();
        spectatorNotFound.setVisible(false);
        participantNotFound.setVisible(false);
        attendeesUpload.setVisible(false);
    }

    @FXML
    void exploreFile(ActionEvent event) {
    	FileChooser chooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a file (.csv)", "*.csv");
        chooser.getExtensionFilters().add(filter);
        File file = chooser.showOpenDialog(new Stage());
        if ( file !=null){
       	 
       	 directoryDataField.setText(file.getPath().toString());
        }
    }

    @FXML
    void participantsTree(ActionEvent event) {

    }

    @FXML
    void searchParticipant(ActionEvent event) {
    	double actualTime = System.currentTimeMillis();
    	
    	String id = participantTxtBox.getText();
    	Participant participantF = tournament.idSearchParticipant(id);
    	
    	if(participantF!=null) {
    		System.out.println(participantF);
    		attendeeInfo.setText(participantF.toString());
    	}else {
    		spectatorNotFound.setVisible(true);
    	}
    	actualTime = System.currentTimeMillis()-actualTime;
    	spectatorsTime.setText(""+actualTime);
    }

    @FXML
    void searchSpectator(ActionEvent event) {
    	double actualTime = System.currentTimeMillis();
    	
    	String id = spectatorsTxtBox.getText();
    	Spectator spectatorF = tournament.idSearchSpectator(id);
    	
    	if(spectatorF!=null) {
    		System.out.println(spectatorF);
    		attendeeInfo.setText(spectatorF.toString());
    	}else {
    		spectatorNotFound.setVisible(true);
    	}
    	actualTime = System.currentTimeMillis()-actualTime;
    	spectatorsTime.setText(""+actualTime);
    }

    @FXML
    void spectatorsTree(ActionEvent event) {

    }

    @FXML
    void uploadFile(ActionEvent event) {

    }

}
