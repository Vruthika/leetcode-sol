class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        z=bin(int(a,2)+int(b,2))       
        return z[2:]
        