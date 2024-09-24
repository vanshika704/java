// classes is a collection of fields 
// aasan bhasha me bole toh its the blue print of an object 
// usse bhi aasan bhasha me bolen toh user defined data type . bss baat khtmmm.

 public class classesandibjects {
    double area(int length , int breadth , int height ){
 return 2*(length *breadth + breadth *height+ length*height);
    }
    double volume(int length , int breadth , int height ){
        return (length*breadth*height);
    }
    public static void main  (String args[]){
        classesandibjects obj1 = new classesandibjects();
       System.out.println( obj1.area(45,76,89));
       System.out.println( obj1.volume(45,76,89));
    }
}
