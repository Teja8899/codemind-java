import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x,y,z,s;
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        s=(Math.pow(x,y))%z;
        System.out.println((int)s);
        
    }
}