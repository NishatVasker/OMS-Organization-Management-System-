package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;

import java.io.IOException;

public class Owner {

    @FXML
    private Button logout;



    @FXML
    private SplitMenuButton SplitMenuButton;

    @FXML
    private Button ProjectWork;

    @FXML
    private SplitMenuButton SplitMenuButton1;

    @FXML
    private Button ProjectWork1;


    @FXML
    private Button Home;

    @FXML
    private Button Previous;


    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");/////was to change

    }

    public void userSplitMenuButton(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("owner.fxml");
    }
    public void projectWork(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("projectWork.fxml");/////was to change

    }
    public void userPrevious(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }

    public void userHome(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }
    public void projectWork1(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("projectWork1.fxml");/////was to change

    }



}
