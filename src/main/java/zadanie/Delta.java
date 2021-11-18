package zadanie;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("a = " + a);
        double b = scanner.nextDouble();
        System.out.println("b = " + b);
        double c = scanner.nextDouble();
        System.out.println("c = " + c);

        if(a != 0){
            double delta = b * b - 4 * a * c;

            if(delta < 0 ){
                System.out.println("Delta ujemna");
            } else if(delta == 0){
                double x = ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("x1,2 = " + x);
            }else {
                double x1 = ((-b - Math.sqrt(delta)) / (2 * a));
                double x2 = ((-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + x2);
                System.out.println("x1 = " + x1);
            }
        } else{
            System.out.println("a jest rowne 0");
        }



    }
}

