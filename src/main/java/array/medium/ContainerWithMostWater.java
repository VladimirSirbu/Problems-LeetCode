package array.medium;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;

        int maxArea = 0;

        while (leftIndex <= rightIndex) {

            int area = Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex);

            if (area > maxArea)
                maxArea = area;

            if (height[leftIndex] < height[rightIndex])
                leftIndex++;
            else
                rightIndex--;
        }

        return maxArea;
    }

}
