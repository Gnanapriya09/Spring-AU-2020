package Triconsumer;
public class triconsumer {
	public static void main(String[] args) {
		triconsumerinterface<Integer, Integer,Integer> tri2 = (a,b,c)  -> System.out.println(a + b + c);
		System.out.println("Triconsumer Addition");
		tri2.accept(12,1,3);
		}
}
