import java.util.Scanner;
class Threenumbers{
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int num1=number.nextInt();
        System.out.println("enter 2nd number : ");
        int num2=number.nextInt();
        System.out.println("enter 3rd number : ");
        int num3=number.nextInt();
        if(num1>num2&&num1>=num3){
            System.out.println("greatest number is : "+num1);
        }
        else if(num2>num1&&num2>=num3){
             System.out.println("greatest number is : "+num2);
        }
        else if(num3>num1&&num3>=num2){
             System.out.println("greatest number is : "+num3);
        }
    }
}