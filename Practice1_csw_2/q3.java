package Practice1_csw_2;

public class q3 {
	 public static int firstElement(int[] arr, int n, int k)
	    {
	        for (int i = 0; i < n; i++) {    
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }
	            if (count == k) {
	                return arr[i];
	            }
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		int arr[]= {7 ,5,9,4,5,1,6,5,1,2,4,2,1};
		int k =3;
		int n=arr.length;
		System.out.println(" "+firstElement(arr,n,k)+" occurs atleast "+k+" times.");
	}

}
