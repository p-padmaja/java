package practice1_csw2;
import java.util.*;
public class q10 {
	 static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
	        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> > ();
	        for(int i=1; i<n; i++){
	            if(A[i]>A[i-1]){
	                ArrayList<Integer> list= new ArrayList<>();
	                list.add(i-1);
	                list.add(i);
	                res.add(list);
	            }
	        }
	        return res;
	    }
	public static void main(String[] args) {
		int n = 5;
	    int A[] = {4,2,2,2,4};
	    System.out.println(stockBuySell(A,n));
	}

}
