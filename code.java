class Solution {
    // public void moveZeroes(int[] nums) {
    //     int j=-1;
    //     for(int i =0;i<nums.length;i++){
    //         if(nums[i]==0){
    //             j=i;
    //             break;
    //         }
    //     }

    //     if(j==-1){
    //         System.out.println(Arrays.toString(nums));
    //         return;

    //     }
    //     for(int i =j+1;i<nums.length;i++){
    //         if(nums[i]!=0 ){
    //             int temp = nums[i];
    //             nums[i]=nums[j];
    //             nums[j]=temp;
    //             j++;

    //         }
    //     }
        
    // }

    public void moveZeroes(int[] n){
        int len = n.length;
        if(len==1){
            if(n[0]==0){
                System.out.println(Arrays.toString(n));
            }
            else{
                return;
            }
        }
        int j =0;
        
       
        for(int  i =0;i<len;i++){
            if(n[i]!=0){
                n[j]=n[i];
                j++;
            }
        }
        // int k = len -c;
        for(int i=j;i<len;i++){
            n[i]=0;
        }

    }
}