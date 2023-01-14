package octalnumber;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int octalNumber;
        if (decimalNumber <= 0) {
            octalNumber = 0;
            return octalNumber;
        }
        octalNumber = 0;
        int i = 0;
        while (decimalNumber != 0) {
            octalNumber = octalNumber + ((decimalNumber % 8) * (int) Math.pow(10, i));
            decimalNumber = decimalNumber / 8;
            i++;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int decimalNumber;
        if (octalNumber <= 0) {
            decimalNumber = 0;
            return decimalNumber;
        }
        decimalNumber = 0;
        int i = 0;
        while (octalNumber != 0) {
            decimalNumber = decimalNumber + ((octalNumber % 10) * (int) Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;
        }
        return decimalNumber;
    }
}
