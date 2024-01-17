public class RemoveDuplicateFrom {
    public static int removeMe(int[] nums) {
        if(nums.length<3)return nums.length;
        int in=2;
        for(int i=2;i<nums.length;i++)
        {
              if(nums[i]!=nums[in-2])
              {
                    nums[in++]=nums[i];
              }
        }
        return in;
}
  public static void main(String[] args) {
    int[]nums={1,1,1,2,2,3};
    System.out.println(removeMe(nums));
  }
}
