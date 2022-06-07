package com.example.workshop11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField mainText;
    String op="";
    long num1;
    long num2;
    public void number(ActionEvent event){
    String  number=((Button)event.getSource()).getText();
    mainText.setText( mainText.getText()+number);
    }
    public void operation(ActionEvent event){
      String operation=((Button)event.getSource()).getText();
      if(!operation.equals("=")){

          op=operation;
          num1=Long.parseLong(mainText.getText());
          mainText.setText("");
      }
      else{

          num2=Long.parseLong(mainText.getText());
          calculate(num1,num2,op);
          op="";
      }
    }
    public void calculate(long n1,long n2,String  op){
        switch (op){
            case "+":mainText.setText(n1+n2+"");break;
            case "-":mainText.setText(n1-n2+"");break;
            case "/":mainText.setText(n1/n2+"");break;
            case "*":mainText.setText((n1*n2)+"");break;
            case "c":mainText.setText("");
        }
    }
}