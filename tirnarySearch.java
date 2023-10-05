import java.io.*;
import java.util.*;
public class MyClass {
    public static Boolean tirnarySearch(int arr [] , int f , int l , int value)
    {
        Arrays.sort(arr) ; 
        while(f<=l)
        {
            mid1 = f+ (l - f ) / 3 ; 
            mid2 = l - (l-f) / 3 ; 
            if (arr[mid1]== value)
            {
                return true; 
            }
            if (arr[mid2]==value)
            {
                return true; 
            }
            if (arr[mid1] > value)
            {
                return tirnarySearch(arr, f , mid1-1 , value); 
            }
            if (arr[mid2] < value)
            {
                return tirnarySearch(arr, mid2+1 , l , value); 
            }
            else 
            {
                return tirnarySearch(arr, mid1+1 , mind2-1 , value) ; 
            }
        }
        return false; 
    }
    public static void main(String args[]) {
        int arr[] = {52 , 7 , 0 , 2 } ; 
        if (isExist(arr, 2 ))
        {
            System.out.println("Yes"); 
        }else 
        {
            System.out.println("No"); 
        }
    }
}
