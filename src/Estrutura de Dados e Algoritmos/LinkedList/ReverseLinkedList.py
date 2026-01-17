#https://leetcode.com/problems/reverse-linked-list/description/

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Inicializa o "Anterior"
        new_list = None

        while head:
            #Armazena o proximo node.
            next_node = head.next
            #Inverte a posição do ponteiro para o anterior.
            head.next = new_list

            #Atualiza a posição dos ponteiros.
            new_list = head
            head = next_node

        return new_list