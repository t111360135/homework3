package homework3;

public class Sample3_8 {

	public static void main(String[] args)
	{
		Car17 car1;
		car1 = new Car17();
		car1.setNumGas(1234, 20.5);
		
		int number = car1.getNum();
		double gasolin = car1.getGas();
		
		System.out.println("調查樣品車得知");
		System.out.println("車號是"+ number+ ",汽油量是"+ gasolin);
		
	}

}

class Car17
{
	int num;
	double gas;
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	
	int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	
	double getGas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	
	
}
