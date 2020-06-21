class Linkedlist{
	Node head;

	static class Node{
		int value;
		Node next;

		Node(int d){
			value = d;
			next = null;
		}
	}

	public void traverse(){
		Node head = this.head;

		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
	}

	public boolean searchValue(int val){
		Node head = this.head;
		while(head != null){
			if(head.value == val){
				return true;
			}
			head = head.next;
		}
		return false;
	}

	public void addStart(Node node){
		node.next = this.head;
		this.head = node;

	}

	public boolean addMiddle(Node node, int val){
		Node head = this.head;
		boolean flag = false;

		while(this.head != null){
			if(this.head.value == val){
				node.next = this.head.next;
				this.head.next = node;
				flag = true;
				break;
			}
			this.head = this.head.next;
		}

		// set the head back to the first node.
		this.head = head;
		return flag;
	}

	public boolean deleteNode(int val){
		Node head = this.head;
		Node prev_node = null;
		boolean flag =false;

		while(this.head != null){
			if(this.head.value == val){
				if(prev_node == null){
					if(this.head.next != null){
						head = this.head.next;
						this.head = this.head.next;
						flag = true;
						break;
					}else{
						// Deleting this item empties the list
						this.head = null;
						head = null;
						flag=true;
						break;
					}
					
				}else{
					if(this.head.next != null){
						prev_node.next = this.head.next;
						flag = true;
						break;
					}else{
						prev_node.next = null;
						flag = true;
						break;
					}
				}
			}

			prev_node = this.head;
			this.head = this.head.next;
		}

		this.head = head;
		return flag;
	}



	//public int getValue(Linkedlist linkedlist, )

	public static void main(String[] args) {
		Linkedlist linkedlist = new Linkedlist();

		Node first_node = new Node(1);
		Node second_node = new Node(2);
		Node third_node = new Node(3);
		Node fourth_node = new Node(4);

		linkedlist.head = first_node;
		linkedlist.head.next = second_node;
		second_node.next = third_node;
		third_node.next = fourth_node;

		linkedlist.traverse();

		boolean isValueIn = linkedlist.searchValue(3);
		boolean isValueOut = linkedlist.searchValue(6);

		System.out.println(isValueIn + " "+ isValueOut);

		Node fifth_node = new Node(5);
		linkedlist.addStart(fifth_node);

		linkedlist.traverse();

		Node sixth_node = new Node(6);
		boolean addedNode = linkedlist.addMiddle(sixth_node, 2);
		System.out.println(addedNode);

		linkedlist.traverse();

		boolean deletedNode = linkedlist.deleteNode(4);
		System.out.println(deletedNode);
		
		linkedlist.traverse();
		
	}
}