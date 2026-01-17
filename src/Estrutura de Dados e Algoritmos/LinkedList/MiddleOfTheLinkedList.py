#https://leetcode.com/problems/middle-of-the-linked-list

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ahead = head

        #Enquanto existir algo em ahead e a frente de ahead.
        while ahead and ahead.next:
            #ahead avança duas casas
            ahead = ahead.next.next
            #head avança somente uma.
            head = head.next

        return head