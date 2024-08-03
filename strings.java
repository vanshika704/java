public class strings {
    public static void main(String args[]){
        String str = "Vanshika";
        String str1 = " Sharma";
        
        StringBuffer str2 = new StringBuffer(str+str1);
        str2.append("    How are you?");
        System.out.println(str2);
     
    }
}
