package leetcode;

import java.util.List;
import java.util.Stack;

public class FuncExclusiveTime_636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<String> stack = new Stack<>();
        int []res = new int[n];
        int end = 0;
        int m = logs.size();
        for (int i = 0; i < m; i += 1) {
            String s = logs.get(i);
            String[] c = s.split(":");
            if (c[1].equals("start")) {
                if (!stack.isEmpty()) {
                    String []tem = stack.peek().split(":");
                    res[Integer.parseInt(tem[0])] += Integer.parseInt(c[2]) - end;
                    end = Integer.parseInt(c[2]);
                }
                stack.push(s);
            } else {
                stack.pop();
                res[Integer.parseInt(c[0])] += Integer.parseInt(c[2]) - end + 1;
                end = Integer.parseInt(c[2]) + 1;
            }
        }
        return res;
    }

}
