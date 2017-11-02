package app.controller;

import java.net.URL;
import java.util.ResourceBundle;
import app.Flamingo;
import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import pkgCore.GamePlay;
import pkgCore.Player;
import pkgCore.Table;

public class BlackJackController implements Initializable {
	private Flamingo FlamingoGame;

	@FXML
	private Label GameLabel, Message;
	private ToggleButton SitLeaveToggle;

	@FXML
	private Button SitLeave, HitButton, StandButton;
	@FXML
	private GridPane centerGP, playerPane, dealerPane;
	@FXML
	private Stage pStage;
	@FXML
	Image back = new Image(getClass().getResourceAsStream("/img/b2fv.png"), 75, 75, true, true);
	@FXML
	Image front = new Image(getClass().getResourceAsStream("/img/1.png"), 75, 75, true, true);
	@FXML
	ImageView iv1, animator;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void setMainApp(Flamingo FlamingoGame) {
		this.FlamingoGame = FlamingoGame;
		Stage primaryStage = (Stage) animator.getScene().getWindow();
		primaryStage.setTitle("BlackJack");
		Message.setText("Good luck!");
		HitButton.setDisable(true);
		StandButton.setDisable(true);
	}

	// Provide the player with a card when the Hit button is pressed
	@FXML
	public void btnHit_Click(ActionEvent event) {
	}



	@FXML
	public void btnStand_Click(ActionEvent event) {
			}

	// Sit/Leave button

	@FXML
	public void btnSitLeave_Click(ActionEvent event) {
	}

	// TODO: Implement this. Create a new 'Action', send the 'Sit' or
	// 'Leave' action to the Hub.

	public void HandleTableState(Table t) {

		// TODO: Implement this.
	}

	public void HandleGameState(GamePlay gp) {

		// Coming Soon....!
	}



}
