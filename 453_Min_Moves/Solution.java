/**
 * 
	This was a good question! Maths!
	
	(sum of all initial elements) + moves*(n-1) = n*(the equated value);
	
	Let the above eq. sink in.
	
	When you increment any n-1 elemts moves times you get an aggretaion on lhs ---- now this aggregation on lhs should be eq to rhs which is the n times the new equal value for all elements.
	
	But what is the equated value? If we get that, we have cracked this!
	
	Here is the catch:
	The min element in orignal list will be incremented every time thorughout --- so it will be incremented n-1 times. That final value is our equated value = min + moves(n-1);
	
	New equation:
	(sum of all initial elements) + moves*(n-1) = n*(min+moves(n-1));
	
	Solving this, gives the result:
	moves = sum of all initial elements - n*min; 
	Thats the answer!
	
	O(n)
 *
 */

public class Solution {
    public int minMoves(int[] nums) {
        
        if(nums.length<=1) return 0; //typical leetcode base case
        
        int min = nums[0];
        int sum = 0;
        for(int element: nums) //O(n) loop to get min and sum from array
        {
            sum+=element;
            if(element<min)
                min=element;
        }
        
        return sum - nums.length*min; //Damn! How did we get this? Basic Maths!
    }
}
