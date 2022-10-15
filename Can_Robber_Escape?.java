import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v,c=0;
        v=sc.nextInt();
        for(int i=0;i<v;i++){
            int k;
            k=sc.nextInt();
            if(k%2!=0){
                c++;
            }
        }
        if(c<=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
        
    }
}