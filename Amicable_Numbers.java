import java.util.Scanner;
class sol
{
     public static int fac(int n)
     {
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                s+=i;
            }
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=fac(a),y=fac(b);
        if(x==b)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}