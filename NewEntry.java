
public class NewEntry {
	int element;
	NewEntry parent;
	NewEntry leftChild;
	NewEntry rightChild;
	int rank;
	NewEntry(int value){
		this.element = value;
	}
	public void setleftrank(NewEntry node) {
		node.rank = (2*this.rank)+1;
		this.leftChild = node;
		parent = this;
		}
	public void setrightrank(NewEntry node) {
		node.rank = (2*this.rank)+2;
		this.rightChild = node;
		parent = this;
	

	}
	public int getRank() {
		return rank;
	}
	public int getelement() {
		return this.element;
	}
}
