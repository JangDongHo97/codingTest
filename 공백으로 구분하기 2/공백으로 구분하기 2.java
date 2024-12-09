class Solution {
    public String[] solution(String my_string) {
        String[] ary = my_string.split(" ");
        int size = 0;
        
        // 배열에서 유효한 단어 개수 계산
        for (int i = 0; i < ary.length; i++) {
            String str = ary[i].trim();
            ary[i] = str;
            if (!str.isEmpty()) size++;
        }
        
        // 유효한 단어를 배열에 저장
        String[] answer = new String[size];
        int idx = 0;    // 배열의 위치를 관리하는 변수
        for (int j = 0; j < ary.length; j++) {
            if (!ary[j].isEmpty()) {
                answer[idx]  = ary[j];
                idx++;  // 저장 후 위치 증가
            }
        }
        return answer;
    }
}

// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public String[] solution(String my_string) {
//         String[] ary = my_string.split(" ");
//         List<String> list = new ArrayList<String>();
        
//         for (String s : ary) {
//             if (!s.isEmpty()) list.add(s);
//         }
        
//         return list.toArray(new String[0]);
//     }
// }
