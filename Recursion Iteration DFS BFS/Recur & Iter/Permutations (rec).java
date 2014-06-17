// Given a collection of numbers, return all possible permutations.
// For example,
// [1,2,3] have the following permutations:
// [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
public class Solution {
	public ArrayList<ArrayList<Integer>> permute(int[] num) {		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
 
		rec(result, list, num);
		return result;
	}
 
 
	private void rec(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] num) { 
		if (list.size() == num.length) {
			result.add(new ArrayList<Integer>(list));
			return;
		}	
		for (int i = 0; i < num.length; i++) {
			if (list.contains(num[i])) continue;
			
			list.add(num[i]);
			rec(result, list, num);		
			list.remove(list.size() - 1);
		}
	}
}
