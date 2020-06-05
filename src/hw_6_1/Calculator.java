package hw_6_1;

interface Calculator {

    static double calculate(double a, double b, String action) {
        switch (action) {

            case "*":
                return a * b;

            case "+":
                return a + b;

            case "-":
                return a - b;

            case "/":
                return a / b;
            default:
                return 0.0;
        }
    }


    static double calculator2Elements(double a, double b, String action) {

        return calculate(a, b, action);
    }


    static double calculator3Elements(double a, double b, double c, String action1, String action2) {

        double result1 = calculator2Elements(a, b, action1);

        return calculate(result1, c, action2);
    }


}