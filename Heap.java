
public class Heap  {
	int size = 10;
	int hieght;
	NewEntry[] HeapArr = new NewEntry[size];
	public void setRoot(int element) {
		NewEntry roots = new NewEntry(element);
		HeapArr[0]= roots;
	}
	public void sortArray() {
		for(int endArr = HeapArr.length-1; endArr > 0;endArr--) {
			if(HeapArr[endArr] ==null) {
				 endArr	= endArr - 1;
				}
			if(endArr % 2 !=0) {
				int ArrPlace = ((endArr-1)/(2));
			if(HeapArr[endArr].element < HeapArr[ArrPlace].element) {
				//this is what going replace it
				int replacement;
				//this is where it going 
				int place;
				replacement = HeapArr[ArrPlace].element;
				place = HeapArr[endArr].element;
				HeapArr[endArr].element = replacement;
				HeapArr[ArrPlace].element = place;
			}
			}else {
				int ArrPlace = (endArr/2);
				if(HeapArr[endArr].element < HeapArr[ArrPlace].element) {
					//this is what going replace it
					int replacement;
					//this is where it going 
					int place;
					replacement = HeapArr[ArrPlace].element;
					place = HeapArr[endArr].element;
					HeapArr[endArr].element = replacement;
					HeapArr[ArrPlace].element = place;
				
			}
			
		}
		}
	}
	public void setArray(NewEntry Node) {
		if(Node == null) {
			System.out.println("this is empty!");
		}
		else {
			HeapArr[Node.getRank()]= Node;
		}
	}
	public boolean CheckHieghtfull() {
		int amountEmpty = 0;
		for(int check = 0; check < HeapArr.length-1; check++) {
			if(HeapArr[check] == null) {
				amountEmpty++;
			}
		}if(amountEmpty >= 1) {
			return false;
		}else {
			return true;	
		}
	
	}
	public void makeBigger() {
		NewEntry[] newHeapArr = new NewEntry[size*2];
		for(int newHeaps = 0; newHeaps < HeapArr.length; newHeaps++) {
			newHeapArr[newHeaps] = HeapArr[newHeaps];
		}
		this.HeapArr = newHeapArr;
	}//this will make the array
	public void getArraylist() {
		for(int a = 0; a < HeapArr.length;a++) {
			if(HeapArr[a] != null) {
			System.out.println(HeapArr[a].getelement());
			}else {
				System.out.println("that is all that was in the heap");
				a= HeapArr.length;
			}
		}
	}
}