package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Employee {

    @FXML
    private Button logout;

    @FXML
    private Button Previous;

    @FXML
    private Button CeoPanel;

    @FXML
    private Button InternPanel;

    @FXML
    private Button ManagerPanel;



    @FXML
    private Button SeniorOfficerPanel;

    @FXML
    private Button JuniorOfficerPanel;










    public void userLogOut(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");
    }



    public void userPrevious(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }



    public void userManagerPanel(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("managerPanel.fxml");
    }

    public void userSeniorOfficerPanel(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("seniorOfficerPanel.fxml");
    }

    public void userJuniorOfficerPanel(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("juniorOfficerPanel.fxml");
    }

    public void userPionPanel(ActionEvent actionEvent) {

    }

    public void userInternPanel(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("internPanel.fxml");
    }

    public void userCeoPanel(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("owner.fxml");
    }


}
