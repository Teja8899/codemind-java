import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v,k,r,l=0,n;
        r=sc.nextInt();
        v=sc.nextInt();
        for(k=r;k<=v;k++)
        {
            n=0;
            if(k==1)
            {
                continue;
            }
            for(int j=2;j<=Math.sqrt(k);j++)
            {
                if(k%j==0)
                {
                    n++;
                    break;
                }
            }
            if(n==0)
            {
                l++;
            }
        }
        System.out.println(l);
        sc.close();
    }
}