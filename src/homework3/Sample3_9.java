package homework3;

public class Sample3_9 {

	public static void main(String[] args) 
	{
		Car20 car1;
		car1 = new Car20();
		
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
				
	}
}

class Car20
{
	int num;
	double gas;
	
	void show() 
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}