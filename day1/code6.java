public class code6 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        sb.append("anuraj");  // sb.insert(0,"anuraj");
        for(int i=0;i<sb.length()/2;i++){
             int front=i;
             int back=sb.length()-1-i;
            char frontchar=sb.charAt(i);
            char backchar=sb.charAt(sb.length()-i-1);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
