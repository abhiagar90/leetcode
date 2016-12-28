/**
* This is solution to Assign Cookies Prolem in Leetcode.
* https://leetcode.com/problems/assign-cookies/
**/

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        //as leetcode has very stupid testcases at times!
        if(g.length==0||s.length==0) return 0; //base case, might not be needed
        
        //sort both arrays
        Arrays.sort(g);
        Arrays.sort(s);
        
        //pointers to both arrays
        int g_start = 0, s_start = 0;
        
        //to maintain count of children who are actually successfully assigned the cookies
        int count=0;
        
        while(g_start<g.length && s_start<s.length) //loop until any of the array is completely scanned!
        {
            if(g[g_start]<=s[s_start]) //yes, you can assign a cookie!
            {
                count++;
                g_start++; //child satisfied
                s_start++; //cookie assigned to child
            }
            else{ 
                s_start++; //no the cuurent cookie cannot be assigned to anyone, so move ahead. 
            }
        }
        return count;
        
    }
}
