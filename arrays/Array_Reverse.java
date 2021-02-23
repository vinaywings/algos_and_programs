public class Array_Reverse{
	public static void Reverse(int arr[],int first,int last)
	{
		int temp;
		while(first<last)
		{
			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
			first++;
			last--;

		}
	}
	static void print(int arr[],int n)
	{
		for (int i=0;i<n ;i++ ) 
		{
			System.out.println(arr[i]+"");
			
		}

	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		Reverse(arr,0,6);
		System.out.println("after sort the array :");
		print(arr,7);
		
	} 
}
