package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TitledPane;

import java.io.IOException;

public class Notice {

    @FXML
    private Button logout;

    @FXML
    private SplitMenuButton ViewUpdate1;

    @FXML
    private SplitMenuButton ViewUpdate2;

    @FXML
    private SplitMenuButton ViewUpdate3;

    @FXML
    private Button Home;

    @FXML
    private Button Previous;


    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");

    }

    public void userViewUpdate1(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("notice.fxml");

    }
    public void userViewUpdate2(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("notice.fxml");

    }
    public void userViewUpdate3(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("notice.fxml");

    }


    public void userHome(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }

    public void userPrevious(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }
}
