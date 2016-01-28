import java.util.Random;
import java.util.Scanner;

public class SomethingNice {
	public static int kush;
	public static void main(String[] args) {
		System.out.print("Input money: ");
		 Scanner input = new Scanner(System.in);
		 int money = input.nextInt();
		 kush = knieves(money);

		Random randomGenerator = new Random();
		System.out.println(knieves(money));
		while (kush >= 1){
		int scamChance = randomGenerator.nextInt(100);
		int megatrade = randomGenerator.nextInt(100);
		try{
			Thread.currentThread().sleep(1000);
			if (scamChance >= 94){
				kush = 0;
				System.out.println("Uve b33n sc@md3d br00, git t-wr3kt");
				System.exit(1);
			}
			if (megatrade <= 3){
				kush = kush*3;
				System.out.println("MEGA TRADE(x3 knives): " + kush);
				Thread.currentThread().sleep(300);
			}else{
				System.out.println(knifetrading.knievesgained());
			}
		}
		
		catch(InterruptedException e){
		}
		}
	}
	public static int knieves(double money){
		double knieves = Math.floor(money/2.49);
		return((int)knieves);
	}
}
