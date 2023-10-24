package org.example;

public class MoveKElementsToEnd
{
    public static void main( String[] args )
    {
        int[] arrNew = { 1, 1, 3, 5, 6,1 };
        moveElementsToEnd(arrNew, 1);
    }
    public static void moveElementsToEnd(int[] arr, int toMove){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            while (i<j && arr[j] == toMove)
                j--;//to decrement if last index already contains toMove element
            if(arr[i]==toMove){
                int tmp = arr[i];
                arr[i]= arr[j];
                arr[j]=tmp;
            }
            i++;
        }
        for(Integer q: arr)
            System.out.print(q+",");
    }
    //Output : 6,5,3,1,1,1,
}
