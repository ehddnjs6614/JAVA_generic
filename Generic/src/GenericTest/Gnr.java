package GenericTest;

public class Gnr {

		public static void main(String[] args) {
			
			GTest<String> g= new GTest<>();
			GTest<Integer> g2= new GTest<>();
			g.setData("안녕");
			g2.setData(new Integer(10));
			
			
			System.out.println(g.getData());
			System.out.println(g2.getData());
			System.out.println(GTest2.function(3.9F));
			System.out.println(GTest2.function(10));
			System.out.println(GTest2.function("김동원"));
			System.out.println(GTest2.function("A"));
			System.out.println(GTest2.function(9.3));
			
			
		}
}
