class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set= new HashSet<>();
        for(int num:nums){
           set.add(num);

        }
        int value=Integer.MIN_VALUE;
        for(int num:nums){
            int count=0;
            if(!set.contains(num-1)){
                while(set.contains(num)){
                    count++;
                    num++;
                }
                value=Math.max(count,value);
            }
        }
        return value;

        
    }
}
