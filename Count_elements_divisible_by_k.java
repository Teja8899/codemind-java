import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<a;i++)
        {
            int d;
            d=sc.nextInt();
            if(d%b==0)
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}