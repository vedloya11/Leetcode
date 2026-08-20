class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int arr1[]= new int[n];
        int arr2[]= new int[n];
        arr1[0]= nums[0];
        arr2[0]=nums[1];
        int a1 =1;
        int a2=1;
        for(int i = 2 ; i < n ; i++){
            if(arr1[a1-1]>arr2[a2 -1]){
                arr1[a1]=nums[i];
                a1++;
            }else{
                arr2[a2]=nums[i];
                a2++;
            }
        }
        int j = 0;
        for(int i = a1 ; i < n ; i++){
            arr1[i]=arr2[j];
            j++;
        }
        return arr1;
        
    }
}