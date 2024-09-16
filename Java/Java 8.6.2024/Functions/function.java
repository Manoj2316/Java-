import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        int ans1=sum1();
        System.out.println(ans1);
        int ans2=sum2(23, 16);
        System.out.println(ans2);
        Scanner mygreet=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=mygreet.nextLine();
        String name1=greet(name);
        System.out.println(name1);      
    }
    static int sum1(){
        Scanner num=new Scanner(System.in);
        System.out.println("enter the num1:");
        int num1=num.nextInt();
        System.out.println("Enter the num2");
        int num2=num.nextInt();
        int sum= num1 + num2;
        //System.out.println("The sum is "+sum);
        return sum;        
    }

    static int sum2(int a,int b){
        int sum2= a + b;
        return sum2;
    }
    static String greet(String name1){
        String message= "Hello" +" "+ name1;
        return message;
    }
    
}
