package String;

public class SubString {
   
    public static int subStr(String name){

        if(name.length()==0){
            return 0;
        }

        for(int i = 0 ;i<name.length();i++){
            for(int j = i+1 ;j<=name.length();j++){
                System.out.println(name.substring(i, j));
            }
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        
        String name  = "abcbaa";
    }
}
