// vector<vector<int>> replaced with List<List<Integer>> output = new ArrayList<>, Integer instead of int because generics in java use a wrapper class on the default int types, you can't fill a 
List in Java like you fill a vector in C++, and so you add a 1 to the beginning, and a 1 at the end

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        output.add(row1);
        for(int i = 1 ; i < numRows; i++)
        {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j = 1 ; j < i ; j++)
            {
                int val = output.get(i-1).get(j-1) + output.get(i-1).get(j);
                currentRow.add(val);
            }
            currentRow.add(1);
            output.add(currentRow);
        }
        return output;
    }
}
