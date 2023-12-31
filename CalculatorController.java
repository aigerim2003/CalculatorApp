package com.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    Calculator calc = new Calculator();

    @FXML
    private TextField inputField;

    @FXML
    protected void onButtonPlusClick(){
        calc.setOperator('+');
        String val = inputField.getText();
        double d = Double.parseDouble(val);

        calc.setOp1(d);
        inputField.setText("");

    }
    @FXML
    protected void onButtonEqualClick(){
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp2(d);
        calc.calculate();
        d = calc.getResult();
        inputField.setText("" + d);
    }
    @FXML
    protected void onButtonOneClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "1");
    }
    @FXML
    protected void onButtonTwoClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "2");
    }
    @FXML
    protected void onButtonTreeClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "3");
    }
    @FXML
    protected void onButtonFourClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "4");
    }
    @FXML
    protected void onButtonFiveClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "5");
    }
    @FXML
    protected void onButtonSixClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "6");
    }
    @FXML
    protected void onButtonSevenClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "7");
    }
    @FXML
    protected void onButtonEightClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "8");
    }
    @FXML
    protected void onButtonNineClick(){
        String val = inputField.getText();
        if (val.equals("0")) val = "";
        inputField.setText(val + "9");
    }
    @FXML
    protected void onButtonZeroClick() {
        String val = inputField.getText();
        if (val.equals("0") || val.isEmpty()) {
            inputField.setText("0");
        } else {
            inputField.setText(val + "0");
        }
    }



    @FXML
    protected void onButtonClearClick(){
        inputField.setText(" ");
    }
    @FXML
    protected void onButtonSubtractClick() {
        calc.setOperator('-');
        String val = inputField.getText();
        double d = Double.parseDouble(val);

        calc.setOp1(d);
        inputField.setText("");
    }

    @FXML
    protected void onButtonMultiplyClick() {
        calc.setOperator('*');
        String val = inputField.getText();
        double d = Double.parseDouble(val);

        calc.setOp1(d);
        inputField.setText("");
    }

    @FXML
    protected void onButtonDivideClick() {
        calc.setOperator('/');
        String val = inputField.getText();
        double d = Double.parseDouble(val);

        calc.setOp1(d);
        inputField.setText("");
    }


}