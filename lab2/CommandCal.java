// package lab2;

class CommandCal {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[2]);
        Double ans = 0.0;
        switch (args[1]) {
            case "+":
                ans = a + b;
                break;
            case "-":
                ans = a - b;
                break;
            case "*":
                ans = a * b;
                break;
            case "/":
                ans = a / b;
                break;
            default:
                break;
        }
        System.out.println("Result is " + ans);

    }
}
