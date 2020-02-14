/**
* Binary Iterative Search
* @author Eli Gruzman
* 
*/

public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		return search(arr, 0, arr.length-1, target);
	}

	public int search(int [] arr, int left, int right, int target)
	{
		while (left <= right)
		{
			int middle = (left + right)/2;

			if (arr[middle] == target)
				return middle;

			if (arr[middle] < target)
				left = middle+1;

			else
				right = middle-1;
		}

		return -1;
	}


}