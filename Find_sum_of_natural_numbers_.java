import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,l=0;
        n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            l+=i;
        }
        System.out.println(l);
        
    }
}