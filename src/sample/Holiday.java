package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;

import java.io.IOException;

public class Holiday {

    @FXML
    private Button logout;

    @FXML
    private Button Previous;

    @FXML
    private SplitMenuButton GovtHoliday;

    @FXML
    private SplitMenuButton OfficialHoliday;

    @FXML
    private Button UpEvent;


    public void userPrevious(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }

    public void userLogOut(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("holiday.fxml");
    }

    public void userGovtHoliday(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("holiday.fxml");
    }

    public void userOfficialHoliday(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("holiday.fxml");
    }

    public void userUpEvent(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("upEvent.fxml");
    }
}
