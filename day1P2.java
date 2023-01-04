import java.io.*;
import java.util.*;
public class day1P2 {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("calories.txt"));
      int ctotal = 0; 
      ArrayList<Integer> top3 = new ArrayList<>();
      top3.add(0);
      top3.add(0);
      top3.add(0);
      while(f.hasNextLine()){
         String s = f.nextLine();
         while(!s.equals("")&&f.hasNextLine()){
            ctotal+= Integer.parseInt(s); 
            s = f.nextLine();
         }
         if(ctotal>top3.get(top3.size()-1)){
            top3.add(ctotal);
         }else if(ctotal>top3.get(top3.size()-2)){
            top3.add(top3.size()-2, ctotal);
         }else if(ctotal>top3.get(top3.size()-3)){
            top3.add(top3.size()-3,ctotal);
         }
         
         ctotal = 0; 
      }
      int c = top3.get(top3.size()-1)+top3.get(top3.size()-2)+top3.get(top3.size()-3);
      System.out.println(c+"");
   }
}