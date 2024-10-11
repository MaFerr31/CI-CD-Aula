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
                  soma();
                  break;
              case 2:
                  subtracao();
                  break;
              case 3:
                  multiplicacao();
                  break;
              default:
                  divisao();
                  break;
          }
    }
    
    public static double soma() {
       double response = num1 + num2;
       System.out.println("A soma dos dois números é " + response);
       return response; 
    }
    
    public static double subtracao(){
        double response = num1 - num2;
        System.out.println("A subtração dos dois números é " + response);
        return response;
    }
    
    public static double multiplicacao(){
        double response = num1 * num2;
        System.out.println("A multiplicação dos dois números é " + response);
        return response;
    }
    
    public static double divisao(){
        double response = num1 / num2;
        System.out.println("A divisão dos dois números é " + response);
        return response;
    }

    public static int getOp() {
        return op;
    }

    public static void setOp(int op) {
        Calculator.op = op;
    }

    public static double getNum1() {
        return num1;
    }

    public static void setNum1(double num1) {
        Calculator.num1 = num1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double num2) {
        Calculator.num2 = num2;
    }
    
    public void solicitarValores(){
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
    }
}
