package acm;
import java.util.Arrays;
public class sort {
	public static void main(String[] args){
		int[] arr={21,25,49,25,16,8};
		sort s=new sort();
		arr=s.quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		System.out.print(Arrays.toString(arr));
	}
	public int[] quickSort(int[] arr,int left,int right){
		if(left<right){
			int pivotpos=partition(arr,left,right);
			quickSort(arr,left,pivotpos-1);
			quickSort(arr,pivotpos+1,right);
		}
		return arr;
	}
	private int[] swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
	}
	private int partition(int[] arr,int low,int high){
		int pivotpos=low,pivot=arr[low];
		for(int i=low+1;i<=high;i++){
			if(arr[i]<pivot){
				pivotpos++;
				swap(arr,i,pivotpos);
			}
		}
		//»ù×¼¹éÎ»
		swap(arr,low,pivotpos);
		return pivotpos;
	}
}
