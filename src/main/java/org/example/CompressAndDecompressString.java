package org.example;

public class CompressAndDecompressString
{
    public static void main( String[] args )
    {
        compressString();
        decompressString();
    }
    public static void compressString(){
        String str = "wwwaaabbccddwwd"; //w3a3b2c2d2w2
        char[] ch = str.toCharArray();
        StringBuilder result = new StringBuilder();
        int count=1;
        for(int i=0;i<ch.length-1;i++) {
            if(ch[i]==ch[i+1]){  //Checking whether current and next index elements are same
                count++;
            } else{  //if current and next elements are not same append the string
                result.append(str.charAt(i)).append(count);  //neec to do .append twice
                count = 1;//reset the count
            }
        }
        result.append(str.charAt(ch.length-1)).append(count);//This is to append last char, because we did ch.length-1
        System.out.println(result);
    }
    //Input : wwwaaabbccddwwd
    //Output : w3a3b2c2d2w2

    public static void decompressString(){
        String str = "w3a3b2c2d2w2";
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<ch.length;i=i+2){
            char c = ch[i];
            int len = Character.getNumericValue(ch[i+1]);//We have to use separate method to convert char to int OR Integer.parseInt(String.valueOf(ch[i+1))
            System.out.println(c +":"+len);
            for(int j=0;j<len;j++){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
    //Input : w3a3b2c2d2w2
    //Output : wwwaaabbccddwwd
}
