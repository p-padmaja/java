package practice1_csw2;

public class q9 {
	 public static int equilibriumPoint(long arr[], int n) {

	      int ans=-1;
	        if(arr.length==1)
	        {
	        return 1;
	        }
	        
	        for(int i=1;i<n;i++){
	            arr[i]=arr[i]+arr[i-1];
	        }
	        for(int i=1;i<n;i++){
	            if(arr[n-1]-arr[i]==arr[i-1])
	                ans = i+1;
	        }
	        return ans;
	    }
	
	public static void main(String[] args) {
		int n = 5; 
		 long arr[] = {1,3,5,2,2} ;
		 System.out.println( equilibriumPoint(arr,n));

	}

}
