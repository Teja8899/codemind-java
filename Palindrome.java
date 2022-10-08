import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int k=0;
        while(n>0)
        {
            k=k*10+(n%10);
            n=n/10;
        }
        if(k==m)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}