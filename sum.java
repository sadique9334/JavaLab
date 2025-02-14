import java.util.Scanner;
class sum{
    public static void main(String[] args){
        Scanner sa=new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1=sa.nextInt();
         System.out.print("enter second number : ");
        int num2=sa.nextInt();

        // int a=10;
        // int b=4;
        // int c=a+b;
        int sum=num1+num2;
        System.out.println("sum = "+sum);
       // sa.close();
    }
}