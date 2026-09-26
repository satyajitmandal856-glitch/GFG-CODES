class Solution {
    public int maxWater(int arr[]) {
        // code here
        int left =0;
        int right = arr.length - 1;
        
        int leftmax = 0;
        int rightmax = 0;
        
        int totalWater = 0;
        
        while(left < right){
            if(arr[left] <= arr[right]){
                if(arr[left] >=leftmax){
                    leftmax = arr[left];
                }
                else{
                    totalWater += leftmax - arr[left];
                    
                }
                left++;
            }
            else{
                if(arr[right] >= rightmax){
                    rightmax = arr[right];
                }
                else{
                    totalWater += rightmax - arr[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}
