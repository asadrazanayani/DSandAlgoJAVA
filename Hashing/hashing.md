## Hashing
- Key value pairs.
- We use key to store and retrieve values
- Example, product number (key) and product info (value)
- Also called dictionaries, maps etc
- Key can be anything like string, number etc.
- Behind the scenes we convert the key to int hashCode() and use hashCode() to store and retrive values.
- If keys are not unique, we can have collisions
- Collisions happens when more than one value has the same hashcode()
- hashcode() is inherrited from object class and is often overriden. 

### Load Factor in Hashing
- If we implement hashing using arrays, hash factor tells us how full the array is. It is calculated by size /  capacity
- For example. we have 5 elements in the array and the capacity is 10, our load factor will be 0.5
- Load factor is a balancing act, if load factor is high, we will have high collisons.
- If load factor is low, we would have a lot of empty spaces.
- Time complexity is dependent on Load Factor. So it needs to be managed appropriately

### Hash table 
- Implemented using arrays
- Exists to provide speedy retrieval of data.

### How to handle collison?
- 
