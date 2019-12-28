package com.vdeepak.list;

public class PalindromTest {
    public static void main (String []a){
        PalindromTest obj = new PalindromTest();
        String s = "rac  ecar";
        System.out.println(obj.isPalindromCorrect(s, 0, s.length() -1));
    }

     public boolean isPalindrom (String s, int forwardIndex, int backIndex) {
         if (s.length()<2  ) return true;
         if (forwardIndex>= s.length()/2) return true;
         if (isPunctuation(s.charAt(forwardIndex))) forwardIndex++;
         if (isPunctuation(s.charAt(backIndex))) backIndex--;
         if (s.charAt(forwardIndex) != s.charAt(backIndex)) return  false;
         return isPalindrom(s, forwardIndex+1, backIndex -1);
     }

    public boolean isPalindromCorrect (String s, int forwardIndex, int backIndex) {
        System.out.println("forwar : " + forwardIndex + " value : "+ s.charAt(forwardIndex) + " backindex " + backIndex);
        if (forwardIndex == backIndex   ) return true;
        if (forwardIndex == backIndex -1) return  true;
        //System.out.println(" Char : " + Integer.valueOf(s.charAt(forwardIndex)));
        if (s.charAt(forwardIndex) == ' ') {
            System.out.println("Space");
            return isPalindromCorrect(s, forwardIndex+1, backIndex);}
        if (isPunctuation(s.charAt(backIndex))) return isPalindromCorrect(s, forwardIndex, backIndex-1);
        if (s.charAt(forwardIndex) != s.charAt(backIndex)) return  false;
        return isPalindromCorrect(s, forwardIndex+1, backIndex -1);
    }


    boolean isPunctuation (char ch) {
        boolean punctuation = false;
        if (ch == ' ') punctuation = true;
        return punctuation;
    }
}
