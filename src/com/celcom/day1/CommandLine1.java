public class CommandLine1{
	public static void main(String[] args){
		if(args.length == 2 )
		{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.print(num1 + num2 );
			return;
		}
		System.out.println("err:Expecting 2 numbers as command");

	}

		
 }