import java.lang.Math;
public class BooleanSquare
{
	public static void main(String[] args)
	{
		BooleanPart booleanLambdas = (int n) -> { return (Math.sqrt(n) % 1 == 0); };
		System.out.println(booleanLambdas.BooleanPart(26));
	}
}