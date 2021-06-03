package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button logout;

    @FXML
    private Button notice;

    @FXML
    private Button owner;

    @FXML
    private Button employee;

    @FXML
    private Button Aboutus;

    @FXML
    private Button Gos;

    @FXML
    private Button Holiday;



    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");

    }

    public void userNotice(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("notice.fxml");
    }

    public void userOwner(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("owner.fxml");
    }

    public void userEmployee(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("employee.fxml");/////hava to change
    }

    public void userHoliday(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("holiday.fxml");
    }







    public void userAboutus(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("about.fxml");
    }

    public void userGos(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("gos.fxml");
    }






   /* public void userNotice(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("notice.fxml");

    }*/

    /*public void userEmployee(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("notice.fxml");

    }

    public void userOwner(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("notice.fxml");

    }*/

}