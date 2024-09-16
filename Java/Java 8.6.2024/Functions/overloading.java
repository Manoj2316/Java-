public class overloading {
    public static void main(String[] args) {
        fun(23);
        fun("Kiyan");
    }
    static void fun(int a){
        System.out.println(a);
    }
   
    static void fun(String b){
        System.out.println(b);
    }
    
}
