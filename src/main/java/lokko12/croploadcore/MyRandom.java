package lokko12.croploadcore;

import java.util.Random;

public class MyRandom {
	
	public static int intrandom(int max, int min)
	{
		if (max < min) {
			int a = max;
			int b = min;
			min = a;
			max = b;
		}
		Random random = new Random();
		return random.nextInt((max-min)+1)+min;
		}
	
	public static float floatrandom(float max, float min)
	{
		if (max < min) {
			float a = max;
			float b = min;
			min = a;
			max = b;
		}
		Random random = new Random();
		return min + random.nextFloat()*(max-min);
		}
	
}
