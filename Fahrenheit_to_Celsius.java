import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();
        double f=(double)(n-32)/1.8;
        System.out.format("%.2f",f);
    }
}