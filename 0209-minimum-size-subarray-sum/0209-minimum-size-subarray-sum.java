class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int res=Integer.MAX_VALUE;
        int n=arr.length;
        int low =0;
        int high=0;
        int sum =0;
        while(high<n){
            sum =sum+arr[high];
            while(sum>=target){
                int minLen=high-low+1; //arr{0,2} iski leng hogi : 2-0+1=3
                res=Math.min(res,minLen);
                //fire karo
                sum=sum-arr[low];
                low++;

            }
            high++;
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}