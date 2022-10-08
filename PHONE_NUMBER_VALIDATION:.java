import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=0;
        while(n>0)
        {
            n=n/10;
            k++;
            if(k==10 && n==0)
            {
                k--;
            }
        }
        if(k==9)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}