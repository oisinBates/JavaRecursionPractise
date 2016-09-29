// Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)

// splitArray([2, 2]) → true
// splitArray([2, 3]) → false
// splitArray([5, 2, 3]) → true

public boolean splitArray(int[] nums) {
  
  return helper(0,0,nums,0);
}

public boolean helper(int sum1, int sum2,int[] nums, int count){
  
  
  if(count >= nums.length){
   if(sum1==sum2){
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