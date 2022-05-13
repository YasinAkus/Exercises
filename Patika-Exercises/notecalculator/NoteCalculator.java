package NoteCalculator;

import java.util.Scanner;

public class NoteCalculator {

        public static void main(String[] args) {

                int math,physics,chemistry,biology,history,music;
                double average = 0;

                Scanner input = new Scanner(System.in);

                System.out.print("Enter your math grade: ");
                math = input.nextInt();

                System.out.print("Enter your physics grade: ");
                physics = input.nextInt();

                System.out.print("Enter your chemistry grade: ");
                chemistry = input.nextInt();

                System.out.print("Enter your biology grade: ");
                biology = input.nextInt();

                System.out.print("Enter your history grade: ");1
                history = input.nextInt();

                System.out.print("Enter your music grade: ");
                music = input.nextInt();

                average = (math+physics+chemistry+biology+history+music)/6;
                System.out.println("Your average grade: " +average);

                String result=60< average?"Pass " : "Fail ";
                System.out.println(result);


        }
}
