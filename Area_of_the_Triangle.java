import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        int a,b,c;
        double s;
        double avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2.0;
        avg=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",avg);
    }
}