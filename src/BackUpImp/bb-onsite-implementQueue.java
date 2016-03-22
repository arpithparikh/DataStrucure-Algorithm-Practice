这样做存在的一个问题就是每次我都要对stack2来进行操作，因为在pop的时候没有往回倒
提高时间的话就每次在进行pop操作之后，将stack2清空就好了
这样就可以保证每次都是stack1中是有元素的而stack2只相当于一个缓存的stack而已
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
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Get the front element.
    public int peek() {
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int res = stack2.peek();
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}



implement using one stack
class MyQueue {
    Stack<Integer> stack = new Stack<Integer>();
    boolean flag = false;
    int peekVal = 0;
    public void push(int x) {
        stack.push(x);
    }
    public void pop() {
        if(!stack.isEmpty()) {
            int val = stack.pop();
            pop();
            if(flag == true) {
                flag = false;
            }
            else {
                stack.push(val);
            }
        }
        else {
            flag = true;
        }
    }
    public int peek() {
        if(!stack.isEmpty()) {
            int val = stack.pop();
            peek();
            if(flag == true) {
                flag = false;
                peekVal = val;
            }
            stack.push(val);
        }
        else {
            flag = true;
        }
        return peekVal;
    }
    public boolean empty() {
        return stack.isEmpty();
    }
}