package kadai_028;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Jyanken_Chapter28 {
		
	private String myChoice;
	private String random;
	
	public String getMyChoice() {
		System.out.println("あなたのじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		while(true) {
			Scanner scanner = new Scanner(System.in);
			myChoice = scanner.next();
				if(myChoice.matches("[rsp]")) {
					break;
				} else {
					System.out.println("\"r\"、\"s\"、\"p\"のいずれかを入力してください");
				}
		}
		return myChoice;
	}
	
	public String getRandom() {
		String[] choice = { "r", "s", "p" };
		int randomNum = (int)(Math.floor(Math.random() * 3));
		random = choice[randomNum];
		return random;
	}
	
	public void playGame() {
		Map<String, String> map = new HashMap<>(); 
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		
		System.out.println("あなたの手は" + map.get(myChoice) + "、対戦相手の手は" + map.get(random));
		if(myChoice.equals(random)) {
			System.out.println("あいこです");
		} else if(myChoice.equals("r") && random.equals("s") ||
				  myChoice.equals("s") && random.equals("p") ||
				  myChoice.equals("p") && random.equals("r")) {
			System.out.println("あなたの勝ちです");
		} else {
			System.out.println("あなたの負けです");
		}
	}
}
