#User function Template for python3
class Solution:
	def isPalindrome(self, s):
		t=""
        for i in s:
            if i.isalnum():
                t=t+i.lower()
        
        j=t[::-1]
        if s==" ":
            return 1
        elif(t==j):
            return 1
        else:
            return 0


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		S = input()
		ob = Solution()
		answer = ob.isPalindrome(S)
		print(answer)

# } Driver Code Ends