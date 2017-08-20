package strings.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permute {
    int len;
    ArrayList<Integer> num;

    public static void main(String[] args) {
        int[] ans = {1, 2, 3};
        System.out.println((new Permute()).permute(ans));
    }

    public List<List<Integer>> permute(int[] nums) {
        len = nums.length;
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        num = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            num.add(nums[i]);
        }

        perm(num, 0, len - 1, ans);
        return ans;
    }

    public void perm(ArrayList<Integer> abc, int strt, int end, ArrayList<List<Integer>> ans) {
        if (strt == end) {
            ans.add(abc);
            System.out.println(abc.toString());
            return;
        }
        for (int i = strt; i <= end; i++) {
            ArrayList<Integer> temp = swap(num, strt, i);
            perm(temp, strt + 1, end, ans);
            temp = swap(num, i, strt);
        }
    }

    public ArrayList<Integer> swap(ArrayList<Integer> num, int i, int j) {
        int num_i = num.get(i);
        int num_j = num.get(j);
        num.set(i, num_j);
        num.set(j, num_i);
        return num;
    }
}