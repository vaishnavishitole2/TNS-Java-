package DayTwo.TNS;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5, b= 40, c=50;
		
		if(a>b)
		{
		//System.out.println("A is grater than B");
			if(a>c)
			{
				System.out.println("A is greater number");
			}
		}
		
		else if(b>c)
		{
			System.out.println("B is greater number");
		}

		else 
		{
			System.out.println("C is greater number");
		}

	}

}
