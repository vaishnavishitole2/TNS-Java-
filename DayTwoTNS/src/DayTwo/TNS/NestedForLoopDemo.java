package DayTwo.TNS;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int beg=40;
		int end=60;
		
		
		for(int i=beg; i<=end; i++) // outer forloop
		{
			for(int j=1; j<=10; j++) // inner forloop
			{
				System.out.println(i+"*"+j+"= "+ i*j);
			}
			System.out.println();
		}

	}

}