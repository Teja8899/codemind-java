import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int v=b,k=a;
        if(a>b)
        {
            v=a;
            k=b;
        }
        int r=v;
        while(true)
        {
            if(r%k==0 && r%v==0)
            {
                System.out.println(r);
                break;
            }
            r++;
        }
    }
}