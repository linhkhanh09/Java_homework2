package fs.apidef.identifyservice.java.java_homework2;

import java.util.Scanner;

public class CalculationDate_Solution2 {
    public static void main(String[] args) {
        int thang;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập tháng = ");
        thang = scan.nextInt();
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println("Tháng có 31 ngày !");
        } else {
            if (thang == 2) {
                System.out.println("Tháng có 28 hoặc 29 ngày !");
            } else {
                if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                    System.out.println("Tháng có 30 ngày !");
                } else {
                    System.out.println("Không có tháng này !");
                }
            }
        }
    }
}
