package kadai_015_03;

public class Car_Chapter15 {
	private int gear  = 1;
	private int speed = 10;

	/*疑問点①コンストラクタ要・不要の判別方法が知りたい
	コンストラクタを明示しない場合、デフォルトの引数なしコンストラクタが作られることまでは理解できています
	 */
	
	public void gearChange(int afterGear) {
		/*疑問点②なぜ「gear != afterGear」と記述しないのか
		 this.gear(フィールド)にgearが代入されているため、同じなのでは?
		 */
		if(this.gear != afterGear) {
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.gear = afterGear;
			this.speed = switch(this.gear) {
				case 2  -> 20;
				case 3  -> 30; 
				case 4  -> 40;
				case 5  -> 50;
				//case1とdefaultをまとめて記述
				default -> 10;
			};
		//オリジナル：ギアを変更しない場合の処理を追加	
		} else {
			System.out.println("ギア：" + this.gear + "／切替えなし");
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
