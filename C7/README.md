# List与迭代器ADTs

## The List ADT

支持在任意位置增加删除元素的抽象数据类型。  
Java定义了一个通用接口`java.util.List`。提供了基于索引的方法：

* `size()`
* `isEmpty()`
* `get(i)`：返回索引为i的元素，范围[0,size()-1]
* `set(i,e)`：使用值e替换索引i的元素，并返回被替换的旧值
* `add(i,e)`：插入新元素e到索引i，移动所有的后续元素，范围[0,size()]
* `romove(i)`：移除并返回索引i的元素，移动所有的后续元素

## Array Lists

后续描述了一种高级技巧，可以使得基于数组实现的List可以有不受限的容量，即Java中的array lisy或者C++中的vector。  
__简单的基于数组实现的[ArrayList](SimpleArrayList)__。  
考虑到删除和插入的时间消耗，可以考虑放弃必须将索引i的元素放在数组的第i个位置，转而去使用循环数组。

### 动态数组

Java的ArraList使用动态数组的算法技巧实现没有表明上的数目限制。  

1. 首先数组实例维护一个比当前长度大的容量空间
2. 如果当前空间被耗尽，类会请求一个新的并且更大的容量空间，将所有原数组元素拷贝过去，并丢弃原数组。类似于寄居蟹。

### 实现动态数组

1. 创建新数组B
2. 将A中的元素存储到B
3. 将引用A重新指向新数组
4. 旧数组被垃圾回收

在简单ArrayList的基础上实现[动态数组](DynamicArray)。

### 动态数组摊销分析（_WIP_）

动态数组的插入操作其实是相当高效的。

## Positional Lists

### Positions

定义一个简单的position抽象数据类型。  
`getElement()`：返回存储在该位置的元素。  
一个位置标记_p_与列表中的元素e相关联，无论因为插入删除操作导致索引改变，或者元素e被替换，都不会改变p，除非该位置被移除。

### Positional List抽象数据结构

对于列表L提供一下的访问方法：

* `first()`：返回L的第一个元素的位置，___而不是元素___
* `last()`：返回L的最后一个元素的位置
* `before(p)`：返回L中紧接位置p之前的位置
* `after()`：返回L中紧接位置p之后的位置
* `isEmpty()`
* `size()`

我们使用`getElement()`方法获得元素。
Positional List的更新方法：

* `addFirst(e)`：在列表开头插入元素e，并返回新元素的位置
* `addLast(e)`
* `addBefore(p,e)`：在位置p之前插入元素e，返回新元素的位置
* `addAfter(p,e)`
* `set(p,e)`：将位置p元素设置为e，并返回旧元素
* `remove(p)`：移除并返回位置p处的元素，使该位置无效化

定义Java接口[Position](PositionalList/Position.java)。  
定义[PositionalList](PositionalList/PositionalList.java)。  
