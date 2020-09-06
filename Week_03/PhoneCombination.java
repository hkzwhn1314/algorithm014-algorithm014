import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.length() == 0) {
            return res;
        }
        Map<Character,String> map = new HashMap();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        Search("",digits,0,res,map);
        return res;

    }
//迭代的方法来做，迭代的边界条件是当i=digits.length();
    private void Search(String s, String digits, int i, List<String> res, Map map) {
        if (i == digits.length()) {
            res.add(s);
            return;
        }
        String letter = (String) map.get(digits.charAt(i));
        for (int j = 0;j < letter.length();j++) {
            Search(s+letter.charAt(j),digits,i+1,res,map);
        }
    }


}
