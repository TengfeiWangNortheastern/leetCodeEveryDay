package EasyProblems.Week11;

import org.junit.Test;

public class mysqroot {
    @Test
    public void mySqrt() {
        int x=8;
        if(x==1||x==0){
            System.out.println(x);
        }
        int left=2,right=x/2;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid*mid<x){
                left=mid+1;
            }else if (mid*mid>x){
                right=mid-1;
            }else{
                System.out.println(mid);
            }
        }
    }
}
