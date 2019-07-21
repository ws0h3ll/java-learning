import java.io.*;
import java.util.*;
class main{
    public static void main(String[] args){
        try {
            String str = "Hello world";
            Reader reader = new StringReader(str);
            int ch;
            for (int i = 0; i < 5; i++){
                ch=reader.read();
                System.out.println("\n Integer value" +" of char read is " + ch);
                System.out.println("\n Actual" + " value of char read is " + (char)ch);
            }
            reader.close();
            System.out.println("Stream closed");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
