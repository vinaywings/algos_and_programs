class RorateNelements{
	void leftRotate(int arr[],int d,int n)
	{
		for (int i=0;i<d ;i++) 
		LR1(arr,n);

	}
	void LR1(int arr[],int n)
	{
		int i,temp;
		temp=arr[0];
		for (i=0;i<n-1 ;i++ ) 
		arr[i]=arr[i+1];
		arr[n-1]=temp;	
		
	}
	void print(int arr[],int n)
	{
		for (int i=0;i<n ;i++ ) 
		System.out.println(arr[i]+"");	
		

	}
	public static void main(String[] args) {
		RorateNelements RN=new RorateNelements();
		int arr[]={1,2,3,4,5,6,7};
		RN.leftRotate(arr,2,7);
		RN.print(arr,7);
	}
}