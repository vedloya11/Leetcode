class Solution {
    public int maxArea(int[] height) {
        int first = 0;
        int last = height.length-1;
        int area = 0;
        while(first<last){
            int new_area=(last-first)*Math.min(height[first],height[last]);
            area = Math.max(area,new_area);
            if(height[first]<height[last]){
                first++;
            }else{
                last--;
            }

           }
           return area;

        }
        
        

        
    }