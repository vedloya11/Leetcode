class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations){
            if(s.equals("+")){
                int first = stack.pop();
                int top = first + stack.peek();
                stack.push(first);
                stack.push(top);
            }else if(s.equals("D")){
                stack.push(2*stack.peek());
            }else if(s.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        int answer =0;
        for(int num : stack){
            answer +=num;

        }
        return answer;
        
    }
}