package One;

public enum Rome_digit {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

    private int digit;

    Rome_digit(int digit) {
        this.digit = digit;}

    public int getDigit() {
        return digit;
    }
}
