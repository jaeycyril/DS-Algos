class Node{
	int data;
	Node left;
	Node right;

	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

class BinaryTree{
	Node root;

	public BinaryTree(int data){
		root = new Node(data);
	}

	public void inTraversal(Node node){
		if(node != null){
			inTraversal(node.left);
			System.out.println(node.data);
			inTraversal(node.right);
		}
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		BinaryTree tree = new BinaryTree(0);

		tree.root.left = node1;
		tree.root.right = node2;

		tree.inTraversal(tree.root);
	}
}