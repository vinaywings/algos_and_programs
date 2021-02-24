public class SearchingElements {
	static int searching(int arr[], int n, int key) {
		for (int i = 0; i<n; i++)
			if (arr[i] == key)
				return i;
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int key = 6;
		int position = searching(arr, n, key);
		if (position == -1)
			System.out.println("not found");
		else
			System.out.println("found in position" + (position + 1));
	}
}