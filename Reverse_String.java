import java.util.*;
class sol
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
               String s=sc.nextLine();
        String[] k=s.split(" ");
        for(int i=k.length-1;i>=0;i--)
            System.out.print(k[i]+" ");
        
        }
}