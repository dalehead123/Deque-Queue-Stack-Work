
public class DequeTester {

	public static void main(String[] args) {
		
		LinkedDeque<Integer> test = new LinkedDeque<>();
		
		//test.removeBack(); // throws no such element
		
		for (int i = 1; i <= 5; i++) {
			test.addToBack(i);
		}
		System.out.println(test.toString());
		
		int removed = test.removeBack();
		System.out.println("Removing from back (5): " + removed);
		
		removed = test.removeFront();
		System.out.println("Removing from front (1): " + removed);
		

		System.out.println(test.toString());
		System.out.println("is the deque empty? " + test.isEmpty());
		System.out.println("get back: " + test.getBack());
		System.out.println("get front: " + test.getFront());
		
		test.clear();
		System.out.println("after clearing: " + test.toString());
		System.out.println("is the deque empty? " + test.isEmpty());

		
		for (int i = 1; i <= 5; i++) {
			test.addToFront(i);
		}
		
		System.out.println(test.toString());

		removed = test.removeBack();
		System.out.println("Removing from back (1): " + removed);
		
		removed = test.removeFront();
		System.out.println("Removing from front (5): " + removed);
		

		System.out.println(test.toString());
		System.out.println("is the deque empty? " + test.isEmpty());
		System.out.println("get back: " + test.getBack());
		System.out.println("get front: " + test.getFront());
		
		test.clear();
		System.out.println("after clearing: " + test.toString());
		System.out.println("is the deque empty? " + test.isEmpty());
		
		System.out.println("Testing random add to front and add to back");
		test.addToFront(2);
		test.addToBack(3);
		test.addToBack(4);
		test.addToFront(1);
		System.out.println(test.toString());
		
		
		
		
		
		
	}

}
