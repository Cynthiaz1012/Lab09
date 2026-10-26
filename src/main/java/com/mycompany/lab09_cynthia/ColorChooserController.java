package com.mycompany.lab09_cynthia;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

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
    
    @FXML
    private Rectangle colorRectangle;
    
    private double red;
    private double green;
    private double blue;
    private double alpha;
    
    @FXML
    public void initialize() {
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
        });

        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            green = newValue.doubleValue();
        });

        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            blue = newValue.doubleValue();
        });

        alphaSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            alpha = newValue.doubleValue();
        });
    }
    
     private void updateColor() {
        Color color = Color.rgb((int) red, (int) green, (int) blue, alpha);
        colorRectangle.setFill(color);
    }

}
