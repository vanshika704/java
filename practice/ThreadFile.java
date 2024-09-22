import java.io.*;
import java.util.*;
class A extends Thread{ // class a bnai , usme thread extend krwaya 
int num; // ek naya int define kiya 
A(int x){ // constructor bulaya a ka or value daaldi x ki 
num=x;
}
public void run(){ // fir run method me usko use krliya 
for(int i=1;i<=10;i++){
System.out.println(num+"*"+i+"="+num*i); // tavbble ka logic 
}
}
}
class B extends Thread{
int num; // b class me int num define kiya 

BufferedWriter bw=null; // buffered writer h  , initiate null se kiya
B(int x){
num=x; // b ka constructor bulaya orr x ki valuee dedi
}
public void run(){
try{
bw=new BufferedWriter(new FileWriter("table.txt"));
for(int i=1;i<=10;i++){
String str=num+"*"+i+"="+(num*i);
bw.write(str);
bw.newLine();

}
}catch(Exception e)
{
System.out.println(e.getMessage());
}
finally{
try{
if(bw!=null)
bw.close();
}
catch(Exception e){System.out.println(e.getMessage());
}
}
}
}

public class ThreadFile{
public static void main(String args[]){
System.out.println("Enter the number for printing table on Screen:-");
Scanner s=new Scanner(System.in);
int x=s.nextInt();
A ob=new A(x);

System.out.println("Enter the number for saving number table in file:-");
int y=s.nextInt();
B ob1=new B(y);
ob.start();
ob1.start();
try{
ob.join();
ob1.join();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
s.close();
}
}