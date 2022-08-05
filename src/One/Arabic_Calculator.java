package One;

public class Arabic_Calculator {
    String digit1;
    String sign;
    String digit2;

    public void acalculation(String digit1, String sign, String digit2) {
        this.digit1 = digit1;
        this.sign = sign;
        this.digit2 = digit2;

    switch (sign) {
            case "-":
                System.out.println(Integer.parseInt(digit1) - Integer.parseInt(digit2));
                break;
            case "+":
                System.out.println(Integer.parseInt(digit1) + Integer.parseInt(digit2));
                break;
            case "/":
                System.out.println(Integer.parseInt(digit1) / Integer.parseInt(digit2));
                break;
            case "*":
                System.out.println(Integer.parseInt(digit1) * Integer.parseInt(digit2));
                break;
        default: break;}
    }
}
