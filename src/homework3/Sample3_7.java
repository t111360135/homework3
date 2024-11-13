package homework3;

public class Sample3_7 {

	public static void main(String[] args)
	{
		Car15 car1;
		car1 = new Car15();
		
		int number = 1234;
		double gasolin = 20.5;
		
		car1.setNumGas(number, gasolin);
	}

}

class Car15
{
	int num;
	double gas;
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	
	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}