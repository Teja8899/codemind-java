import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        for(int i=1;i<n;i++)
        {
            if(i*i==n)
            {
                r=1;
                System.out.println("True");
                break;
            }
        }
        if(r==0)
        {
            System.out.println("False");
        }
    }
}