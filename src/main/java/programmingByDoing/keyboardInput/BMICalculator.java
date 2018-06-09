package programmingByDoing.keyboardInput;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double height;
        double weight;
        double square;

        Scanner sc = new Scanner(System.in);

        System.out.print("Type your height(m): ");
        height = sc.nextDouble();
        System.out.print("Type your weight(kg): ");
        weight = sc.nextDouble();
        square = Math.pow(height, 2);
        System.out.println("Your BMI is: " + (weight / square));
    }
}