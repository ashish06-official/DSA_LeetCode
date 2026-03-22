class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        open = {"{","(","["}
        pairs = {')': '(', ']': '[', '}': '{'}
        for i in s:
            if i in open:
                stack.append(i)
            else:
                if len(stack) == 0:
                    return False
                if stack[-1] != pairs[i]: # if not in open and i is not pair of last insertion
                    return False
                stack.pop()
        return (len(stack) == 0) # True if len is 0
        
