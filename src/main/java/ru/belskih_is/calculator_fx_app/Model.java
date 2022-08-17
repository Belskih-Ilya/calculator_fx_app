package ru.belskih_is.calculator_fx_app;

public class Model {

    public long calculate (long x, long y, String operator) {
        switch (operator) {
            case "+":
                return (x+y);
            case "-":
                return (x-y);
            case "*":
                return (x*y);
            case "/":
                if (y == 0) return 0;
                return (x/y);
        }
        System.out.println("Неизвестный оператор " + operator);
        return 0;
    }
}
