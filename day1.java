import java.io.*;
import java.util.*;
public class day1{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("calories.txt"));
      int ctotal = 0; 
      int cmax = 0;
      
      while(f.hasNextLine()){
         String s = f.nextLine();
         while(!s.equals("")&&f.hasNextLine()){
            ctotal+= Integer.parseInt(s); 
            s = f.nextLine();
         }
         if(ctotal>cmax){
            cmax=ctotal;
         }
         ctotal = 0; 
      }
      System.out.println(cmax+"");
   }
}