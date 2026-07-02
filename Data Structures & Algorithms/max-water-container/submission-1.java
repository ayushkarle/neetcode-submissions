class Solution {
    public int maxArea(int[] height) {
        int waterMaxArea = 0;
        int start = 0;
        int end = height.length -1;

        while(start<=end){

            int max = Math.min(height[start], height[end]) * (end - start);
            if(max>waterMaxArea){
                waterMaxArea = max;
            }
            if(height[start]>height[end]){
                end--;
            }
            else{
                start++;
            }
        }

        return waterMaxArea;
    }
}