import java.util.Scanner;
class Oddeven{
    public static void main(String[] args){
        Scanner sadique=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num1=sadique.nextInt();
        if(num1>=0){
        if(num1==0){
            System.out.println("number is zero.");
        }
        else if(num1%2==0){
            System.out.println("number is even.");
        }
        else if(num1%2!=0){
            System.out.println("number is odd.");
        }
        }
        else if(num1<0){
            if(num1%2==0){
            System.out.println("number is even and negative.");
        }
        else if(num1%2!=0){
            System.out.println("number is odd and negative.");
        }
        }

    }
}