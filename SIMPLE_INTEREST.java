import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r,a=0;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        a=(p*t*r)/100;
        System.out.println(a);
        
    }
}