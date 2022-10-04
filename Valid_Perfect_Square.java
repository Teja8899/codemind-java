import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            int a=0;
            for(int j=0;j<p;j++)
            {
                if(j*j==p)
                {
                    a=1;
                    break;
                }
            }
            if(a!=0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}