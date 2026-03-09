/*
[Bài tập] Ứng dụng đọc số thành chữ
Mô tả
Giả sử bạn đang tham gia viết chương trình cho máy đo chiều cao cân nặng, hãy viết một chương trình
có khả năng đọc các số nguyên không âm có tối đa 3 chữ số.


Ví dụ, với số 261, chương trình in ra màn hình two hundred and sixty one.
Hướng dẫn
Bước 1: viết mã để chương trình hỏi số cần đọc

Bước 2: đọc các số có một chữ số

Nếu số cần đọc nhỏ hơn 10 và lớn hơn hoặc bằng 0, hãy sử dụng cấu trúc switch case để đọc số đó.

Nếu số cần đọc vượt quá khả năng, in ra chuỗi out of ability

Bước 3: đọc các số có hai chữ số nhỏ hơn 20

Trong trường hợp số cần đọc nhỏ hơn 20 và lớn hơn hoặc bằng 10, tính ra số hàng đơn vị (ones), sau đó sử dụng cấu trúc switch case để đọc số thành các string tương ứng.

Ví dụ: từ số 16, có số 6, đọc thành sixteen.
Bước 4: đọc các số có hai chữ số lớn hơn hoặc bằng 20

Trong trường hợp số cần đọc nhỏ hơn 100 và lớn hơn hoặc bằng 20, tính ra số hàng chục và số hàng đơn vị (ones).

Ví dụ, từ 61 có tens = 6 và ones = 1.

Sử dụng cấu trúc switch case để đọc riêng biệt hàng chục và hàng đơn vị thành chữ, ghép lại thành câu hoàn chỉnh.

Ví dụ, từ 61 có sixty và one, ghép lại thành sixty one.

Bước 5: đọc các số có ba chữ số

Đọc chữ số hàng trăm thành chữ, sử dụng thuật toán đã có để đọc phần còn lại của số thành chữ và ghép lại để được số hoàn chỉnh.

Ví dụ từ 461 có four hundred và sixty one, ghép lại thành four hundred and sixty one
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("moi ban nhap vao so can doc (so can doc >0 va <999) : ");
        int number=sc.nextInt();//cho ng dung nhap vao 1 so
        if (number < 0 || number > 999) {
            System.out.println("out of ability");//kiem tra gioi han nhap sua so do
        }
        else if(0<number && number<10){
            switch (number){
                case 1:System.out.println("one");break;
                case 2:System.out.println("two");break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                case 9: System.out.println("nine"); break;






            }
        } else if (number<20 && number>=10) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        }
        //so 20 -> 99
        else if (number>=20 && number<100) {
            int tens=number/10;//chu so hang chuc
            int ones=number%10;//chu so hang don vi
            switch (tens){
                case 2: System.out.print("twenty "); break;
                case 3: System.out.print("thirty "); break;
                case 4: System.out.print("forty "); break;
                case 5: System.out.print("fifty "); break;
                case 6: System.out.print("sixty "); break;
                case 7: System.out.print("seventy "); break;
                case 8: System.out.print("eighty "); break;
                case 9: System.out.print("ninety "); break;
            }
            switch (ones) {
                case 1: System.out.print("one"); break;
                case 2: System.out.print("two"); break;
                case 3: System.out.print("three"); break;
                case 4: System.out.print("four"); break;
                case 5: System.out.print("five"); break;
                case 6: System.out.print("six"); break;
                case 7: System.out.print("seven"); break;
                case 8: System.out.print("eight"); break;
                case 9: System.out.print("nine"); break;
            }
            System.out.println();
            
        }
        // số 100-999
        else {

            int hundreds = number / 100;
            int remain = number % 100;

            switch (hundreds) {
                case 1: System.out.print("one hundred "); break;
                case 2: System.out.print("two hundred "); break;
                case 3: System.out.print("three hundred "); break;
                case 4: System.out.print("four hundred "); break;
                case 5: System.out.print("five hundred "); break;
                case 6: System.out.print("six hundred "); break;
                case 7: System.out.print("seven hundred "); break;
                case 8: System.out.print("eight hundred "); break;
                case 9: System.out.print("nine hundred "); break;
            }

            if (remain != 0) {
                System.out.print("and ");

                if (remain < 10) {
                    switch (remain) {
                        case 1: System.out.print("one"); break;
                        case 2: System.out.print("two"); break;
                        case 3: System.out.print("three"); break;
                        case 4: System.out.print("four"); break;
                        case 5: System.out.print("five"); break;
                        case 6: System.out.print("six"); break;
                        case 7: System.out.print("seven"); break;
                        case 8: System.out.print("eight"); break;
                        case 9: System.out.print("nine"); break;
                    }
                }

                else if (remain < 20) {
                    switch (remain) {
                        case 10: System.out.print("ten"); break;
                        case 11: System.out.print("eleven"); break;
                        case 12: System.out.print("twelve"); break;
                        case 13: System.out.print("thirteen"); break;
                        case 14: System.out.print("fourteen"); break;
                        case 15: System.out.print("fifteen"); break;
                        case 16: System.out.print("sixteen"); break;
                        case 17: System.out.print("seventeen"); break;
                        case 18: System.out.print("eighteen"); break;
                        case 19: System.out.print("nineteen"); break;
                    }
                }

                else {
                    int tens = remain / 10;
                    int ones = remain % 10;

                    switch (tens) {
                        case 2: System.out.print("twenty "); break;
                        case 3: System.out.print("thirty "); break;
                        case 4: System.out.print("forty "); break;
                        case 5: System.out.print("fifty "); break;
                        case 6: System.out.print("sixty "); break;
                        case 7: System.out.print("seventy "); break;
                        case 8: System.out.print("eighty "); break;
                        case 9: System.out.print("ninety "); break;
                    }

                    switch (ones) {
                        case 1: System.out.print("one"); break;
                        case 2: System.out.print("two"); break;
                        case 3: System.out.print("three"); break;
                        case 4: System.out.print("four"); break;
                        case 5: System.out.print("five"); break;
                        case 6: System.out.print("six"); break;
                        case 7: System.out.print("seven"); break;
                        case 8: System.out.print("eight"); break;
                        case 9: System.out.print("nine"); break;
                    }
                }
            }

            System.out.println();
        }
        sc.close();



    }
}
