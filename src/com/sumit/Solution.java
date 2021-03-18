package com.sumit;

public class Solution {
	
	/*
	 * Constraint is :
	 * O(n) time complexity 
	 * O(1) space
	 *  
	 */
   public static boolean backspaceCompare(String S, String T) {
        
	    //run this loop as long as String contains '#' character
        while(S.contains("#"))
        {
          //add string S to string builder
          StringBuilder sb = new StringBuilder(S);
            
          //get the index of the '#'
          int index = S.indexOf('#');
          
          /*
           * if index is greater than 1, first delete the char '#' at the index we found
           * above, and last character at the previous index from the index we found
           * above.
           * 
           * 
           * if index is 0 then just delete the char '#' at index we found above
           * example - #a = a
           * 
           */
          if(index > 0)
          {
              sb.deleteCharAt(index);
              sb.deleteCharAt(index-1);
          } 
          else if(index==0) 
          {
              sb.deleteCharAt(index);
          }
         
            S= sb.toString();
        }
        
        
        //above procedure applies for string T
        while(T.contains("#"))
        {
          StringBuilder sb = new StringBuilder(T);
            
          int index = T.indexOf('#');
          
          if(index > 0)
          {
              sb.deleteCharAt(index);
              sb.deleteCharAt(index-1);
          } 
          else if(index==0) {
              sb.deleteCharAt(index);
          }
         
            T = sb.toString();
        }
        
        return S.equals(T);
    }
   
   public static void main(String[] args) {
	
	   String S1 = "ab#c"; //ac
	   String T1 = "ad#c"; //ac
	   
	   System.out.println(Solution.backspaceCompare(S1, T1)); //true
   
	   String S2 = "a##c"; //c
	   String T2 = "#a#c"; //c
	   
	   System.out.println(Solution.backspaceCompare(S2, T2)); //true
	   
	   String S3 = "a#c"; //c
	   String T3 = "b";  //b
	   
	   System.out.println(Solution.backspaceCompare(S3, T3)); //false
	   
   }

}
