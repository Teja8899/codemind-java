import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int k;
            k=sc.nextInt();
            c+=k;
        }
        System.out.println(c);
        sc.close();
    }
        
}