# 栈、队列与双端队列

## 栈

### 栈ADT

两个更新方法：`push(e)`、`pop()`  
访问方法：`top()`、`size()`、`isEmpty()`  
java.util.Stack中有Java内建的栈，但是不推荐使用。使用示例在JavaStack目录下。

### 基于数组实现栈

代码实现在目录ArrayStack下。[ArrayStack](ArrayStack)  
使用data[0]作为栈底，data[t]栈顶。  
简单且高效（操作均为O(1)）。  
缺陷：容量问题。

### 基于单链表实现栈

代码实现在目录[LinkedStack](LinkedStack)下。  
没有容量限制。  

### 使用栈倒置数组

### 匹配括号和HTML标签

代码实现在目录[Matching](Matching)下。  

## 队列

### 队列ADT

两种更新方法：

* `enqueue(e)`：将元素e增加到队尾。
* `dequeue()`：从队列中移除并返回第一个元素。

访问方法：

* `first()`
* `size()`
* `isEmpty()`

Java在`java.util.Queue`中提供了接口。

### 基于数组的队列实现

使用循环数组实现队列。实现代码在[ArrayQueue](ArrayQueue)目录下。

### 基于单链表的队列实现

