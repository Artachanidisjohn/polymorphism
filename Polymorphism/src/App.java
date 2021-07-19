
public class App {

	public static void main(String[] args) {
		
		Plant plant1= new Plant();
		Tree tree1= new Tree();		
		Tree tree2= new Tree();
		
		tree1.setName("john");
		tree2.setName("beo");
		
	/*	tree1.growi();
		tree2.growi();
		
		Plant plant2=tree1;
		
		tree1.grow();
		plant1.grow();
		plant2.grow();
		
		tree1.shedLeaves();
		*/
	 
		
	}
	public static void doGrow(Plant plant1) {
		plant1.grow();
	}
	
	
	
	
}
