package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class test {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      // split the string by space in to character
      String[] coordinates = line.split(" ");
      int o = Integer.parseInt(coordinates[0]);
      int p = Integer.parseInt(coordinates[1]);
      int q = Integer.parseInt(coordinates[2]);
      int r = Integer.parseInt(coordinates[3]);
      boolean north = true;
      boolean east = true;
      // special case
      if(o==q&&p==r){
        System.out.println("here");
        return;
      }
      else if(o==q){
        if(r<p){
        System.out.println("S");
        }
        else{
        System.out.println("N");
        }
        return;
      }
      else if(p==r){
        if(q<o){
        System.out.println("W");
        }
        else{
        System.out.println("E");
        }
        return;
      }
      //check the difference
      else{
        if(q<o){
          east = false;  
        }
        if(r<p){
          north = false;
        }
      }
      
      //print result
      if(north&&east){
        System.out.println("NE");
      }
      else if(north){
         System.out.println("NW");
      }
      else if(east){
        System.out.println("SE");
      }
      else{
        System.out.println("SW");
      }
      
      
    }
  }
}