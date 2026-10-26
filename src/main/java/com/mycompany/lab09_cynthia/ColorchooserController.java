/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab09_cynthia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.paint.Color;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
/**
 * FXML Controller class
 *Github link: https://github.com/Cynthiaz1012/Lab09
 * @author 2557705
 */
public class ColorchooserController implements Initializable {


    @FXML
    private Rectangle colorRectangle;
    @FXML
    private Slider redSlider;
    @FXML
    private Slider greenSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;
    @FXML
    private TextField redTextField;
    @FXML
    private TextField greenTextField;
    @FXML
    private TextField blueTextField;
    @FXML
    private TextField alphaTextField;
    
    
    private double red;
    private double green;
    private double blue;
    private double alpha;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       redTextField.textProperty().bind(redSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(greenSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty().bind(blueSlider.valueProperty().asString("%.0f"));
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.2f"));

        red = redSlider.getValue();
        green = greenSlider.getValue();
        blue = blueSlider.getValue();
        alpha = alphaSlider.getValue();

        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            red = newValue.doubleValue();
            updateColor();
        });

        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            green = newValue.doubleValue();
            updateColor();
        });

        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            blue = newValue.doubleValue();
            updateColor();
        });

        alphaSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            alpha = newValue.doubleValue();
            updateColor();
        });
    }
    
     private void updateColor() {
        Color color = Color.rgb((int) red, (int) green, (int) blue, alpha);
        colorRectangle.setFill(color);
    }
    
}
