
import java.util.Scanner;
class Compoundinterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=0;
        System.out.print("enter principle : ");
        float p=sc.nextFloat();
        System.out.print("enter rate : ");
        float r=sc.nextFloat();
        System.out.print("enter time : ");
        float t=sc.nextFloat();
        float cp=(float)(p*Math.pow(1+r/100,t));
        a = cp-p;
        System.out.println("compound interest is : "+a);
        sc.close();
    }
}