package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Vacation {

    @FXML
    private Button logout;

    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");

    }

    public void userEidVacation(MouseEvent mouseEvent) {
    }

    public void userVacation(MouseEvent mouseEvent) {
    }

    public void userQurbanVacation(MouseEvent mouseEvent) {
    }
}
