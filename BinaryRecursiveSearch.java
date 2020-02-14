/**
* Binary Recursive Search
* @author Eli Gruzman
* 
*/

public class BinaryRecursiveSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		return search(arr, 0, arr.length-1, target);
	}

	public int search(int [] arr, int left, int right, int target)
	{
		int middle = (left + right)/2;

		if (right < left)
		{
			return -1;
		}

		if (arr[middle] == target)
			return middle;

		else if (arr[middle] > target)
			return search(arr, left, middle-1, target);
		
		else
			return search(arr, middle+1, right, target);
		}

}