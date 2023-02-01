package Giris;
import java.util.Scanner;
public class harmoniksayilar {
    public static void main(String[] args) {
        int n;
        double a=0.0,b=0.0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir n değeri giriniz:");
        n=inp.nextInt();
        for(double i=1; i<=n; i++){
            a=1/i;
            b+=a;

        }System.out.print("sonuç:"+b);

    }
}
