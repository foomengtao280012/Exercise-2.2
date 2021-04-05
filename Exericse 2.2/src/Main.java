
public class Main {

		public static void main(String[] args) {
			Pen MyPen = new Pen();
			Pen AbuPen = new Pen();
			
			System.out.println("My Pen");
			MyPen.printPen("Black", "0.5mm", "Gel pen");
			MyPen.totalWeight(0.3, 2);
			MyPen.promotion(2);
			MyPen.refill('Y');
			
			System.out.println("\nAbu's Pen");
			AbuPen.printPen("Blue", "0.7mm", "Ballpoint pen");
			AbuPen.totalWeight(0.2, 4);
			AbuPen.promotion(4);
			AbuPen.refill('N');
		}
	}

