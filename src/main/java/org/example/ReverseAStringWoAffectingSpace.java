package org.example;

public class ReverseAStringWoAffectingSpace {

    public static void main( String[] args )
    {
        reverseStringWithoutAffectingSpace("I love india in many ways");
    }
    public static void reverseStringWithoutAffectingSpace(String str){
        int l=0;
        int r= str.length()-1;
        char[] ch = str.toCharArray();
        while(l<r){
            if(ch[l] == ' ')
                l++;
            if(ch[r] == ' ')
                r--;
            char tmp = ch[l];
            ch[l] = ch[r];
            ch[r] = tmp;
            l++;
            r--;
        }
        for(char c: ch) System.out.print(c);
    }
    //Output : s yawy namni ai dnie volI
}
