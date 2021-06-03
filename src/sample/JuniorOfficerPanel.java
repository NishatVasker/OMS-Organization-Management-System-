package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;

import java.io.IOException;

public class JuniorOfficerPanel<SplitButton> {

    @FXML
    private Button Previous;

    @FXML
    private Button logout;

    @FXML
    private Button Home;

    @FXML
    private SplitMenuButton Zim;

    @FXML
    private SplitMenuButton Hasib;

    @FXML
    private SplitMenuButton Tarikul;

    @FXML
    private SplitMenuButton Sabur;

    @FXML
    private SplitMenuButton Salman;

    @FXML
    private SplitMenuButton Hossain;









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

    public void userZim(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("juniorOfficerPanel.fxml");
    }

    public void userHasib(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("juniorOfficerPanel.fxml");
    }

    public void userTarikul(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("juniorOfficerPanel.fxml");
    }

    public void userSabur(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("juniorOfficerPanel.fxml");
    }

    public void userSalman(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("juniorOfficerPanel.fxml");
    }

    public void userHossain(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("juniorOfficerPanel.fxml");
    }
}
