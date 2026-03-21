package Bai3;
import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("moi ban nhap vao do dai cua mang");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("moi ban nhap vao gia tri cua phan tu trong mang");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();//cho nguoi dung nhap vao gia tri trong mang

        }
        int max=arr[0];//gán bừa 1 giá trị là GTLN
        for (int i=0;i<size;i++){
            if(arr[i]>=max){
                max=arr[i];

            }
        }
        System.out.println("gtln cua mang la "+max);

    }
}
