import java.util.Stack;

public class code5 {
    // 定义两个栈
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int data;
        if (stack2.isEmpty() && !stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                data = stack1.pop();
                stack2.push(data);
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        throw new RuntimeException("...");
    }
}
