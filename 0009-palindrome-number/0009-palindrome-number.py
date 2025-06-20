class Solution:
    def isPalindrome(self, x: int) -> bool:
        s=str(x)
        sr=s[::-1]
        print(s)
        print(sr)
        if s==sr:
            return True
        return False
        