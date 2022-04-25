// package hashtable;

public class SimpleHashtable {

    private Employee[] hashtable; 

    public SimpleHashtable() {
        // constructor will initialize employee array to size 10
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        // not handling collisions
        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        }
        else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        // O(1) for retrieval. So good for retrieval 
        return hashtable[hashedKey];
    }

    private int hashKey(String key) {
        // crude implementation of a hash function 
        return key.length() % hashtable.length;
        // modulus ensures that we will return 0 to 9 
        // if we have hashing functions that returns the same values, the retrieval is going to be slow since all the value would be stored in the same part of the array and since we do not want to do that, we would have to do a lot of collison handling
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

}
