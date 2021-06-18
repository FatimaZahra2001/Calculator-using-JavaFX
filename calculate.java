package application;

public class calculate {
    long pi = (long) Math.PI;
    long e = (long) Math.E;
    public float calculate(long num1, long num2,  String operator){
        switch (operator){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "÷":
                if(num2 == 0){
                    return 0;
                }
                else
                    return num1 / num2;
            case "x10":
                return  num1 * 10;
            case "SIN":
                return (float) Math.sin(num1);
            default:
                return 0;
        }
    }
}
