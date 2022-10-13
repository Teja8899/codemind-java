import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a,b;
            float c,d;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextFloat();
            d=sc.nextFloat();
            if(((float)c)/a>((float)d)/b)
            {
                System.out.println("1");
            }
            else if(((float)c)/a<((float)d)/b)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println("0");
            }
            
        }
    }
}
