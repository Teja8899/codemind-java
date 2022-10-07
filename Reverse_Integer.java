import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=Math.abs(n);
        int k=0;
        while(v>0)
        {
            k=k*10+(v%10);
            v=v/10;
        }
        if(n>0)
        {
            System.out.println(k);
        }
        else
        {
            System.out.println(-k);
        }
    }
}