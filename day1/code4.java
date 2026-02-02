public class code4 {
    public static void compare(String str[]){
        String largest=str[0];
        for(int i=0;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0){      //
                largest=str[i]; 
            }
            
        }
        System.out.println(largest);
        
    }
    public static void main(String[] args) {
        String str[]={"apple","mango","banana"};
        compare(str);
    }
}
