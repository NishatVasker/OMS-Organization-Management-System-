package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;

import java.io.IOException;

public class SeniorOfficerPanel {

    @FXML
    private Button Previous;

    @FXML
    private Button logout;

    @FXML
    private Button Home;

    @FXML
    private SplitMenuButton Stephen;

    @FXML
    private SplitMenuButton Zubair;

    @FXML
    private SplitMenuButton Arif;

    @FXML
    private SplitMenuButton Sultan;

    @FXML
    private SplitMenuButton Naheed;







    public void userHome(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }

    public void userPrevious(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("employee.fxml");

    }

    public void userLogOut(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");
    }

    public void userStephen(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("seniorOfficerPanel.fxml");
    }

    public void userZubair(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("seniorOfficerPanel.fxml");
    }

    public void userNaheed(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("seniorOfficerPanel.fxml");
    }

    public void userSultan(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("seniorOfficerPanel.fxml");
    }

    public void userArif(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("seniorOfficerPanel.fxml");
    }
}
