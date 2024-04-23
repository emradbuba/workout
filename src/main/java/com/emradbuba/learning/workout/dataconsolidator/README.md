*This is a simple training task.*
------

**Task - main assumptions**
- we receive two lists with object/value/whatever from the systems
    - for simplicity, let's assume these are simple java Lists
- each list contains at least one element
- elements in each list can be added multiple times in any order

**Problem to solve**
* The task is to analyze the content of both lists and return:
    * (I) a list containing elements from first list, which do not contain their counterparts in the second list (see example)
    * (II) a list containing elements from second list, which do not contain their counterparts in the first list (see example)
    * (III) a list of pairs containing matching elements from both list

**Example (let's assume lists of Strings here)**
* First list
    * A B C C D F G H I K K K K
* Second list
    * A A B C D E F G K K J
* OUTPUT:
    * (I)   C H I K K
    * (II)  A E J
    * (III) (A, A), (B, B), (C, C), (D, D), (F, F), (G, G), (K, K), (K, K)

--------
*EXTRA TASK*

Let's assume, that user can define that this procedure should enable to treat some elements as equivalent/equal in a not standard way, for example that:
* "A" is same as "a" are logically 'same'
* People with specific age range should be logically 'same', etc...

**Example (let's assume lists of Strings here)**
* First list
    * A B C c D F G h I k K K k
* Second list
    * a A B C d E F g K K J
* OUTPUT:
    * (I)   c h I K k
    * (II)  A E J
    * (III) (A, a), (B, B), (C, C), (D, d), (F, F), (G, g), (k, K), (K, K)

In this example I used String but in code, for example, Double is in use. You can imaging any other especially a custom one.
Design the solution as if it were a library which can be used by any user for his/her purposes.  
