# A script to show the implementation of a linkedlist

class Node:

	def __init__(self, data):
		self.pointer = None
		self.data = data


class LinkedList:

	def __init__(self, data):
		new_node = Node(data)
		self.head = new_node

	def traverse(self):

		current = self.head

		while current:
			print(current.data)

			if current.pointer is None:
				break
			else:
				current = current.pointer

	def find(self, data):
		current = self.head

		while current:
			if current.data == data:
				return True
			current = current.pointer

		return False

	def append(self, data):
		new_node = Node(data)

		current = self.head

		while current:
			if current.pointer is None:
				current.pointer = new_node
				new_node.pointer = None
				return
			current = current.pointer

	def prepend(self, data):
		new_node = Node(data)

		new_node.pointer = self.head
		self.head = new_node

	def insert(self, pos, data):
		new_node = Node(data)
		pos_counter = 0

		current = self.head

		while current:
			if pos == 0:
				self.prepend(data)
				return
			if current.pointer is None:
				self.append(data)
				return
			if pos == pos_counter + 1:
				new_node.pointer = current.pointer
				current.pointer = new_node
				return

			current = current.pointer
			pos_counter += 1

	def deleteVal(self, data):

		current = self.head

		if current.data == data:
			self.head = current.pointer
			return True

		while current:
			if current.pointer.data == data:
				current.pointer = current.pointer.pointer
				return True
			current = current.pointer
		return False


if __name__ == "__main__":
	linkedlist = LinkedList(1)
	linkedlist.append(2)
	# linkedlist.append(3)
	linkedlist.insert(10, 3)  # This appends 3. See function
	# linkedlist.prepend(0)
	linkedlist.insert(0, 0)  # This prepends
	linkedlist.insert(2, 5)
	linkedlist.traverse()
	print(linkedlist.deleteVal(0))
	linkedlist.traverse()
	print(linkedlist.find(5))
