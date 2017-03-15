package controllers;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sistema extends Application{

	private static Sistema instance;
	
	public static Sistema getInstance(){
		if (instance == null){
			instance = new Sistema();
		}
		return instance;
	}
	
	private Stage primaryStage;
	private BorderPane rootScene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
			//definindo palco da aplicação;
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Sistema Academico");
			this.rootScene = new BorderPane();
			
			Scene scene = new Scene(rootScene, 600, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
						
			carregaTelaLogin();	
	}
	
	public void carregaTelaLogin(){
		try{
			// carrega o panel de contas no centro da tela principal
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Sistema.class.getResource("/view/TelaLogin.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			
			this.rootScene.setCenter(pane);
			TelaLoginController telaLoginController = loader.getController();
			telaLoginController.setApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void changeStage(Stage stage){
		this.primaryStage = stage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
