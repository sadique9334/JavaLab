import java.util.Scanner;
class Simpleinterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of principle : ");
        int p=sc.nextInt();
        System.out.println("enter the value of rate : ");
        float r=sc.nextInt();
        System.out.println("enter the value of time duration  : ");
        int t=sc.nextInt();
        float SI = (p*r*t)/100;
        System.out.println("the simple interest is : "+SI);
        sc.close();

    }
}