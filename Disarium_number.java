import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int k=0;
        int r=(int)(Math.log10(m))+1;
        while(m>0)
        {
            k+=(int)Math.pow(m%10,r);
            r--;
            m/=10;
        }
        if(n==k)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}