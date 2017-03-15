package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class TelaPrincipalController{

	private Sistema sis;
	
	@FXML
	private MenuItem myAccButton, exitButton, newOfferButton, listOfferButton, aboutButton;
	@FXML
	private TitledPane defaultPane;
	
	@FXML
	public void initialize(){
		
	}
	
	public void setApp(Sistema sis){
		this.sis = sis;
	}

}
