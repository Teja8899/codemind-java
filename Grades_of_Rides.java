import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,q,r;
        p=sc.nextInt();
        q=sc.nextInt();
        r=sc.nextInt();
        if(p>50 && q>60 && r>100)
        {
            System.out.println(10);
        }
        else if(p>50 && q>60 &&r<100)
        {
            System.out.println(9);
        }
        else if(p<50 && q>60 && r>100)
        {
            System.out.println(8);
        }
        else if(p>50 && q<60 && r>100)
        {
            System.out.println(7);
        }
        else if(p>50 || q>60 || r>100)
        {
            System.out.println(6);
        }
        else
        {
            System.out.println(5);
        }
    }
}