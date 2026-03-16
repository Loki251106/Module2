package Bai2;
import java.util.Scanner;
public class SNTB1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ban muon hien thi ra bao nhieu so nguyen to? ");
        int numbers=sc.nextInt();
        int count=0;
        for(int snt=2;count<numbers;snt++){
            boolean isPrime=true;
            for(int i=2;i<snt;i++){
                if(snt%i==0){
                    isPrime=false;
                    break;
                }

            }
            if (isPrime==true){
                System.out.print(snt+" ");
                count++;
            }
        }
    }
}
