import java.util.Scanner;
class ascii{
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        System.out.println("enter a character : ");
        char ch = num.next().charAt(0);
        int asciivalue=(int)ch;
        System.out.println("ascii value of '"+ch +"' is : "+asciivalue);
        //num.close();
    }
}