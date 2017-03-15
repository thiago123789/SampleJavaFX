package controllers;

import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.AnchorPaneBuilder;
import javafx.stage.Stage;

public class TelaLoginController{

	private Sistema sis;
	
	@FXML
	private Button tela2Button;
	
	@FXML
	public void initialize() throws Exception {
		sis = Sistema.getInstance();
		tela2Button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage stage;
				Parent root;
				try{
					if(event.getSource()==tela2Button){
				        //get reference to the button's stage         
				        stage = (Stage) tela2Button.getScene().getWindow();
				        //load up OTHER FXML document
				        root = FXMLLoader.load(getClass().getResource("/view/TelaPrincipal.fxml"));
				    } else {
						stage = (Stage) tela2Button.getScene().getWindow();
						root = FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml"));
					}
					//create a new scene with root and set the stage
					Scene scene = new Scene(root);
				    stage.setScene(scene);
				    sis.changeStage(stage);
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setApp(Sistema sis){
		this.sis = sis;
	}
}
