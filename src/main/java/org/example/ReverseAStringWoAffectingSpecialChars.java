package org.example;

public class ReverseAStringWoAffectingSpecialChars {

    public static void main( String[] args )
    {
        reverseStringWithoutAffectingSpecialChars("H$l@o W(r#d");
        reverseStringWithoutAffectingSpecialChars("M& N@m* i! R@gh@v(");
    }
    public static void reverseStringWithoutAffectingSpecialChars(String str){
        int l=0;
        int r=str.length()-1;
        char[] ch = str.toCharArray();
        while(l<r){
            if(!Character.isAlphabetic(ch[l]))
                l++;
            if(!Character.isAlphabetic(ch[r]))
                r--;
            char tmp = ch[l];
            ch[l]=ch[r];
            ch[r]=tmp;
            l++;
            r--;
        }
        for (char c : ch) System.out.print(c);
    }
}
