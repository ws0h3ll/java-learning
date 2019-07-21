import java.io.*;
import java.util.*;

class main{
    public static void main(String[] args){
        try{
            char[] mystr = {'h', 'e','l','l','o',' ', 'w', 'o','r','l','d'};
            CharArrayReader reader = new CharArrayReader(mystr);
            char [] charArray = new char[5];
            reader.read(charArray);
            System.out.println(Arrays.toString(charArray));
            reader.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
