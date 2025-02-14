class Swap_without{
    public static void main(String[] args){
        int a=5,b=8;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" swapped value : a = "+a);
        System.out.println("b = "+b);
    }
}