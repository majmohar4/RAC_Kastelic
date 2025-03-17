import java.util.*;

public class Mehurckasto{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 5, 5, 6, 7, 7, 8, 78};
		mehurckasto(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mehurckasto(int[] arr){
		boolean sortirano = false;
		for(int i=0; i<arr.length-1; i++){
			sortirano=false;
			for(int j=arr.length-1; j>i; j--){
				if(arr[j-1]>arr[j]){
					int t = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = t;
				}
				sortirano = true;
			}
			if(!sortirano) break;
		}
	}
}