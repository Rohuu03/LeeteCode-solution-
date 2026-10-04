class Solution {
    public List<Integer> findDuplicates(int[] nums) {

            Arrays.sort(nums);

        List<Integer> list  = new ArrayList<>();

        int n = nums.length;

         for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                list.add(nums[i]);
            }
         }
        return list;
    }
}