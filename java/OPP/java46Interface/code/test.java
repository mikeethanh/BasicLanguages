import java.util.Iterator;

public class test {
	public static void main(String[] args) {
		System.out.println("Test câu a: ");
		CasioFX500 mfx500 = new CasioFX500();
		VinaCal500 mvn500 = new VinaCal500();
		
		System.out.println("5+3="+ mfx500.add(5, 3));
		System.out.println("4*5="+ mvn500.mul(4, 5));
		System.out.println("4/0="+ mvn500.div(4, 0));
		
		System.out.println("Test câu b: ");
		
		double[] arr = new double[] {5,1,3,4,5,8,0};
		double[] arr2 = new double[] {6,2,7,9,2,4,5};
		insertionSort sxchen = new insertionSort();
		selectionSort sxchon = new selectionSort();
		
		sxchen.ascending(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sxchon.descending(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		System.out.println("Test câu c:");
		software pmmt =new software();
		System.out.println("3+5=" + pmmt.add(3, 5));
		double[] arr3 = new double[] {6,2,7,9,2,4,5};
		pmmt.ascending(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}
