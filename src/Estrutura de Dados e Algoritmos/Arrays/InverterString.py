class Solution:
    def reverseWords_manual(self,s):
        res = ''
        l,r = 0,0

        while r < len(s):
            if s[r] != ' ':
                r += 1
            else:
                res += s[l:r+1][::-1]   
                r+=1
                l = r
        res += ' '
        res += s[l:r][::-1]
        return res[1:]


        