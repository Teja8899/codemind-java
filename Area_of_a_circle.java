import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        int r;
        double I;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        I=3.14*r*r;
        System.out.format("%.2f",(float)I);
    }
}