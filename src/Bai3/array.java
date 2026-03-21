package Bai3;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int numbers[]=new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=30;
        numbers[3]=41;
        numbers[4]=50;
        //duyet mang
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        //them 1 phan tu vao mang
        //tao 1 phan tu moi nhieu hon mang cu 1 phaan tu
        int newNumber[]=new int[numbers.length+1];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=newNumber[i];
        }
        newNumber[newNumber.length-1]=60;
        //hien thi ra mang moi sau khi them vao phan tu
        for (int i=0;i<newNumber.length;i++){
            System.out.print(newNumber[i]+"");
        }

    }
}
