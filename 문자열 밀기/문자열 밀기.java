class Solution {
    public int solution(String A, String B) {
        for (int i = 0;  i < A.length(); i++) {
            if (A.equals(B)) return i;
            A = pushCharAry(A);
        }
        return -1;
    }
    
    private String pushCharAry(String targetString) {
        char[] orgAry = targetString.toCharArray();
        char[] pushedAry = new char[orgAry.length];
        
        for (int j = 1; j <= orgAry.length; j++) {
            if (j != orgAry.length) {
                pushedAry[j] = orgAry[j - 1];
            } else {
                pushedAry[0] = orgAry[orgAry.length - 1];
            }
        }
        return String.valueOf(pushedAry);
    }
}
