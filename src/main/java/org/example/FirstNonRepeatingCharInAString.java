package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharInAString {

    public static void main( String[] args )
    {
        firstNonRepeatingChar("raghavendra");
        firstNonRepeatingChar("non repeating char");
    }

    public static void firstNonRepeatingChar(String str){
        HashMap<Character, Integer> map = new LinkedHashMap<>();//use linked hashmap, it retains the order
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i), 1);
        }
        for(Character c: map.keySet())
            if(map.get(c) == 1){
                System.out.print(c);
                break;
            }
        //Printing map in different ways
        System.out.println();
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.toString());
    }
}
