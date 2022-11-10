# [3] -> [4]
# data , next

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


#이거 하나하나 연결하기 귀찮으니까 클래스만들어보자..?

class LinkedList:
    def __init__(self, data):
        self.head = Node(data)

    def append(self,data):  # 헤드 뒤에 붙이는게 아닌 가장끝 노드에 붙이는걸 하는거
        if self.head is None:
            self.head = Node(data)
            return

        cur = self.head

        while cur.next is not None:
            cur = cur.next

        cur.next=Node(data)

    def print_all(self):
        cur = self.head
        while cur is not None:
            print(cur.data)
            cur = cur.next



Linked_List = LinkedList(3)
Linked_List.append(4)
Linked_List.append(5)

Linked_List.print_all()