package Bai3;
import java.util.Scanner;
public class ReserveArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("hay nhap vao cac phan tu cua mang");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();//cho nguoi dung nhap vao cac phan tu trong mang
        }

        //dao nguoc mang vua nhap
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        //xuat ra mang sau khi dao nguoc
        System.out.println("mang sau khi da dao nguoc la:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
