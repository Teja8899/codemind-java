import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int v=0;
        while(n>0)
        {
            int k=n%10;
            int s=1;
            while(k>0)
            {
                s=s*k;
                k--;
            }
            v+=s;
            n=n/10;
            
        }
        if(v==m)
        {
            System.out.println("The number "+v+" is a strong number");
        }
        else
        {
            System.out.println("The number "+m+" is not a strong number");
        }
    }
}