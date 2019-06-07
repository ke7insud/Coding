class Solution {
    public int removeDuplicates(int[] nums) {
        
        int length = nums.length;
        int currentIndex = 0;
        
        if (length == 0) {
            return 0;
        } 
        
        int currentValue = nums[currentIndex];
        
        int nextIndex = currentIndex;
        int nextValue = currentValue;
        
        while(nextIndex < length - 1){  
            
            nextIndex = nextIndex + 1;
            nextValue = nums[nextIndex];
            
            if(currentValue == nextValue) {
                continue;
            } else {
                currentIndex = currentIndex + 1;
                nums[currentIndex] = nextValue;
                currentValue = nextValue;
            }
        }
        return currentIndex + 1;
        
    }
}
