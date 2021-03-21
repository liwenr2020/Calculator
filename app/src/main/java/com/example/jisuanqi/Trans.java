package com.example.jisuanqi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 此类用于将中序表达式转译成后序表达式
public class Trans {
    private Stack<String> stack;// 用于存储操作符的栈
    private List<String> postfixList;// 用于存储后序表达式的链表

    public List<String> getPostfixList() {
        return postfixList;
    }

    public Trans(List<String> list){
        stack=new Stack<String>();
        postfixList=new ArrayList<String>();

        for(String str:list){
            // 这个分支是当前项是操作符号的情况
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("(") || str.equals(")")  ){
                String opThis=str;

                if(stack.size()==0){
                    // 如果栈为空，直接把操作符推入栈
                    stack.push(opThis);
                }else if(str.equals("(")){
                    // 如果操作符是左括号，直接推入栈
                    stack.push(opThis);
                }else if(str.equals(")")){
                    // 如果操作符是右括号，则往前找左括号，将左括号之后的操作符放到后续表达式列表中

                    while(stack.peek().equals("(")==false){ // stack.peek()是取栈顶元素而不弹出
                        postfixList.add(stack.pop());
                    }

                    stack.pop();// 左括号丢弃，由此完成了去括号的过程
                }else{
                    // 看栈顶元素，如果它优先级大于等于当前操作符的优先级，则弹出放到后续表达式列表中
                    while( stack.size()>0 && (getOpLevel(stack.peek())>=getOpLevel(opThis)) ){
                        postfixList.add(stack.pop());
                    }

                    stack.push(opThis);// 当前操作符入栈
                }

            }else{
                // 这个分支是当前项是操作数的情况
                postfixList.add(str);// 操作数直接入栈
            }
        }

        // 将栈中余下的操作符弹出放到后续表达式列表中
        while(stack.size()>0){
            String opTop=stack.pop();
            postfixList.add(opTop);
        }
    }

    // 取得操作符的等级
    private int getOpLevel(String op){
        if(op.equals("+") || op.equals("-") ){
            return 0;
        }else if(op.equals("*") || op.equals("/") ){
            return 1;
        }

        return -1;
    }

    public void print(){
        for(String str:postfixList){
            System.out.print(str);
        }
    }
}