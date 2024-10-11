package com.mycompany.demo;

import static com.mycompany.demo.Calculator.soma;
import javax.swing.JOptionPane;

public class Calculator {
      static int op = Integer.parseInt(JOptionPane.showInputDialog("Insira a opçao desejada: \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão"));
      static double  num1 =  Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro numero"));
      static double  num2 =  Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo numero"));
    public static void main(String[] args) {
      
          switch (op) {
              case 1:
                  soma(num1, num2);
                  break;
              case 2:
                  subtracao(num1, num2);
                  break;
              case 3:
                  multiplicacao(num1, num2);
                  break;
              default:
                  divisao(num1, num2);
                  break;
          }
    }
    
    public static double soma(double num1, double num2) {
       double response = num1 + num2;
       System.out.println("A soma dos dois números é " + response);
       return response; 
    }
    
    public static double subtracao(double num1, double num2){
        double response = num1 - num2;
        System.out.println("A subtração dos dois números é " + response);
        return response;
    }
    
    public static double multiplicacao(double num1, double num2){
        double response = num1 * num2;
        System.out.println("A multiplicação dos dois números é " + response);
        return response;
    }
    
    public static double divisao(double num1, double num2){
        double response = num1 / num2;
        System.out.println("A divisão dos dois números é " + response);
        return response;
    }
    
    
    
    
}
