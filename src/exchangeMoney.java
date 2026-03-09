/*
Xây dựng một ứng dụng chuyển đổi tiền tệ, cho phép tính giá trị tiền VNĐ dựa trên một tỉ giá cho trước và giá trị tiền USD được nhập vào.
Bước 1: Tạo dự án mới và khai báo hàm main()

Bước 2: Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD. Hiện nay, tỉ giá có thể là 23000 VND/USD.

Bước 3: Khai báo biến giá trị USD và cho người dùng nhập vào.

Bước 4: Tính giá trị VND và hiển thị ra màn hình.
*/
import java.util.Scanner;
public class exchangeMoney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//cho nguoi dung nhap vao so tien

        System.out.println("moi ban nhap vao so tien can doi: ");

        double money=sc.nextDouble();//nhap tien theo kdl

        System.out.println(" loai tien ban vua nhap vao la? (VND)-(USD): ");

        String typeMoney=sc.next();//cho nguoi dung chon tien vnd hay $

        double result;//tao bien kq de hien thi gia tri tien sau khi doi
        if(typeMoney.equals("VND")){
            result=money/23000;
            System.out.println("kq sau khi doi tien la:"+result+"$");
        }
        else if(typeMoney.equals("USD")){
            result=money*23000;
            System.out.println("ket qua sau khi doi tien la: "+result+"VND");
        }
        else{
            System.out.println("moi ban nhap lai vi chung toi chi ho tro doi tien (VND) va (USD)");
        }
        sc.close();




    }
}
