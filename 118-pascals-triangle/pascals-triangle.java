class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  res= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    List<Integer> prevRes=res.get(i-1);
                    row.add(prevRes.get(j-1)+prevRes.get(j));
                }
            }
            res.add(row);
        }
        return res;
    }
}