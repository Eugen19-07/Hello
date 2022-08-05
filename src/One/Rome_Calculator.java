package One;

public class Rome_Calculator {
    String digit1;
    String sign;
    String digit2;

   public void rcalculation(String digit1, String sign, String digit2) {
        this.digit1 = digit1;
        this.sign = sign;
        this.digit2 = digit2;


    switch(sign) {
        case "-":
            System.out.println(Rome_digit.valueOf(digit1).getDigit() - Rome_digit.valueOf(digit2).getDigit());
            break;
        case "+":
            System.out.println(Rome_digit.valueOf(digit1).getDigit() + Rome_digit.valueOf(digit2).getDigit());
            break;
        case "/":
            System.out.println(Rome_digit.valueOf(digit1).getDigit() / Rome_digit.valueOf(digit2).getDigit());
            break;
        case "*":
            System.out.println(Rome_digit.valueOf(digit1).getDigit() * Rome_digit.valueOf(digit2).getDigit());
            break;
        default: break;
        }
    }
}
