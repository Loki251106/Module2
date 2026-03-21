package Bai2;
import java.util.Scanner;
public class taoHinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("moi ban nhap vao chieu dai");
        int Oy=sc.nextInt();
        System.out.println("moi ban nhap vao chieu rong");
        int Ox=sc.nextInt();
        //tao hinh chu nhat
        for(int i=1;i<=Oy;i++){
            for (int j=1;j<=Ox;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        //tao hinh tam giac
        for(int i=1;i<=Oy;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
        //tao hinh tam giac nguoc
        for (int i=1;i<=Oy;i++){
            for (int j=Oy;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        //tam giac lech phai
        for (int i=1;i<=Oy;i++){
            for(int j=1;j<=Oy-i;j++){//tao khoang trong
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){//tao ky tu *(so * = so dong)
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //kim tu thap
        for(int i=1;i<=Oy;i++){
            for (int j=1;j<=Oy-i;j++){
                System.out.print(" ");//tao khoang trang
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");//tao ky tu *
            }
            System.out.println();
        }
        System.out.println();
        //tao kim tu thap nguoc
        for(int i=1;i<=Oy;i++){
            for(int j=Oy-i;j>=1;j--){
                System.out.print("  ");//tao khoang trang
            }
            for(int j=Oy-i+1;j>=1;j--){
                System.out.print("* " );//tao *
            }
            System.out.println();
        }


    }
}
