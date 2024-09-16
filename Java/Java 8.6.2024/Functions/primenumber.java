import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        char choice;
        do{
        System.out.println("Enter the no:");
        int n =in.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);

       
        choice=in.next().charAt(0);
        }while(choice=='y'|| choice=='Y');

        in.close();

    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
    
}
