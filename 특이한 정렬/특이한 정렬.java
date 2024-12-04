import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        int temp = 0;
        
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(n - numlist[i]) <= Math.abs(n - numlist[j])) {
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        return numlist;
    }
}
