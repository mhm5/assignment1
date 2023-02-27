package com.mycompany.assignment1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class ClearController {
    @FXML
    private Button canada;

    @FXML
    private Button russia;

    @FXML
    private Button lesotho;

    @FXML
    private Button germany;

    @FXML
    private Button clear;

    @FXML
    private Button bostswana;

    @FXML
    void Rassia(ActionEvent event) throws IOException {
        App.setRoot("secondary");        
    }

    @FXML
    void Germany(ActionEvent event) throws IOException {
        App.setRoot("third");

    }

    @FXML
    void Botswana(ActionEvent event) throws IOException {
        App.setRoot("fourth");

    }

    @FXML
    void Lesotho(ActionEvent event) throws IOException {
        App.setRoot("fifth");

    }

    @FXML
    void Canada(ActionEvent event) throws IOException {
        
        App.setRoot("primary");
    }
}
