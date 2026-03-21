package Bai3;
import java.util.Scanner;
public class FindMinValueInArrayByMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("moi ban nhap vao do dai cho mang");

        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("moi ban nhap vao cac phan tu cua mang");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("gtnn trong mang la: "+FindMinValue(arr));

    }
    public static int FindMinValue(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=min){
                min=arr[i];
            }

        }
        return min;
    }
}
