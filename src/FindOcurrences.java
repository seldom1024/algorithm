import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 second 紧随 first 出现，third 紧随 second 出现。
 * <p>
 * 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：text = "alice is a good girl she is a good student", first = "a", second = "good"
 * 输出：["girl","student"]
 * 示例 2：
 * <p>
 * 输入：text = "we will we will rock you", first = "we", second = "will"
 * 输出：["we","rock"]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= text.length <= 1000
 * text 由一些用空格分隔的单词组成，每个单词都由小写英文字母组成
 * 1 <= first.length, second.length <= 10
 * first 和 second 由小写英文字母组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/occurrences-after-bigram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/21 14:40
 */
public class FindOcurrences {
    public static <i> String[] findOcurrences(String text, String first, String second) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        String[] strings = text.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])){
                map.get(strings[i]).add(i);
            } else {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(i);
                map.put(strings[i], integers);
            }
        }
        List<Integer> list = map.get(first);
        List<String> strings1 = new ArrayList<>();
        if (!list.isEmpty()) {
            for (int i : list){
                if (i+1<strings.length && i+2<strings.length && strings[i + 1].equals(second)){
                    strings1.add(strings[i+2]);
                }
            }
        }
        if (strings1.isEmpty()) {
            return new String[]{};
        }
        return strings1.toArray(new String[strings1.size()]);
    }

    public String[] findOcurrences2(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> res = new LinkedList<>();
        for(int i = 0;i < words.length - 2;i++){
            if(words[i].equals(first) && words[i + 1].equals(second)){
                res.add(words[i + 2]);
            }
        }

        return res.toArray(new String[res.size()]);
    }

}
