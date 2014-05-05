import java.util.Random;

public class Dice {

static int dValue = 0;
static int average = 0;
static Random r = new Random();

	public static void Throw(){
		dValue = 0;
		dValue += 1 + r.nextInt(6);
	}

	public static void Throw(int bounces){
		int i = 0;
		while( i < bounces )
		{
		dValue = 0;
		dValue += 1 + r.nextInt(6);
		//System.out.println( dValue);
		average += dValue;
		//System.out.println( average);
		i++;
		}
		average /= bounces;
	}

	public static void Throw(int dice, int bounces){
		int i = 0;
		while( i < bounces )
		{
		dValue = 0;
		dValue += 1 + r.nextInt(6) * dice;
		//System.out.println( dValue);
		average += dValue;
		//System.out.println( average);
		i++;
		}
		average /= bounces;
	}

	public static int dValue(){
		return dValue;
	}
	public static int average(){
		return average;
	}
	public Dice(int bounces){
		int i = 0;
		while( i < bounces )
		{
		dValue = 0;
		dValue += 1 + r.nextInt(6);
		//System.out.println( dValue);
		average += dValue;
		//System.out.println( average);
		i++;
		}
		average /= bounces;
	}
	}
