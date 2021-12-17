import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapUtilsTest {
  @Test
  public void shouldWork(){
    List<String> stringList = new ArrayList<>();
    stringList.add("work");
    stringList.add(null);
    HashMap<String,Integer> result = new HashMap<>();
    result.put("work",4);
    result.put(null,0);
    MapUtils mapUtils = new MapUtils();
    Map<String, Integer> dictionary = mapUtils.dictionary(stringList);
    Assertions.assertEquals(dictionary,result);
  }
  @Test
  public void shouldWorks(){
    List<String> stringList = new ArrayList<>();
    stringList.add("work");
    stringList.add("work");
    stringList.add("rest");
    HashMap<String,Integer> result = new HashMap<>();
    result.put("work",2);
    result.put("rest",1);
    MapUtils mapUtils = new MapUtils();
    Map<String, Integer> dictionary = mapUtils.dictionaryCount(stringList);
    Assertions.assertEquals(dictionary,result);



  }
}
