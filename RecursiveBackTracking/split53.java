// Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)

// split53([1, 1]) → true
// split53([1, 1, 1]) → false
// split53([2, 4, 2]) → true

public boolean split53(int[] nums) {
  return helper(0,0,nums,0);
}

public boolean helper(int sum1,int sum2, int[] nums, int count){
  if(count>=nums.length){
    if(sum1 == sum2){
      return true;
    }
    else{
      return false;
    }
  }
  if(nums[count]%5==0){
    return helper(sum1+nums[count],sum2,nums,count+1);
  }
  if(nums[count]%3==0){
    return helper(sum1,sum2+nums[count],nums,count+1);
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