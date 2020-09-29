import java.util.Scanner;
import java.lang.Math;

public class BodyMassIndex {



            public static boolean moreInput() {

                Scanner input = new Scanner(System.in);
                String answer = input.nextLine();
                if (answer == "Y") {
                }
            }


        public static void main(String[] args) { //test
            bmiCategories(95, 134);
        }


        public static double getUserHeight() {

            System.out.print("Enter a height:");
            Scanner input = new Scanner(System.in);
            double height_input = input.nextDouble();
            if (height_input < 0) {
                System.out.print("Negative numbers are not acceptable");
            }
            return height_input;

        }


        public static double getUserWeight() {


            System.out.print("Enter a weight:");
            Scanner input = new Scanner(System.in);
            double weight_input = input.nextDouble();
            if (weight_input < 0) {
                System.out.print("Negative numbers are not acceptable");
            }
            return weight_input;


        }



        public static double bmiCalculator(double height, double weight){
            double bmi = ((703 * weight)/Math.pow(height, 2));
            return bmi;
        }

        public static void bmiCategories(double height, double weight) {

            double bm = bmiCalculator(height, weight);
            if (bm < 18.5) {
                System.out.println("You are underweight");
            } else if (bm > 18.5 && bm < 24.9) {
                System.out.println("Your weight is normal");
            } else if (bm > 25 && bm < 29.9) {
                System.out.println("You are overweight");
            } else if (bm >= 30) {
                System.out.println("You are obese");
            }
        }
    }

/*
       public static double displayBmiInfo(double bmi){


       }


       public static double displayBmiStatistics(double[] bmiData){

       }


       public static void displayBmiStatistics(){
              ;
       }
*/

