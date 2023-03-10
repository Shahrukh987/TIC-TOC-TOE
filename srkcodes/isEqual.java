import java.io.*;
import java.util.*;

public class Solution {
public static boolean isEqual(String str1, String str2)
{
    if(str1.length()!=str2.length())
    {
        return false;
    }
    
    int i=0;
    while(i<str1.length())
    {
        if(str1.charAt(i)!=str2.charAt(i))
        {
            return false;
        }
        i++;
    }
    return true;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        
        boolean ans =isEqual(str1,str2);
        System.out.println(ans);

    
    }
}
