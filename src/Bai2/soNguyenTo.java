package Bai2;
import java.util.Scanner;
public class soNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon hien thi ra bao nhieu so nguyen to? ");
        int numbers = sc.nextInt();
        int count = 0;//tao 1 bien dem so nguyen to, neu có so nguyen to thi tang len
        for (int n = 2; count < numbers; n++) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    continue;
                }

            }
            if (isPrime == true) {
                System.out.print(n + " ");
                count++;
            }
        }


    }
}