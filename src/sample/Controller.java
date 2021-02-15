package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextArea historyArea;

    @FXML
    TextField inputArea;

    @FXML
    Button sendButton;

    public void btnOneClickAction(ActionEvent actionEvent) {
        historyArea.appendText(inputArea.getText() + "\n");
        inputArea.clear();
        inputArea.requestFocus();



    }



}
