// 배열 기반
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


// 문자열 제어
class Solution {
    public int solution(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) return i;
            A = pushString(A);
        }
        return -1;
    }
    
    // 문자열을 한 칸씩 미루는 메서드
    private String pushString(String str) {
        // 마지막 문자를 첫 번째로 이동시키고 나머지는 그대로 이어붙임
        return str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
    }
}
