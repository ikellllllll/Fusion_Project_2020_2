package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private	AnchorPane		mainPane;
//	@FXML
//	private SubScene		subScene;
	
	public void labelClickHandler(MouseEvent event) throws Exception { // 임시
		Label clickedLabel = (Label) event.getSource();
		String clickedLabelStr = clickedLabel.getText();
		System.out.println(clickedLabelStr);
	}
	
	public void bookClick(MouseEvent event) throws Exception {
		printLabel(event);
		
//		mainPane = FXMLLoader.load(getClass().getResource("/application/Book.fxml"));
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/Book.fxml")));	
	}
	
	public void timeTableClick(MouseEvent event) throws Exception {
		printLabel(event);
		
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/TimeTable.fxml")));
	}
	
	public void crntFilmClick(MouseEvent event) throws Exception {
		printLabel(event);
		
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/CurrentFilm.fxml")));
	}
	
	public void scheduledFilmClick(MouseEvent event) throws Exception {
		printLabel(event);
		
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/ScheduledFilm.fxml")));
	}
	
	public void gyeongsanClick(MouseEvent event) throws Exception {
		printLabel(event);
		
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/Gyeongsan.fxml")));
	}
	
	public void gumiClick(MouseEvent event) throws Exception {
		printLabel(event);
		
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/Gumi.fxml")));
	}
	
	public void daeguClick(MouseEvent event) throws Exception {
		printLabel(event);
		
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/Daegu.fxml")));
	}
	
	public void dongSeongRoClick(MouseEvent event) throws Exception {
		printLabel(event);
		
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/DongSeongRo.fxml")));
	}
	
	public void myInfoClick(MouseEvent event) throws Exception {
		printLabel(event);
		
		mainPane.getChildren().clear();
		mainPane.getChildren().add(FXMLLoader.load(getClass().getResource("/application/MyInfo.fxml")));
	}
	
	public void logOutClick(MouseEvent event) throws Exception {
		Label clickedLabel = (Label) event.getSource();
		String clickedLabelStr = clickedLabel.getText();
		System.out.println(clickedLabelStr);
		
		Stage stage = (Stage)clickedLabel.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void printLabel(MouseEvent event) {
		Label clickedLabel = (Label) event.getSource();
		String clickedLabelStr = clickedLabel.getText();
		System.out.println(clickedLabelStr);
	}
}
