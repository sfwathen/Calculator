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

    Label Label1;
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
        Label1 = new Label("input calculation");
        VBox root = new VBox();
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();
        HBox row5 = new HBox();
        HBox row6 = new HBox();

        Scene scene = new Scene(root, 200, 300);
        stage.setScene(scene);

        zero = new Button("0");
        zero.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    fullOp = "0";
                    firstNum = "0";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "0";
                    fullOp += "0";
                }
                else {
                    secondNum += "0";
                    fullOp += "0";
                }
                Label1.setText(fullOp);
            }
        });

        one = new Button("1");
        one.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    fullOp = "1";
                    firstNum = "1";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "1";
                    fullOp += "1";
                }
                else {
                    secondNum += "1";
                    fullOp += "1";
                }
                Label1.setText(fullOp);
            }
        });

        two = new Button("2");
        two.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    fullOp = "2";
                    firstNum = "2";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "2";
                    fullOp += "2";
                }
                else {
                    secondNum += "2";
                    fullOp += "2";
                }
                Label1.setText(fullOp);
            }
        });

        three = new Button("3");
        three.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    fullOp = "3";
                    firstNum = "3";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "3";
                    fullOp += "3";
                }
                else {
                    secondNum += "3";
                    fullOp += "3";
                }
                Label1.setText(fullOp);
            }
        });

        four = new Button("4");
        four.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    firstNum = "4";
                    fullOp = "4";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "4";
                    fullOp += "4";
                }
                else {
                    secondNum += "4";
                    fullOp += "4";
                }
                Label1.setText(fullOp);
            }
        });

        five = new Button("5");
        five.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    firstNum = "5";
                    fullOp = "5";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "5";
                    fullOp += "5";
                }
                else {
                    secondNum += "5";
                    fullOp += "5";
                }
                Label1.setText(fullOp);
            }
        });

        six = new Button("6");
        six.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    firstNum = "6";
                    fullOp = "6";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "6";
                    fullOp += "6";
                }
                else {
                    secondNum += "6";
                    fullOp += "6";
                }
                Label1.setText(fullOp);
            }
        });

        seven = new Button("7");
        seven.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    firstNum = "7";
                    fullOp = "7";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "7";
                    fullOp += "7";
                }
                else {
                    secondNum += "7";
                    fullOp += "7";
                }
                Label1.setText(fullOp);
            }
        });

        eight = new Button("8");
        eight.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    firstNum = "8";
                    fullOp = "8";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "8";
                    fullOp += "8";
                }
                else {
                    secondNum += "8";
                    fullOp += "8";
                }
                Label1.setText(fullOp);
            }
        });

        nine = new Button("9");
        nine.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (afterEqual) {
                    firstNum = "9";
                    fullOp = "9";
                    afterEqual = false;
                }
                else if (stillFirst) {
                    firstNum += "9";
                    fullOp += "9";
                }
                else {
                    secondNum += "9";
                    fullOp += "9";
                }
                Label1.setText(fullOp);
            }
        });

        neg = new Button("neg");
        neg.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
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
                Label1.setText(fullOp);
            }
        });

        clear = new Button("C");
        clear.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                firstNum = "";
                secondNum = "";
                operation = "";
                fullOp = "";
                stillFirst = true;
                Label1.setText("input calculation");
            }
        });

        plus = new Button("+");
        plus.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (stillFirst) {
                    operation = "+";
                    fullOp += " + ";
                    stillFirst = false;
                    afterEqual = false;
                }
                Label1.setText(fullOp);
            }
        });

        minus = new Button("-");
        minus.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (stillFirst) {
                    operation = "-";
                    fullOp += " - ";
                    stillFirst = false;
                    afterEqual = false;
                }
                Label1.setText(fullOp);
            }
        });

        multiply = new Button("x");
        multiply.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (stillFirst) {
                    operation = "x";
                    fullOp += " x ";
                    stillFirst = false;
                    afterEqual = false;
                }
                Label1.setText(fullOp);
            }
        });

        divide = new Button("/");
        divide.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                if (stillFirst) {
                    operation = "/";
                    fullOp += " / ";
                    stillFirst = false;
                    afterEqual = false;
                }
                Label1.setText(fullOp);
            }
        });

        equal = new Button("=");
        equal.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                long first, second, ans = 0;
                switch (operation) {
                    case "+":
                        first = Long.parseLong(firstNum);
                        second = Long.parseLong(secondNum);
                        ans = first + second;
                        break;
                    case "-":
                        first = Long.parseLong(firstNum);
                        second = Long.parseLong(secondNum);
                        ans = first - second;
                        break;
                    case "x":
                        first = Long.parseLong(firstNum);
                        second = Long.parseLong(secondNum);
                        ans = first * second;
                        break;
                    case "/":
                        first = Long.parseLong(firstNum);
                        second = Long.parseLong(secondNum);
                        ans = first / second;
                        break;
                }
                String answer = Long.toString(ans);
                Label1.setText(answer);
                secondNum = "";
                operation = "";
                firstNum = answer;
                fullOp = answer;
                stillFirst = true;
                afterEqual = true;
            }
        });

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
        Label1.setMinHeight(40);


        row1.getChildren().add(Label1);
        row2.getChildren().addAll(one, two, three, plus);
        row3.getChildren().addAll(four, five, six, minus);
        row4.getChildren().addAll(seven, eight, nine, multiply);
        row5.getChildren().addAll(clear, zero, equal, divide);
        row6.getChildren().add(neg);
        root.getChildren().addAll(row1, row6, row2, row3, row4, row5);
        stage.show();
    }
}