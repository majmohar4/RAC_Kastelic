public class Naloga3{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		binarno(arr, 3);
	}
	static int binarno(int[] arr, int iskano){
		int zac=0, kon = arr.length-1, sre;
		do{
			sre = (zac+kon)/2;
			if (arr[sre]==iskano) return sre;
			else if (arr[sre]<iskano)
				kon = sre-1;
			else
				zac = sre+1;
		} while(zac<=kon);
		return -1;
	}
}