package Bai3;
import java.util.Scanner;
public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                //khai bao 1 mang luu ten sinh vien
        String StudentName[]={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
                //Khai báo biến lưu tên tìm kiếm và  gán với giá trị nhập vào

        //Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào.
        boolean isExist=false;
        while(isExist==false){
            System.out.println("moi ban nhap vao ten de tim kiem sinh vien trong mang");
            String findName=sc.nextLine();
            for(int i=0;i<StudentName.length;i++){
                if(StudentName[i].equals(findName)){
                    System.out.println("vi tri cua sinh vien ban can tim la: "+ i);
                    isExist=true;
                    break;

                }

            }
            if(isExist==false){
                System.out.println("ban hay thu nhap lai vi sinh vien nay khong ton tai");
            }
        }






    }
}
