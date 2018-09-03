package clrs.main;

import java.util.Arrays;

public class MaxSubarray {
    private MaxArrStore findMaxCrossingSubarray(int[] A, int low, int mid, int high){
        int leftSum = Integer.MIN_VALUE;
        int rightSum= Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = 0;
        int maxRight = 0;
        for(int i=mid;i >= low;i--){
            sum = sum + A[i];
            if(sum > leftSum){
                leftSum = sum;
                maxLeft = i;
            }
        }
        sum = 0;
        for(int j=mid;j <= high;j++){
            sum = sum + A[j];
            if(sum > rightSum){
                rightSum = sum;
                maxRight = j;
            }
        }
        return new MaxArrStore(maxLeft, maxRight, leftSum + rightSum);
    }

    public MaxArrStore findMaximumSubarray (int[] A, int low, int high){
        MaxArrStore store = null;
        if(high == low){
            store = new MaxArrStore(low,high,A[low]);
        } else{
            int mid = (low + high)/2;
            MaxArrStore left = findMaximumSubarray(A, low, mid);
            MaxArrStore right = findMaximumSubarray(A, mid + 1, high);
            MaxArrStore cross = findMaxCrossingSubarray(A, low, mid, high);
            if(left.getMaxArrSumm() >= right.getMaxArrSumm() && left.getMaxArrSumm() >= cross.getMaxArrSumm()){
                store = left;
            } else if(right.getMaxArrSumm() >= left.getMaxArrSumm() && right.getMaxArrSumm() >= cross.getMaxArrSumm()){
                store = right;
            } else {
                store = cross;
            }
        }
        return store;
    }

    public static void main(String[] args){
        MaxSubarray ms = new MaxSubarray();
        int[] arr = new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        System.out.println("IN :" + Arrays.toString(arr));
        MaxArrStore st = ms.findMaximumSubarray(arr,0,15);
        System.out.println("OUT:" + st);
    }
}
