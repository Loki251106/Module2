package Bai3;
//xoa phan tu trong mang
/*
y tuong
b1: cho nguoi dung nhap vao mang
b2: nhap vi tri muon xoa
b3: tao mang moi be hon mang cu 1 phan tu
b4: bo qua phan tu can xoa khi copy sang mang moi


*/
import java.util.Scanner;
public class deleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("moi ban nhap do dai cho mang: ");
        int size= scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("moi ban nhap vao cac phan tu trong mang");

        //cho nguoi dung nhap vao cac phan tu trong mang
        for(int i=0;i<size;i++){
            System.out.print("arr["+i+"] = ");
            arr[i]= scanner.nextInt();
        }

        //cho nguoi dung nhap vao vi tri muon xoa
        System.out.print("ban muon xoa phan tu o vi tri (index) nao? ");
        int index= scanner.nextInt();


        //tao mang moi < mang cu 1 don vi
        int newarr[]=new int[size-1];


        for(int i=0;i<size;i++){
            if(i<index){
                newarr[i]=arr[i];

            }  else if (i>index) {
                newarr[i-1]=arr[i];

            }

        }
        System.out.println("mang sau khi xoa phan tu la: ");
        for(int i=0;i<size-1;i++){
            System.out.print(newarr[i]+" ");
        }


    }
}
