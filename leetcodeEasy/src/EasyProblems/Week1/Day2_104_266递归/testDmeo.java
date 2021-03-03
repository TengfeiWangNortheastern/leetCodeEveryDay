package EasyProblems.Week1.Day2_104_266递归;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testDmeo {
    @Test
        public List<List<Integer>> permute(int[] nums) {
            //use iteration
            List<List<Integer>> result=new ArrayList<List<Integer>>();
            permutaion(result,nums,nums.length,0);
            return result;
        }

        public void permutaion(List<List<Integer>> result,int[] nums,int n,int index){
            int medium;
            if(index==n-1){
                result.add(addToList(nums));
            }

            for(int i=index+1;i<n;i++){
                medium=nums[i];
                nums[i]=nums[index];
                nums[index]=medium;
                permutaion(result,nums,n,index+1);
            }
        }
        public List<Integer> addToList(int[] nums){
            List<Integer> list=new ArrayList<Integer>();
            for(int i:nums){
                list.add(i);
            }
            return list;
        }
    }

