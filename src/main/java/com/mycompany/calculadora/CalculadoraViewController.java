/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class CalculadoraViewController implements Initializable {

    private String expressao = "";
    
    @FXML
    private TextField tbExpressao;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void addValueExpression(ActionEvent e){
        String num = ((Button)e.getSource()).getText();
        expressao += num;   
        tbExpressao.setText(expressao);
    }
    
    public void clearValuesExpression(){
        expressao = "";
        tbExpressao.setText(expressao);
    }
    
    public void finalizateExpression(){
        Expression calculo = new ExpressionBuilder(expressao).build();
        expressao += " = " + calculo.evaluate();
        tbExpressao.setText(expressao);
        expressao = "";
    }
    
}
