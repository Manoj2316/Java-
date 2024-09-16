import java.lang.reflect.Array;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {

    //It's Does'nt swaping because it create new varialble of reference and java is pass by value :
        // String name ="Manoj Kiyan M";
        // System.out.println(name);
        // swap("Manoj Kiyan M");
        // int a=10;
        // int b=20;
        // swap(a,b);
        // System.out.println(a+" "+b);

        int[] arr={10,20,30,40,50};
        change1(arr);
        // System.out.println(Arrays.toString(arr));
       // System.out.println(arr[0]+" "+arr[1]);
        for(int arrs:arr){
            System.out.print(arrs +" ");
        }
    }
    // static String swap(String name){
        // name= "Kiyan Manoj M"; 
        // return name;
    //    }
    // static void swap(int a, int b){//its pass by reference
    //     int temp=a;   // creat  new  string
    //      a= b;
    //      b=temp;
    //}
    // static void change(int[] nums){//its bu pass value of the reference
    //     nums[3]=50;//we modify the array don't create

    // }
    static void change1(int[] nums){
        int temp=nums[0];
        nums[0]=nums[1];
        nums[1]=temp;

    }
}
