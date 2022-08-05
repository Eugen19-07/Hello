import One.Arabic_Calculator;
import One.Rome_Calculator;
import java.util.HashMap;
import One.Rome_digit;
import java.util.HashSet;

import java.util.HashSet;
import java.util.Scanner;

import static One.Rome_digit.*;

public class HelloWorld {
    public static void main(String[] args) {
        Rome_Calculator rCalculator = new Rome_Calculator();
        Arabic_Calculator aCalculator = new Arabic_Calculator();
        Scanner calc = new Scanner(System.in);

        HashMap<String, String> romeDigits = new HashMap<String, String>();
        romeDigits.put("I","1");
        romeDigits.put("II","2");
        romeDigits.put("III","3");
        romeDigits.put("IV","4");
        romeDigits.put("V","5");
        romeDigits.put("VI","6");
        romeDigits.put("VII","7");
        romeDigits.put("VIII","8");
        romeDigits.put("IX","9");
        romeDigits.put("X","10");
        romeDigits.put("XI","11");
        romeDigits.put("XII","12");
        romeDigits.put("XIII","13");
        romeDigits.put("XIV","14");
        romeDigits.put("XV","15");
        romeDigits.put("XVI","16");
        romeDigits.put("XVII","17");
        romeDigits.put("XVIII","18");
        romeDigits.put("XIX","19");
        romeDigits.put("XX","20");

        HashMap<String, String> arabicDigits = new HashMap<String, String>();
        arabicDigits.put("1", "I");
        arabicDigits.put("2", "II");
        arabicDigits.put("3", "III");
        arabicDigits.put("4","IV");
        arabicDigits.put("5", "V");
        arabicDigits.put("6", "VI");
        arabicDigits.put("7", "VII");
        arabicDigits.put("8", "VIII");
        arabicDigits.put("9", "IX");
        arabicDigits.put("10", "X");
        arabicDigits.put("11", "XI");
        arabicDigits.put("12", "XII");
        arabicDigits.put("13", "XIII");
        arabicDigits.put("14", "XIV");
        arabicDigits.put("15", "XV");
        arabicDigits.put("16", "XVI");
        arabicDigits.put("17", "XVII");
        arabicDigits.put("18", "XVIII");
        arabicDigits.put("19", "XIX");
        arabicDigits.put("20", "XX");



        while (true) {
            String symbols = calc.nextLine();
            String[] digits = symbols.split(" ");


         if (arabicDigits.containsKey(digits[0]) & arabicDigits.containsKey(digits[2])){
             aCalculator.acalculation(digits[0], digits[1], digits[2]);}

         if (romeDigits.containsKey(digits[0]) & romeDigits.containsKey(digits[2])){
             rCalculator.rcalculation(digits[0], digits[1], digits[2]);
         }
        }
    }
}
