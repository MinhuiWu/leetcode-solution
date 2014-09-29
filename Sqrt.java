public class Solution {
   public int sqrt(int x) {
         if (x<0){
             return-1;
         }
         
        long high=x/2+1;
        long low=0;
        
        while(low<=high){
            long mid=low+(high-low)/2;
            
            long sq=mid*mid;
            
            if (sq==(long)x){
                return (int)mid;
            }
            else if (sq<(long)x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)high;
    }
}