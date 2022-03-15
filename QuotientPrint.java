public class QuotientPrint{
	public static void main(String[]args){
		QuotientPrint test = new QuotientPrint();
		//QuotientPrint asdf = (23, 69) -> printQuotient(23, 69);

		//test.printQuotient(23, 69);
		Print_Quotient asdf = (float a, float b) -> System.out.printf("%s\n", Math.round(1000*a/b)/1000f);

		asdf.printQuotient(29027.61f, 69);
	}
	/*public void printQuotient(float a, float b){
		System.out.printf("%s\n", Math.round(1000*a/b)/1000f);
	}*/

}