class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int max=0;
        int ans=0;
       HashMap<Integer, Integer>map=new HashMap<>();
       for(int num:nums){
        int count = map.getOrDefault(num,0)+1;
        map.put(num, count);
        if(count > max){
            max = count;
            ans = num;
        }
       }
       return ans;
    }
}