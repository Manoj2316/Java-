import java.util.Scanner;
public class Amstrongno {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char choice;
        do{
            System.out.println("Enter the Number:");
            int n =in.nextInt();
            boolean ans=isAmstrong(n);
            System.out.println(ans);
            choice=in.next().charAt(0);
            System.out.println("DO YOU WANT TO CHECK ANOTHER NUMBER? (y/n)");

        }while(choice=='Y'||choice=='y');

        in.close();
    }
    static boolean isAmstrong(int n){
        int orginalnumber=n;
        int sum=0;
        while(n>0){
            int rem =n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum== orginalnumber;
        
    }
        

}
