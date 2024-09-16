import java.lang.reflect.Array;
import java.util.Arrays;
public class varArgs {
    public static void main(String[] args) {
        fun(23,2,3,4,5,5);
        multiple(23, 11, "Manoj","Kiyan");
        
    }
    static void fun(int ...m){
        System.out.println(Arrays.toString(m));
    }
    static void multiple(int a,int b,String ...m){
        System.out.println(Arrays.toString(m));


    }
}
