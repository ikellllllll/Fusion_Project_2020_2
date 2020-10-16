package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;


//ÃâÃ³: https://aristatait.tistory.com/29?category=676359 [aristataIT]

public class LoginController {
	@FXML
	private	TextField		ID;
	@FXML
	private	PasswordField	password;
	@FXML
	private Button			btnLogin;
	@FXML
	private CheckBox		admin;
	@FXML
	private CheckBox		remember_ID;
	@FXML
	private Button			btnRegister;
	
	public void Login(ActionEvent event) throws Exception {
		if(ID.getText().equals("user") && password.getText().equals("pass")){
            System.out.println("Login Success");
            Stage primaryStage = (Stage)btnLogin.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        }else{
            System.out.println("Login Failed");
        }
	}
	
	public void Register(ActionEvent event) throws Exception {
		System.out.println("Register Event");
		
		Parent root;
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Register.fxml"));
		
		try {
			root = loader.load();
			
			stage.setScene(new Scene(root));
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}