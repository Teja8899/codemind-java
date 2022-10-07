import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        while(n>0)
        {
            a+=(n%10);
            b*=(n%10);
            n=n/10;
        }
        if(a==b)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}