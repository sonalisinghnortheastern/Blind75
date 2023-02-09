class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(hm.containsKey(diff)){
                int[] val= new int[2];
                val[0]=i;
                val[1]=hm.get(diff);
                return val;
            }
            hm.put(nums[i],i);
        }
        return new int[2];
    }
}
