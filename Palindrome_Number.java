import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int v=a;
            int k=0;
            while(a>0)
            {
                k=k*10+(a%10);
                a=a/10;
            }
            if(k==v)
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