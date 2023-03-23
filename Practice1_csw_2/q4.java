package Practice1_csw_2;
import java.util.*;
public class q4 {
	static int arr[] = new int[]{4,3,7,8,6,2,1};
    static void zigZag()
    {
        Arrays.sort(arr);
        for (int i = 1; i <= arr.length - 2; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
 
	public static void main(String[] args) {
		  zigZag();
	      System.out.println(Arrays.toString(arr));
	}

}
