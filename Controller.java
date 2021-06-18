package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    Label result;
    private long num1 = 0;
    private String operator = "";
    private boolean start = true;
    calculate process = new calculate();
    long pi = (long) Math.PI;
    long e = (long) Math.E;

    public void processNumbers(ActionEvent event){
        if(start){
            result.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        result.setText(result.getText() + value);

    }
    public void processOperators(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(!value.equals("=")){
            operator = value;
            num1 = Long.parseLong(result.getText());
            result.setText("");
        }
        else{
            long num2 = Long.parseLong(result.getText());
            float answer = process.calculate(num1, num2, operator);
            result.setText(String.valueOf(answer));
            operator = "";
            start = true;
        }

    }
}
