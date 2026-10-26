package com.mycompany.lab09_cynthia;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Slider alphaSlider;

    @FXML
    private TextField alphaTextField;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField blueTextField;

    @FXML
    private Slider greenSlider;

    @FXML
    private TextField greenTextField;

    @FXML
    private Slider redSlider;

    @FXML
    private TextField redTextField;
    
    private int red;
    private int green;
    private int blue;
    private double alpha;

}
