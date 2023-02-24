class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int[] minHeight= new int[n];
        int[] maxHeight= new int[n];
        minHeight[0]=height[0];
        for(int i=1;i<n;i++){
            minHeight[i]=Math.max(minHeight[i-1],height[i]);
        }
        maxHeight[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxHeight[i]=Math.max(maxHeight[i+1],height[i]);
        }
        int capacity=0;
        for(int i=0;i<n;i++){
            capacity+=(Math.min(minHeight[i],maxHeight[i])-height[i]);
        }
        return capacity;
    }
}
