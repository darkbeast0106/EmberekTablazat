package hu.petrik.emberektablazat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberekController {
    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, String> nevOszlop;
    @FXML
    private TableColumn<Ember, Integer> korOszlop;

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
}