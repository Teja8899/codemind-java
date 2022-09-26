import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int a,b,l=0,j;
            a=sc.nextInt();
            b=sc.nextInt();
            for(j=a;j<=b;j++){
                int r=j%10;
                if(r==2 ||r==3 ||r==9){
                    l++;
                }
            }
            System.out.println(l);
            
        }
    }
}