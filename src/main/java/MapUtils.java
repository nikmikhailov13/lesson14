import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtils {

  public Map<String, Integer> dictionary(List<String> list) {
    var result = new HashMap<String, Integer>();
    list.forEach(word -> {
      if (word == null) {
        result.put(word, 0);
      } else {

        result.put(word, word.length());
      }
    });

    return result;
  }

  public Map<String, Integer> dictionaryCount(List<String> list) {
    var result = new HashMap<String, Integer>();
    list.forEach(word -> {
      if (result.containsKey(word)) {
        result.put(word, result.get(word) + 1);
      } else {
        result.put(word, 1);
      }
    });

    return result;
  }
}
