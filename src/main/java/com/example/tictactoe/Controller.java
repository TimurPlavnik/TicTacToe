package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static com.example.tictactoe.Control.placing;
import static com.example.tictactoe.Control.winCheck;

public class Controller {
    private Scene WinScreen;

    public void setWinScreen(Scene scene) {
        WinScreen = scene;
    }
    @FXML
    private Button TopRight;
    @FXML
    private void TopRightButtonClick() {
        int check=Control.placeChecker(Control.board.board,0, 2);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 0, 2);
            TopRight.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);
        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }

    @FXML
    private Button MiddleRight;
    @FXML
    private void MiddleRightButtonClick() {
        int check=Control.placeChecker(Control.board.board, 1, 2);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 1, 2);
            MiddleRight.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);

        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }
    @FXML
    private Button BottomRight;
    @FXML
    private void BottomRightButtonClick() {
        int check=Control.placeChecker(Control.board.board, 2, 2);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 2, 2);
            BottomRight.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);

        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }
    @FXML
    private Button TopMiddle;
    @FXML
    private void TopMiddleButtonClick() {
        int check=Control.placeChecker(Control.board.board, 0, 1);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 0, 1);
            TopMiddle.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);

        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }
    @FXML
    private Button MiddleMiddle;
    @FXML
    private void MiddleMiddleButtonClick() {
        int check=Control.placeChecker(Control.board.board, 1, 1);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 1, 1);
            MiddleMiddle.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);

        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }
    @FXML
    private Button BottomMiddle;
    @FXML
    private void BottomMiddleButtonClick() {
        int check=Control.placeChecker(Control.board.board, 2, 1);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 2, 1);
            BottomMiddle.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);

        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }
    @FXML
    private Button TopLeft;
    @FXML
    private void TopLeftButtonClick() {
        int check=Control.placeChecker(Control.board.board, 0, 0);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 0, 0);
            TopLeft.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);

        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }
    @FXML
    private Button MiddleLeft;
    @FXML
    private void MiddleLeftButtonClick() {
        int check=Control.placeChecker(Control.board.board, 1, 0);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 1, 0);
            MiddleLeft.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);
        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }
    @FXML
    private Button BottomLeft;
    @FXML
    private void BottomLeftButtonClick() {
        int check=Control.placeChecker(Control.board.board, 2, 0);
        if (check ==1&Control.on==1){
            Control.player.symbolChecker();
            placing(Control.board.board, Control.player.symb, 2, 0);
            BottomLeft.setText (Control.player.symb);
            winCheck(Control.board.board, Control.player.symb);
        }
        if (Control.on!=1){
            Stage stage = (Stage)TopRight.getScene().getWindow();
            stage.setScene(WinScreen);
            stage.show();
        }
    }
    @FXML
    private Label WinText;
    @FXML
    private void initialise(){
        if (Control.on==0){
            WinText.setText(Control.player.symb+" wins!");
        }else{
            WinText.setText("Draw!");
        }

    }
    @FXML
    private Button CloseButton;
    @FXML
    private void CloseGame(){
        Stage stage = (Stage) CloseButton.getScene().getWindow();
        stage.close();
    }
}