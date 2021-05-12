package fs.apidef.identifyservice.java.java_homework2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double x1, x2, x3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập hệ số x1= ");
        x1 = scan.nextInt();

        System.out.println("Nhập hệ số x2= ");
        x2 = scan.nextInt();

        System.out.println("Nhập hệ số x3= ");
        x3 = scan.nextInt();

        if (x1 + x2 > x3 || x1 + x3 > x2 || x2 + x3 > x1) {
            System.out.println("3 số là cạnh của một tam giác !");
        } else {
            System.out.println("3 số không là cạnh của một tam giác !");
        }
    }
}
