import java.io.*;
import java.util.*;
public class MyClass {
    public static Boolean isExist(int arr [] , int value )
    {
        Arrays.sort(arr) ; 
        int l = 0 ; 
        int r = arr.length - 1 ; 
        while (l<=r)
        {
            int m = l + (r-l) / 2 ; 
            if (arr[m]==value)
            {
                return true; 
            }
            if (arr[m] < value)
            {
                l = m + 1 ; 
            }
            else 
                {
                    r = m -1 ; 
                }
        }
        return false ; 
    
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
