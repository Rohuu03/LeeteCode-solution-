class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n =nums.length;
        int index=0;
        for(int i=nums[0];i<=nums[n-1];i++){
            if(index<n && nums[index]==i){
                index++;
            }
            else{
                list.add(i);
            }
        }
        return list;
    }
}