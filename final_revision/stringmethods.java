public class stringmethods {
    public static void main(String[] args) {
        if (args.length == 0) {
            return; // Exit if no arguments are provided
        }

        String str1 = args[0];

      System.out.println(str1.length());  
      System.out.println( str1.substring(2, 4)); 
      System.out.println(str1.trim());   
       System.out.println( str1.charAt(4));
       System.out.println( str1.concat(" munjal sir ki paint me"));
    }
}
