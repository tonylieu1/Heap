
public class testHeap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewEntry x1 = new NewEntry(10);
		NewEntry x2 = new NewEntry(20);
		NewEntry x3 = new NewEntry(30);
		NewEntry x4 = new NewEntry(10);
		NewEntry x5 = new NewEntry(50);
		NewEntry x6 = new NewEntry(60);
		NewEntry x7 = new NewEntry(70);
		NewEntry x8 = new NewEntry(80);
		NewEntry x9 = new NewEntry(12);
		Heap z = new Heap();
		z.setRoot(x1.getelement());
		x1.setleftrank(x2);
		x1.setrightrank(x3);
		x2.setleftrank(x4);
		x2.setrightrank(x5);
		x3.setleftrank(x6);
		x3.setrightrank(x7);
		x4.setleftrank(x8);
		x4.setrightrank(x9);
		z.setArray(x1);
		z.setArray(x2);
		z.setArray(x3);
		z.setArray(x4);
		z.setArray(x5);
		z.setArray(x6);
		z.setArray(x7);
		z.setArray(x8);
		z.setArray(x9);
		z.sortArray();
		z.getArraylist();
	}

}
