class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        
        
        for(int i = 0; i< height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int temp = (j-i)*(height[j]<height[i] ? height[j] : height[i]);
                max = temp > max ? temp : max;
            }
        }
        
        
       return max; 
    }
}
