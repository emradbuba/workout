### About two pointers
Why two pointers: slow (single steps) and fast (double-steps) will meet?
* in each iteration slow pointer went distance X
* in each iteration fast pointer went distance 2X
* if there is no cycle, slow will never reach the position of fast, but otherwise...
* ... when pointers enter the cycle, fast pointer will eventually be 1 or 2 step(s) before slow...
* ... if there were 2 steps, pointers will meet in two iterations from now...
* ... if there was 1 step, pointer will meet in next iteration from now...
* but will meet in the end - guaranteed
 