package militaryCommissar;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        if (age > 17) {
            if (age < 29) {
                System.out.println(name + militaryCommissar);
            } else {

            }
        }
    }
}
