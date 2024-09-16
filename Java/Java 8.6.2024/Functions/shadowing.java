public class shadowing {
    static int a=23;
    
    public static void main(String[] args) {
        
        System.out.println(a);
        int a;//the class variable will shadowed at line 2 is shadowed by this
       // System.out.println(a);// scope will begin whe onitialize the value
        a=11;
        System.out.println(a);
        fun();
       
    }
    static void fun(){
        //int a=55;
        System.out.println(a);
    }
    
}
