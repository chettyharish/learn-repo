package DataStructures;

class HashEntry {

	int value, key;

	public HashEntry(int value, int key) {
		this.key = key;
		this.value = value;
	}
}

class HashTable {

	HashEntry hashTable[];
	final int hashTableSize = 128;

	HashTable() {
		hashTable = new HashEntry[hashTableSize];
		for (int i = 0; i < hashTableSize; i++) {
			hashTable[i] = null;

		}
	}

	public void insertEntry(int value, int key) {
		int hash = key % hashTableSize;
		int counter = 0;

		while (hashTable[hash] != null) {
			if (hashTable[hash].key != key) {
				hash = (hash + 1) % hashTableSize;
				if (counter == hashTableSize - 1) {
					System.out.println("No spots left");
					return;
				} else {
					counter++;
				}
			} else {
				System.out.println("Similar key found");
				return;
			}
		}

		hashTable[hash] = new HashEntry(value, key);
	}

	public void getEntry(int key) {
		int hash = key % hashTableSize;
		if (hashTable[hash] == null) {
			System.out.println("Element does not exist");
		} else {
			System.out.println("Value is : " + hashTable[hash].value);
		}
	}

	public void printTable() {
		int hash = 0;
		int counter = 0;
		while (counter != hashTableSize) {
			if (hashTable[hash] != null) {
				System.out.println("Element at table position " + counter
						+ "is " + hashTable[hash].value);
			} else {
				System.out.println("Element at table position " + counter
						+ "is NULL");
			}
			hash = (hash + 1) % hashTableSize;
			counter++;
		}

	}

	public void delete(int key) {
		int hash = key % hashTableSize;

		int swapkey = 0;
		int swapvalue = 0;

		if (hashTable[hash] != null) {
			System.out.println("Deleted element " + hashTable[hash].value);
			hashTable[hash] = null;

			if (hashTable[(hash + 1) % hashTableSize] != null) {
				swapkey = hashTable[(hash + 1) % hashTableSize].key;
				swapvalue = hashTable[(hash + 1) % hashTableSize].value;
				System.out.println("Deleted element "
						+ hashTable[(hash + 1) % hashTableSize].value);
				delete((hash + 1) % hashTableSize);
				insertEntry(swapvalue, swapkey);

			} else {
				return;
			}

		} else {
			System.out.println("Element not found");
		}

	}
}

public class HashMapImpementation {

	public static void main(String[] args) {
		int counter = 0;
		HashTable object = new HashTable();
		while (counter < 128) {
			object.insertEntry(counter, counter);
			counter++;
		}
		System.out.println("Done");

	
		object.delete(2);
		 object.printTable();
	}

}
