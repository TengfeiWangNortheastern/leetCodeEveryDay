package EasyProblems.Week1.Day3_136_94;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;

public class testdemo {
    @Test
    public int singleNumber(int[] nums) {
        if(nums==null) return 0;
        Collection<Integer> cl=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(!cl.contains(nums[i]))
                cl.add(nums[i]);

        }
    }
}
