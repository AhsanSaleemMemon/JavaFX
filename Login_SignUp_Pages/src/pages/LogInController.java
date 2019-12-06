package pages;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class LogInController {

	
	 @FXML
	 private AnchorPane mainAnchor;
	 
	@FXML
	private Button signUpBtn;

	@FXML
	private TextField username;
	
	@FXML
    private AnchorPane welcomeID;

	@FXML
	private TextField password;

	@FXML
	private Button logInBtn1;

	private LoginMain mainApp;

	private SignUpMain signUpMain;

	@FXML
	public void signUpPressed() {
	
	try 
		{
			
			mainApp.getPrimaryStage().close();
			Stage secondStage = new Stage();
			signUpMain = new SignUpMain();
			// signUpMain.setPrimaryStage(secondStage);
			signUpMain.start(secondStage);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	@FXML
	public void logInPressed() {
		String user = username.getText();
		String pass = password.getText();
		
		if (!(user.equals("")) && !(pass.equals(""))) {
			System.out.println("Entered details:");
			System.out.println("Username: " + username.getText());
			System.out.println("Password: " + password.getText());
			

		} else {
			// Nothing selected.
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Error");
			alert.setHeaderText("Empty Fields");
			alert.setContentText("Please fill the specified fields.");

			alert.showAndWait();
		}

	}

	public void setMainApp(LoginMain main) {
		// TODO Auto-generated method stub
		this.mainApp = main;
	}
}
