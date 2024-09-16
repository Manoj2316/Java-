public class scoping {
    public static void main(String[] args) {
        int a=23;
        int b=11;
//BLOCK SCOPING:
        
        {//if you initialize int his block display this block only and you can modify and use outside the block: 
             a=16;   //you can modify the value inside the block but can't initialize the value outside the block:
             int c=200;
             System.out.println(c);
        }
        System.out.println(a);

        //scoping in for loop:
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");//you can't print "i" outside for loop 
            
        }
    }
}
