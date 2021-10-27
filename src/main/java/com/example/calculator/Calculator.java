package com.example.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculator extends Application {

    Label label1;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button equal;
    Button clear;
    Button neg;
    String firstNum = "";
    String secondNum = "";
    String operation = "";
    String fullOp = "";
    Boolean stillFirst = true;
    Boolean afterEqual = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX Calculator");
        label1 = new Label("input calculation");
        VBox root = new VBox();
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();
        HBox row5 = new HBox();
        HBox row6 = new HBox();

        Scene scene = new Scene(root, 200, 300);
        stage.setScene(scene);

        createButtons();
        updateAllButtons();

        zero.setMinWidth(40);
        zero.setMinHeight(40);
        one.setMinWidth(40);
        one.setMinHeight(40);
        two.setMinWidth(40);
        two.setMinHeight(40);
        three.setMinWidth(40);
        three.setMinHeight(40);
        four.setMinWidth(40);
        four.setMinHeight(40);
        five.setMinWidth(40);
        five.setMinHeight(40);
        six.setMinWidth(40);
        six.setMinHeight(40);
        seven.setMinWidth(40);
        seven.setMinHeight(40);
        eight.setMinWidth(40);
        eight.setMinHeight(40);
        nine.setMinWidth(40);
        nine.setMinHeight(40);
        plus.setMinWidth(40);
        plus.setMinHeight(40);
        minus.setMinWidth(40);
        minus.setMinHeight(40);
        multiply.setMinWidth(40);
        multiply.setMinHeight(40);
        divide.setMinWidth(40);
        divide.setMinHeight(40);
        clear.setMinWidth(40);
        clear.setMinHeight(40);
        equal.setMinWidth(40);
        equal.setMinHeight(40);
        neg.setMinWidth(160);
        neg.setMinHeight(40);
        label1.setMinHeight(40);


        row1.getChildren().add(label1);
        row2.getChildren().addAll(one, two, three, plus);
        row3.getChildren().addAll(four, five, six, minus);
        row4.getChildren().addAll(seven, eight, nine, multiply);
        row5.getChildren().addAll(clear, zero, equal, divide);
        row6.getChildren().add(neg);
        root.getChildren().addAll(row1, row6, row2, row3, row4, row5);
        stage.show();
    }

    public void buttonFunctionality(Button button) {
        if (button.getId().equals("=")) {
            button.setOnAction(actionEvent -> {
                long first;
                long second;
                long ans = 0;
                switch (operation) {
                    case "+" -> {
                        first = Long.parseLong(firstNum);
                        second = Long.parseLong(secondNum);
                        ans = first + second;
                    }
                    case "-" -> {
                        first = Long.parseLong(firstNum);
                        second = Long.parseLong(secondNum);
                        ans = first - second;
                    }
                    case "x" -> {
                        first = Long.parseLong(firstNum);
                        second = Long.parseLong(secondNum);
                        ans = first * second;
                    }
                    case "/" -> {
                        first = Long.parseLong(firstNum);
                        second = Long.parseLong(secondNum);
                        if (second != 0) {
                            ans = first / second;
                        }
                    }
                }
                String answer = Long.toString(ans);
                label1.setText(answer);
                secondNum = "";
                operation = "";
                firstNum = answer;
                fullOp = answer;
                stillFirst = true;
                afterEqual = true;
            });
        }
        else if (button.getId().equals("neg")) {
            button.setOnAction(actionEvent -> {
                if (firstNum.equals("")) {
                    firstNum = "-";
                    fullOp = "-";
                    afterEqual = false;
                }
                else if (secondNum.equals("") && !stillFirst) {
                    secondNum += "-";
                    fullOp += "-";
                }
                else {
                    System.out.println("Please make numbers negative at the start.");
                }
                label1.setText(fullOp);
            });
        }
        else if (button.getId().equals("C")) {
            clear.setOnAction(actionEvent -> {
                firstNum = "";
                secondNum = "";
                operation = "";
                fullOp = "";
                stillFirst = true;
                label1.setText("input calculation");
            });
        }
        else if (button.getId().equals("+") || button.getId().equals("-") || button.getId().equals("x") || button.getId().equals("/")) {
            button.setOnAction(actionEvent -> {
                if (stillFirst) {
                    operation = button.getId();
                    fullOp += " " + button.getId() + " ";
                    stillFirst = false;
                    afterEqual = false;
                }
                label1.setText(fullOp);
            });
        }
        else {
            button.setOnAction(actionEvent -> {
                if (afterEqual) {
                    firstNum = button.getId();
                    fullOp = button.getId();
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += button.getId();
                    fullOp += button.getId();
                }
                else {
                    secondNum += button.getId();
                    fullOp += button.getId();
                }
                label1.setText(fullOp);
            });
        }

    }

    public void updateAllButtons() {
        buttonFunctionality(zero);
        buttonFunctionality(one);
        buttonFunctionality(two);
        buttonFunctionality(three);
        buttonFunctionality(four);
        buttonFunctionality(five);
        buttonFunctionality(six);
        buttonFunctionality(seven);
        buttonFunctionality(eight);
        buttonFunctionality(nine);
        buttonFunctionality(neg);
        buttonFunctionality(plus);
        buttonFunctionality(minus);
        buttonFunctionality(multiply);
        buttonFunctionality(divide);
        buttonFunctionality(clear);
        buttonFunctionality(equal);
    }

    public void createButtons() {
        zero = new Button("0");
        zero.setId("0");

        one = new Button("1");
        one.setId("1");

        two = new Button("2");
        two.setId("2");

        three = new Button("3");
        three.setId("3");

        four = new Button("4");
        four.setId("4");

        five = new Button("5");
        five.setId("5");

        six = new Button("6");
        six.setId("6");

        seven = new Button("7");
        seven.setId("7");

        eight = new Button("8");
        eight.setId("8");

        nine = new Button("9");
        nine.setId("9");

        neg = new Button("neg");
        neg.setId("neg");

        clear = new Button("C");
        clear.setId("C");

        plus = new Button("+");
        plus.setId("+");

        minus = new Button("-");
        minus.setId("-");

        multiply = new Button("x");
        multiply.setId("x");

        divide = new Button("/");
        divide.setId("/");

        equal = new Button("=");
        equal.setId("=");
    }
}