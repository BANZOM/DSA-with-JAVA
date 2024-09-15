/*
 * You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water. 
 * Return the maximum amount of water a container can store.
 */
public class F32_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = new int[]{1,2,4,3};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right-left;
            ans = Math.max(ans, h*w);

            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return ans;
    }
}
