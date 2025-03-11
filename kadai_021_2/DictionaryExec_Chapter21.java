package kadai_021_2;

import kadai_021.Dictionary_Chapter21;

public class DictionaryExec_Chapter21 {
	public static void main(String[] arge) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		String[] words = { "apple", "banana", "grape", "orange" };
		for(String w : words) {
			dictionary.searchWord(w);
		}
	}	
}