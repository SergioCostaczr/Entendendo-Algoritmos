#https://leetcode.com/problems/first-unique-character-in-a-string/description/

class Solution:
    def firstUniqChar(self, s: str) -> int:
        # ex: s = "leetcode"; 'l'[0,1]
        # ex: s = "leetcode"; 'e'[1,3]

        d = {}
        for idx, ch in enumerate(s):
            if not d.get(ch):
                d[ch] = [idx, 1]
            else:
                d[ch][1] +=1

        for ch, val in d.items():
            if val[1] == 1:
                return val[0]
        
        return -1