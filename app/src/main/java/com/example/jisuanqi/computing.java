package com.example.jisuanqi;

public class computing {
    public  String computing(String re) {

        // 得到合法的算术表达式
        String expression=re;

        // 送去解析
        Lexer p=new Lexer(expression);
        //p.print();

        // 转为后序表达式
        Trans t=new Trans(p.getList());
        //t.print();

        // 计算结果
        Calculator c=new Calculator(t.getPostfixList());
        return c.getResult();
    }
}