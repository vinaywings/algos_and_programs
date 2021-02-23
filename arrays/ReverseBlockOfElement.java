class ReverseBlockOfElement {
        void leftRotate(int arr[], int d)
        {
                int n = arr.length;
                for(int i = 0; i < d; i++)
                  leftRotateOne(arr, n);

        }
        void leftRotateOne(int arr[], int n)
        {
                int i, temp;
                temp = arr[0];
                for(i = 0; i < n - 1; i++) {
                  arr[i] = arr[i+1];
                }
                arr[n - 1] = temp;

        }
        void print(int arr[])
        {
                for (int i = 0; i < arr.length; i++ )
	                System.out.println(arr[i] + " ");


        }
        public static void main(String[] args) {
                ReverseBlockOfElement arrayReverse = new ReverseBlockOfElement();
                int arr[]={1, 2, 3, 4, 5, 6, 7};
                int num_of_blocks_to_rotate = 2;
                arrayReverse.leftRotate(arr, num_of_blocks_to_rotate);
                arrayReverse.print(arr);
      }
}
