import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        int a,b;
        double c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a+b)/2.0;
        System.out.printf("%.4f",c);
    }
}