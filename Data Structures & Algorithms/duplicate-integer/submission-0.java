class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i =0; i<nums.length; i++ ){
            if(hashMap.containsValue(nums[i])){
                return true;
            }
            else{
                hashMap.put(i, nums[i]);
            }
        }
        return false;
    }
}
