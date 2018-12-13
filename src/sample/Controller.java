package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
    private ComboBox cb_pocetZnaku;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
            ObservableList<String> znaky = FXCollections.observableArrayList("1","2","3");
            cb_pocetZnaku.setItems(znaky);

    }
}

