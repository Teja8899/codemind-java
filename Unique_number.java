import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r[]=new int[10];
        int v=0;
        while(n>0)
        {
            v=n%10;
            if(r[v]==1)
            {
                break;
            }
            else
            {
                r[v]=1;
            }
            n=n/10;
        }
        if(n>0)
        {
            System.out.println("Not Unique Number");
        }
        else
        {
            System.out.println("Unique Number");
        }
    }
}