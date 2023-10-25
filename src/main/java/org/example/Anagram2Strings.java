package org.example;

import java.util.HashMap;

public class Anagram2Strings {

    public static void main( String[] args )
    {
        anagram2Strings("taac", "caat");
        anagram2Strings("taac", "caaq");
    }

    public static void anagram2Strings(String str1, String str2){//O(n) + O(n)
        //Another way is sort 2 strings and compare both, but time complexity is more
        //Add string1 to hashmap, check if map contains string2.charAt do  -1
        HashMap<Character, Integer> map1 = new HashMap<>();

        if(str1.length()!=str2.length()){
            System.out.print("Please enter same length");
            System.exit(0);//Or we can use return false
        }

        for(int i=0;i<str1.length();i++){
            if(map1.containsKey(str1.charAt(i)))
                map1.put(str1.charAt(i), map1.get(str1.charAt(i))+1);
            else map1.put(str1.charAt(i), 1);
        }
        for(int i=0;i<str2.length();i++){
            if(map1.containsKey(str2.charAt(i)))
                map1.put(str1.charAt(i), map1.get(str1.charAt(i))-1);
        }
        for(char c: map1.keySet()){
            if(map1.get(c) != 0){
                System.out.print("Not anagram");
                System.exit(0);//Or we can use return false
            }
        }
        System.out.println("Anagram");
    }
}
