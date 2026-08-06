class Solution {
    public int maximumCount(int[] arr) {
        int pos=0;
        int neg=0;
        for(int num:arr){
            if(num>0)pos++;
            else if(num<0)neg++;
          }

          if(pos>neg) return pos;

          return neg;
        }
    }
