/**
 * Start with the BMI Calculator you wrote previously (BMICalc.java). Then use some if statements to show the category for a given BMI.
 * <p>
 * BMI	category
 * less than 18.5	underweight
 * 18.5 to 24.9	normal weight
 * 25.0 to 29.9	overweight
 * 30.0 or more	obese
 * Note: Although BMI is a very good estimate of human body fat, the formula doesn't work well for athletes with a lot of muscle, or people who are extremely short or very tall. If you are concerned about your BMI, check with your doctor.
 * <p>
 * Bonus #1 - More Categories
 * For +10 bonus points, use more if statements to show the ALL the BMI categories.
 * <p>
 * BMI	category
 * less than 15.0	very severely underweight
 * 15.0 to 16.0	severely underweight
 * 16.1 to 18.4	underweight
 * 18.5 to 24.9	normal weight
 * 25.0 to 29.9	overweight
 * 30.0 to 34.9	moderately obese
 * 35.0 to 39.9	severely obese
 * 40.0 and up	very severely (or "morbidly") obese
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        double height;
        double weight;
        double square;
        double bmi;

        Scanner sc = new Scanner(System.in);

        System.out.print("Type your height(m): ");
        height = sc.nextDouble();
        System.out.print("Type your weight(kg): ");
        weight = sc.nextDouble();
        square = Math.pow(height, 2);
        bmi = (weight / square);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 15.0) {
            System.out.println("Very severely underweight");
        } else if (bmi > 15.0 && bmi < 16.0) {
            System.out.println("Severely underweight");
        } else if (bmi > 16.1 && bmi < 18.4) {
            System.out.println("Underweight");
        } else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi > 25.0 && bmi < 29.9) {
            System.out.println("Overweight");
        } else if (bmi > 30.0 && bmi < 34.9) {
            System.out.println("Moderately obese");
        } else if (bmi > 35.0 && bmi < 39.9) {
            System.out.println("Severely obese");
        } else if (bmi > 40.0) {
            System.out.println("Very severely (or \"morbidly\") obese");
        }
    }
}