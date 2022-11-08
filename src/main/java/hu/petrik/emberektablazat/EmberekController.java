package hu.petrik.emberektablazat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberekController {
    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, String> nevOszlop;
    @FXML
    private TableColumn<Ember, Integer> korOszlop;
    @FXML
    private TextField nevMezo;
    @FXML
    private Spinner<Integer> korMezo;

    @FXML
    private void initialize() {
        nevOszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
        korOszlop.setCellValueFactory(new PropertyValueFactory<>("eletkor"));
        Ember e1 = new Ember("Gipsz Jakab", 25);
        Ember e2 = new Ember("Teszt Elek", 42);
        Ember e3 = new Ember("Lakatos Brandon Károly", 17);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);
    }

    @FXML
    private void hozzaadClick() {
        String nev = nevMezo.getText().trim();
        int kor = korMezo.getValue();
        Ember e = new Ember(nev, kor);
        emberek.getItems().add(e);
    }

    @FXML
    private void torlesClick() {
        int index = emberek.getSelectionModel().getSelectedIndex();
        if (index == -1){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Törléshez előbb válasszon ki elemet");
            alert.show();
            return;
        }
        Ember torlendoEmber = emberek.getSelectionModel().getSelectedItem();
        emberek.getItems().remove(torlendoEmber);
    }
}