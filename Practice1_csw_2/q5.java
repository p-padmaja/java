package practice1_csw2;
import java.util.*;
public class q5 {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       
        ArrayList<Integer>list=new ArrayList<Integer>();
        int i=0,j=0;
        long sum=0;
        if(s==0)
        {
            list.add(-1);
            return list;
        }
        while(j<n && i<n)
        {
            sum+=arr[j];
           
            
            if(sum>s)
            {
                while(sum>s)
                {
                    sum=sum-arr[i];
                    i++;
                    
                }
            }
            if(sum==s)
            {
                list.add(i+1);
                list.add(j+1);
                 break;
                
            }
            else if(sum<s)
            {
                j++;
            }
        }
        if(list.size()==0)
        {
            list.add(-1);
        }
        
        return list;
      
    }
    public static void main(String[] args) {
    	int arr[]= {3,7,9,2,4,1,5,6};
    	int s=10;
    	int n=7;
    	System.out.println(subarraySum(arr, n, s));
    }
}




