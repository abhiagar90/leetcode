Hint: Basic Greedy

Sort both arrays.
Now, start comparing the cookies one by one against the children from the beginning.
  If the current cookie can be given to the current child, give child the cookie. And move ahead in both arrays.
  Else: this cookie can not be given to any child, move to the next cookie.
  
Subtle points:
  The cookie pointer always moves no matter what.
  But if the child pointer has finished scanning, no need to move the cookie pointer. 
