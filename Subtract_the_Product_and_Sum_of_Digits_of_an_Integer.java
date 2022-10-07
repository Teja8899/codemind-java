import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=0;
        int s=1;
        while(n>0)
        {
            v+=(n%10);
            s*=(n%10);
            n=n/10;
        }
        System.out.println(s-v);
    }
}