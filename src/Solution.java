import java.util.HashSet;
//Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet hs=new HashSet();
        if(nums.length == 0){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            if (hs.contains(nums[i])){
                return true;
            }
            else{
                hs.add(nums[i]);
            }
        }
        return false;
    }
    
    public static void main (String args[]){
    	int[] a={0};
    	System.out.println(containsDuplicate(a));
    }
}