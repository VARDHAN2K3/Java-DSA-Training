public class Main
{
    public static int pair(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
	        int res = target - nums[i];
	        for(int j = i+1; j < nums.length; j++){
	            if(res == nums[j]){
	                System.out.print("[" + i + ", " + j + "]");
	                return 1;
	            }
	        }
	    }
	    return -1;
    }
	public static void main(String[] args) {
	    int[] nums = {2, 7, 11, 15
	        
	        
	    };
	    int target = 9;
	    int res = pair(nums, target);
	    if(res == -1)
	        System.out.print("No nums");
	}
}
