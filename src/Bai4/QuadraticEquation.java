package Bai4;


public class QuadraticEquation {
   private double a;
   private double b;
   private double c;


   //khoi tao constructor khong tham so
    public QuadraticEquation(){}




    //khoi tao constructor co day du tham so

    public QuadraticEquation(double a, double b, double c) {
        // tu khoa this dung khi trung ten bien hoac duoc su dung de truy cap toi doi tuong hien tai
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //tao getter cho tham so
    public double getA(){
        return a;

    }

    public double getB() {
        return b;
    }
    public double getC(){
        return c;
    }
    //tao phuong thuc lay Delta de tra ve delta
    public double getDelta(){
        double delta=b*b-4*a*c;
        return delta;
    }
    //tao phuong thuc tra ve nghiem khi delta>0
    public double getresult1(){
        double delta=getDelta();
        if(delta>=0 && a!=0){
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }
    public double getresult2(){
        double delta=getDelta();
        if(delta>=0 && a!=0){
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }





}
