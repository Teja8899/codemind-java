import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+(2*y);
        if(x==0 && y%2==0)
        {
            System.out.println("YES");
        }
        else if(x==0 && y%2!=0)
        {
            System.out.println("NO");
        }
        else if(z%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}