import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0; 
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a,b,r=0;
            a=sc.nextInt();
            b=a;
            while(b>0)
            {
                r=r*10+(b%10);
                b=b/10;
            }
            if(r==a)
            {
                c++;
            }
            
        }
        System.out.println(c);
    }
}