import java.util.*;
class Razred{
	public static void main(String[] args){
		int[] array = { 1,54,7,23,5,78,9,466,54};
		mehurckasto(array);
		System.out.println(Arrays.toString(array));
		int t = binarno(array, 54);
		System.out.println("Hello "+t);
	}
	public static void mehurckasto(int[] arr){
		boolean sortirano;
		for (int i= 0; i<arr.length-1; i++){
			sortirano = true;
			for(int j=arr.length-1; j>i; j--){
				if (arr[j]<arr[j-1]){
					int t = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = t;
					sortirano = false;
				}
			}
			if(sortirano)break;
		}
	}
	public static int binarno(int arr[], int iskano){
		int zac = 0, kon = arr.length-1, sre;
		do{
			sre = (zac+kon)/2;
			if(arr[sre]==iskano)return sre;
			else if (arr[sre]>iskano)kon = sre-1;
			else zac = sre+1;
			}
		while(zac<=kon);
		return -1;
		}
	
}