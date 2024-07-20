package ch005;

public class EuclidGCD {
    public static void main(String[] args) {
        int a = 3000;
        int b = 100;
        while(b != 0) {
            if (a>b){
                a= a-b;
            }else {
                b= b-a;
            }
        }
        System.out.println("output: " +a);
    }
}
