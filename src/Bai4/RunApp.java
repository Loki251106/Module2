package Bai4;
import  java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        while(true){
            //nhap tham so cho phuong trinh bac 2 :(a,b,c)
            double a,b,c;
            System.out.println("moi nhap a: ");
            a=sc.nextDouble();
            System.out.println("moi nhap b: ");
            b=sc.nextDouble();
            System.out.println("moi nhap c: ");
            c=sc.nextDouble();
            //khoi tao doi tuong
            QuadraticEquation q=new QuadraticEquation(a,b,c);
            double delta=q.getDelta();

            //xu ly ket qua
            if(delta>0){
                System.out.println("phuong trinh co 2 no phan biet: ");
                System.out.println("x1 = "+q.getresult1());
                System.out.println("x2 = "+q.getresult2());
            }
            else if(delta==0){
                System.out.println("phuong trinh cos no kep x1 = x2 = "+q.getresult2());
            }
            else {
                System.out.println("phuong trinh vo no do delta < 0");
            }



            System.out.print("Tiep tuc? (y/n): ");
            char tieptuc = sc.next().charAt(0);

            if (tieptuc == 'n' || tieptuc == 'N') {
                break;
            }
        }







    }
}
