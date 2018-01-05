# HashMap

![](HashMap_pic_data_structure.png)

hashMap的数据结构其实就一个静态的数组作为字典表(每个元素称为一个bucket), 加上一个动态链表存储bucket的元素(java做了优化，当链表的元素大于8且map的元素个数大于64时会转化为红黑树)

```java
	int capacity = 64;
	map = new Node[capacity];
	// node的基本成员
	Node<K,V>
	{
		 K key;
	    V value;
	    Node<K,V> next;
	}
```

## concept

### capacity
capacity 定义了bucket的数量，可以想见，当size > capacity的时候, 必然会有一个bucket里面有两个以上element(哈希冲突)，此时为了找到目标element,需要再调用equals找到目标element
考虑到bucket存储结构的优化,hashmap的时间复杂度应该是在 o(1) ~ o(logN)

### load factor