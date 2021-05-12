package fs.apidef.identifyservice.java.java_homework2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class GPTBac2 {
    public static void main(String[] args) {
        int a, b, c;
        float x1, x2, tinh;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập hệ số a= ");
        a = scan.nextInt();

        System.out.println("Nhập hệ số b= ");
        b = scan.nextInt();

        System.out.println("Nhập hệ số c= ");
        c = scan.nextInt();

        tinh = (b * b - (4 * a * c)) / (2 * a);
        if (tinh < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (tinh == 0) {
            x1 = x2 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép x1 = x2= " + x1);
        } else {
            x1 = (float) ((-b + sqrt(tinh)) / (2 * a));
            x2 = (float) ((-b - sqrt(tinh)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + "x2 = " + x2);
        }
    }
}