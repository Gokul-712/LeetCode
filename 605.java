
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev = 0;

        for(int i = 0; i < flowerbed.length - 1; i++) {

            if(prev == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            }

            prev = flowerbed[i];

            if(n <= 0) {
                return true;
            }
        }

        if(n == 1 && prev == 0 && flowerbed[flowerbed.length-1] == 0) {
            return true;
        }

        return n == 0;
    }
}

//Time Complexity: O(n) where n is the length of the flowerbed array. We iterate through the array once to check for available spots to plant flowers.
//Space Complexity: O(1) as we are using a constant amount of extra space regardless