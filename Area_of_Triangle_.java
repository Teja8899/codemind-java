import java.util.*;
import java.lang.Math;
class sol
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float s=(float)(a+b+c)/2;
        s=(float)(s*(s-a)*(s-b)*(s-c));
        s=(float)Math.sqrt(s);
        System.out.format("%.2f",s);
    }
    
}