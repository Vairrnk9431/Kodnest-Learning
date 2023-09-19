
class Printarray {
	
	public void printforward(int arr[]) {
		System.out.println("Forward array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void printreverse(int arr[]) {
		System.out.println("Reverse array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
