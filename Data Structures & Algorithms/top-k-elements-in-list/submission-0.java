class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++) {
            mp.put(nums[i] , mp.getOrDefault(nums[i] , 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> mp.get(a) - mp.get(b)
        );
        for(int num : mp.keySet()) {
            pq.offer(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=k-1;i>=0;i--) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}
