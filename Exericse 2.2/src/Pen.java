
public class Pen {
		String colour, size, type;
		
		void printPen(String a, String b, String c){
			System.out.println("Colour: \t" + a);
			System.out.println("Size: \t\t" + b);
			System.out.println("Type: \t\t" + c);
		}
			
		void totalWeight(double weight, int quantity) {
			double totalWeight = weight * quantity;
			System.out.println("\nTotal weight of the pens: " + totalWeight +"kg");
		}
		
		void promotion(int quantity) {
			System.out.println("\nPromotion! Buy 3 pens to get 1 free!");
			if (quantity  >= 3) {
				System.out.println("Congratulations, you get a free pen!");
			}
			else {
				System.out.println("Buy more pens to get free pen!");
			}
		}
		
		void refill(char refill) {
			switch(refill) {
			case 'Y':
				System.out.println("\nThis pen is refillable.");
				break;
			case 'N':
				System.out.println("\nThis pen is not refillable.");
				break;
			}
		}
}
