
public class Tree extends Plant {

	private String name ;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void growi() {
		System.out.println(this.name+" growing");
	}
	
	public void grow() {
		System.out.println("tree growing");
	}

	public void shedLeaves() {
		System.out.println("leaves shedding");
	}
	
	public void showMyName() {
		if(name=="john") {
			System.out.println("i have ");
		}
	}
	
	
	
}
