public class LinkedList {

	ListNode first = null;
	ListNode last = null;
	

	public void add(String name) {
		ListNode element = new ListNode(name, null, null);
		
		if (first == null) {
			
			first = element;
			last = first;
		} else {
			element.prev=last;
			last.next=element;
			last = element;
			
			
			
		}
		
	}
	
	public void remove(String name){
		boolean found = false;
		ListNode actual = first;
		while(actual!=null&&!found){
			if(name.equals(actual.name)){
				if(actual.prev!=null){
				actual.prev.next = actual.next;
				}
				else{
					first = actual.next;
				}
				if(actual.next!=null){
				actual.next.prev = actual.prev;
				}
				
				found = true;
			}
			
			actual = actual.next;
		}
		
	}

	@Override
	public String toString() {
		ListNode actual = first;
		String result = "";

		while (actual != null) {
			result += " " + actual.name;
			actual = actual.next;		
			}
		return result;
}}
