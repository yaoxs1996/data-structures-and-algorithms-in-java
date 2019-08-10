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
