import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=-1;
        for(int i=0;i<n-1;i++)
        {
            if(i*(i+1)==n)
            {
                m=i;
            }
        }
        if(m!=-1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}