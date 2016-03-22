Implement Stack using Queues
class MyStack {
    // Push element x onto stack.
    Queue<Integer> queue = new LinkedList<Integer>();
    int size = 0;
    public void push(int x) {
        queue.offer(x);
        size++;
        int num = size;//这里将size保存一下很重要，不然会造成判断错误，不能够直接拿size来判断
        while(--num > 0) {
            queue.offer(queue.poll());
        }
    }
    // Removes the element on top of the stack.
    public void pop() {
        size--;
        queue.poll();
    }
    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return (size == 0);
    }
}


Implement Queue using Stacks
class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int x) {
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
    }

    // Get the front element.
    public int peek() {
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }
}