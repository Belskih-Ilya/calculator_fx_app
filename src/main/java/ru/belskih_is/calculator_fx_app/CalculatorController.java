package ru.belskih_is.calculator_fx_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CalculatorController {

    @FXML
    private Text output;
    private long num1 = 0;
    private long num2 = 0;
    private boolean start = true;
    private String operator = "";
    private Model model = new Model();


    @FXML
    private void numClicked(ActionEvent event) {
        if(start) {
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void operatorClicked(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if (!value.equals("=")) {
            num1 = Long.parseLong(output.getText());
            operator = value;
            output.setText("");
        } else {
            if (operator.isEmpty()) return;
            num2 = Long.parseLong(output.getText());
            output.setText(String.valueOf(model.calculate(num1, num2, operator)));
            start = true;
        }

    }
}