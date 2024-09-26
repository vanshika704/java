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
       System.out.println( str1.concat(" kya haal bachha log "));

       StringBuilder str2 = new StringBuilder("Hello");
     System.out.println(str2.append(" baccha "));
     System.out.println(str2.toString());
     System.out.println(str2.charAt(3));
     System.out.println(str2.delete(2,5));
 System.out.println(str2.length());
    }
}
