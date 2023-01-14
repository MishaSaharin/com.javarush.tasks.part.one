package multiarray;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int numberStr = keyboard.nextInt();
        multiArray = new int[numberStr][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[keyboard.nextInt()];
        }
    }
}
