public class bubble{
	static int[] bubbleSort(int a[]){
		int t;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length-i-1; j++){
				if(a[j]>a[j+1])
				{
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	return a;
	}

	public static void main(String[] args) {
		int a[] = {3,2,1,25,36,47,32,21,16};

		a = bubbleSort(a);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
	}
}