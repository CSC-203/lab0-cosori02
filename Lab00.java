// import java.util.*;
public class Lab00 {
   public static void main(String[] args) {
      int x = 5;
      String y = "hello";
      double z = 9.8;
      System.out.println("x: " + x + ", y: " + y + ", z: " + z);

      int[] nums = {3, 6, -1, 2};
      for (int i = 0; i < nums.length; i++) {
         System.out.println(nums[i]);
      }
      int num_found = char_count(y, 'l');
      System.out.println("Found: " + num_found);

      for (int i = 1; i < 11; i++){
         System.out.print(i + " ");
      }
   }
   public static int char_count(String s, char c){
      int count = 0;
      for (char i = 0; i < s.length(); i++) {
          if (s.charAt(i) == c) {
              count++;
          }
      }
      return count;
   }
}
