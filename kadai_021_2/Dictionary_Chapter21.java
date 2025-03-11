package kadai_021_2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> dic = new LinkedHashMap<>();

	public Dictionary_Chapter21() {
		dic.put("apple", "りんご");
		dic.put("peach", "桃");
		dic.put("banana", "バナナ");
		dic.put("lemon", "レモン");
		dic.put("pear", "梨");
		dic.put("kiwi", "キウィ");
		dic.put("strawberry", "いちご");
		dic.put("grape", "ぶどう");
		dic.put("muscat", "マスカット");
		dic.put("cherry", "さくらんぼ");
	}

	public void searchWord(String key) {
		if(dic.get(key) != null) {
			String value = dic.get(key);
			System.out.println(key + "の意味は" + value);
			return;
		} else {
			System.out.println(key + "は辞書に存在しません");
		}
	}
}

