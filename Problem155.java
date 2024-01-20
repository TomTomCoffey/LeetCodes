import java.util.PriorityQueue;
import java.util.Stack;

public class Problem155 {
    class MinStack {
        PriorityQueue<Integer> que;
        Stack<Integer> stacker;
        int min;

        public MinStack() {
            this.min = Integer.MAX_VALUE;
            this.stacker = new Stack<Integer>();
            this.que = new PriorityQueue<>();

        }

        public void push(int val) {

            this.stacker.push(val);
            que.add(val);

        }

        public void pop() {
            que.remove(stacker.pop());
        }

        public int top() {

            return stacker.peek();

        }

        public int getMin() {
            return que.peek();
        }
    }

}
