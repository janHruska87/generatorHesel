package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private TextField tf_vstupniZnaky;
    @FXML
    private TextField tf_vygenerovaneHeslo;
    @FXML
    private Button bt_generuj;
    @FXML
    private Button bt_vycisti;
    @FXML
    private Button bt_konec;
    @FXML
    private Spinner<Integer> sp_pocetZnaku;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SpinnerValueFactory<Integer> spValue = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
        sp_pocetZnaku.setValueFactory(spValue);
        tf_vstupniZnaky.setText("ABCDEFGHIJKLMNOPQabcdefgijklmnopq123456789");
    }


    public void getHeslo(ActionEvent actionEvent) {
        Heslo psw = new Heslo(sp_pocetZnaku.getValue(),tf_vstupniZnaky.getText());
        tf_vygenerovaneHeslo.setText(psw.getHeslo());

    }

    public void setClear(ActionEvent actionEvent) {
        tf_vygenerovaneHeslo.setText("");
        tf_vstupniZnaky.setText("");
        SpinnerValueFactory<Integer> spValue = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
        sp_pocetZnaku.setValueFactory(spValue);
    }

    public void closeWindow(ActionEvent actionEvent) {
        Stage stage = (Stage) bt_konec.getScene().getWindow();
        stage.close();
    }
}

