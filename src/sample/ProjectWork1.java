package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ProjectWork1 {

    @FXML
    private Button logout;

    @FXML
    private Button Home;

    @FXML
    private Button Previous;


    public void userLogOut(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");
    }

    public void userHome(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }

    public void userPrevious(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("owner.fxml");
    }
}
