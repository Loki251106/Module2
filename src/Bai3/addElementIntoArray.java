package Bai3;
import java.util.Scanner;
//de bai: viet code chen phan tu trong mang theo vi tri index
//y tuong:  b1: copy phan tu cu sang phan tu moi truoc index
//b2:chen gia tri index vao
//b3 copy phan tu sau index
public class addElementIntoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //nhap vao do dai mang
        System.out.print("hay nhap vao so phan tu cua mang: ");
        int n=sc.nextInt();


        //khoi tao mang
        int arr[]=new int[n];
        System.out.println("moi nhap vao cac gia tri trong mang");
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] = ");
            arr[i]=sc.nextInt();
        }


        //cho nguoi dung nhap vao gia tri can chen vao mang
        System.out.print("hay nhap vao  gia tri phan tu ban muon them vao mang: ");
        int x=sc.nextInt();


        //cho nguoi dung nhap vao vi tri ho muon chen
        System.out.print("hay nhap vi tri ma ban muon chen: ");
        int index= sc.nextInt();


        //khoi tao mang moi va sao chep cac phan tu cua mang cu sang mang moi (chen index vao vi tri can chen)
        int newarr[]=new int[n+1];//mang moi se nhieu hon mang cu 1 phan tu de chen them phan tu moi vao



        //duyet vong lap for de gan cac gia tri o mang cu sang mang moi
        for(int i=0;i<index;i++){
            newarr[i]=arr[i];//copy phan tu truoc index o mang cu vao mang moi
        }

        //gan gia tri can chen vao mang
        newarr[index]=x;


        for (int i=index;i<n;i++){
            newarr[i+1]=arr[i];//copy cac phan tu sau index o mang cu sang mang moi
        }
        //xuat ra mang moi
        for(int i=0;i<n+1;i++){
            System.out.println(newarr[i]);
        }



    }
}
