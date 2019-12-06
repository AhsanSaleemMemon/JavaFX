package pages;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SignUpController {

	@FXML
	private TextField password;

	@FXML
	private Button signUpBtn1;

	@FXML
	private Label confirmationID;

	@FXML
	private TextField username;

	private SignUpMain mainApp;

	@FXML
	private Button logInBtn2;
	private LoginMain loginMain;

	@FXML
	void LogInPage() {
		try 
		{
			
			mainApp.getPrimaryStage().close();
			Stage secondStage = new Stage();
			loginMain = new LoginMain();
			// signUpMain.setPrimaryStage(secondStage);
			loginMain.start(secondStage);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public void signUp() {

		// .addUserInTable(conn, username, password);
		String user = username.getText();
		String pass = password.getText();

		if (!(user.equals("")) && !(pass.equals(""))) {
			System.out.println("Entered details: \n");
			System.out.println("Username: " + user);
			System.out.println("Password: " + pass);

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

	public void setMainApp(SignUpMain mainApp) {
		// TODO Auto-generated method stub
		this.mainApp = mainApp;

	}

}
