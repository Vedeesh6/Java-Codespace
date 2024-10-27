class LC_containerwithwater {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int area=0;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            area = Math.max(area, (right-left) * h);
            if(h==height[left]){while (height[left] <= h && left < right) left++;}
            else if(h==height[right]){while (height[right] <= h && left < right) right--;}
        }
        return area;
    }
}
