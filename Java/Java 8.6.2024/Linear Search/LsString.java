public class LsString {
    public static void main(String[] args) {
        String str="Manoj Kiyan M";
        char target='n';
        lsstring(str,target,3,12);
    }
    static int lsstring(String str,char target,int start,int end){
        if(str.length()==0){
            return -1;
        }
        for (int i = start; i < end && i < str.length(); i++) {
           // String word=str[i];
            if(str.charAt(i)==target){
                System.out.println("The letter "+target+" is palaced on index "+i);
                System.out.println();
                return i;
            }
            
        }
        return -1;
    }
    
}
