class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm  = new TreeMap<>();
        for(int i: nums){
            if(hm.containsKey(i)){
                int count=hm.get(i);
                hm.put(i,count+1);
            }
            else{
                 hm.put(i,1);
            }
        }
        Queue<int[]> priorityQueue= new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(Map.Entry<Integer,Integer> values: hm.entrySet()){
            priorityQueue.add(new int[]{values.getKey(),values.getValue()});
        }
        int[] allVal= new int[k];
        for(int i=0;i<k;i++){
            allVal[i]=priorityQueue.poll()[0];
        }
        return allVal;
    }
}
