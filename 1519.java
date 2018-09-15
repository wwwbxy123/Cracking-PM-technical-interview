/*
Design an algorithm and write code to find all solutions to the equation a3 +
b3 = c3 + d3 where a, b, c, and d are positive integers less than 1000. If you wish, you can print only “interesting” solutions. That is, you can ignore solutions of the form
x3 + y3 = x3 + y3 and solutions that are simple permutations of other solutions (swapping left and right hand sides, swapping a and b, swapping c and d). For example, if you were printing all solutions less than 20, you could choose to print only
23+163=93+153and13+123=93+ 103.
jump to question
We can start off with a naive solution. We just iterate through all possible values for a, b, c, and d. When they are equal, we can print this set.

This is a good start. Now, how can we make it faster?
We can get some minor wins by “short circuiting”—i.e., breaking when the right side is already too large. We can break from the c loop when a 3 + b3 < c3. (Surprisingly, doing an equivalent check on the d loop doesn’t save us any time. Yes, we’d be breaking early from the innermost loop when d is very large. But, for all smaller values of d, we’re running an extra several steps.)
We can also save a bit of time by removing duplicates. Consider the solutions below, all of which are essentially equivalent:


*/