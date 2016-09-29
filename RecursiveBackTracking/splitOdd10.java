// Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)

// splitOdd10([5, 5, 5]) → true
// splitOdd10([5, 5, 6]) → false
// splitOdd10([5, 5, 6, 1]) → true

public boolean splitOdd10(int[] nums) {
  return helper(0,0,nums,0);
}

public boolean helper(int sum1,int sum2, int[] nums, int count){
  if(count>=nums.length){
    if(sum1%10==0 && sum2%2!=0){
      return true;
    }
    else{
      return false;
    }
  }
  if(helper(sum1+nums[count],sum2,nums,count+1)==true){
    return true;
  }
  if(helper(sum1,sum2+nums[count],nums,count+1)==true){
    return true;
  }
  else{
    return false;
  }
}