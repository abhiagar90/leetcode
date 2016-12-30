This was a good question! Use Basic Maths!

We get this, with two variables moves and equated value:

(sum of all initial elements) + moves*(n-1) = n*(the equated value);

Let the above eq. sink in.

When you increment any n-1 elemts moves times you get an aggretaion on lhs ---- now this aggregation on lhs should be eq to rhs which is the n times the new equal value for all elements.

But what is the equated value? If we get that, we have cracked this!

Here is the catch:
The min element in orignal list will be incremented every time thorughout --- so it will be incremented n-1 times. That final value is our equated value = min + moves(n-1);

New equation:
(sum of all initial elements) + moves*(n-1) = n*(min+moves(n-1));

Solving this, gives the result:
moves = sum of all initial elements - n*min; 
Thats the answer!

O(n)
