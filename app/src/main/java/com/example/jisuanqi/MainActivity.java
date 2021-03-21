package com.example.jisuanqi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity  {

    /*ArrayList<Button> buttonArrayList=new ArrayList<Button>();
    Button AC;
    Button left;
    Button right;
    Button chu;
    Button cheng;
    Button seven;Button eight; Button nine; Button nagetive;
    Button four; Button five; Button six;Button plus;
    Button one; Button two; Button three;Button equal;
    Button del; Button zero; Button point;*/
    TextView show=(TextView)findViewById(R.id.show);
    TextView showView=(TextView)findViewById(R.id.showView);
    StringBuffer input=null;
    String result=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sentAC(){
        input=null;
        show.setText(input);

        result=null;
        showView.setText(result);
    }
    public void sentPlus(){
        input=input.append("+");
        show.setText(input);
    }
    public void sentLeft(){
        input=input.append("(");
        show.setText(input);
    }
    public void sentRight(){
        input=input.append(")");
        show.setText(input);
    }
    public void sentChu(){
        input=input.append("/");
        show.setText(input);
    }
    public void sentCheng(){
        input=input.append("*");

    }
    public void sentSeven(){
        input=input.append("7");

    }
    public void sentEight(){
        input=input.append("8");

    }
    public void sentNine(){
        input=input.append("9");

    }
    public void sentNegative( ){
        input=input.append("-");

    }
    public void sentFour( ){
        input=input.append("4");

    }
    public void sentFive( ){
        input=input.append("5");

    }
    public void sentSix( ){
        input=input.append("6");

    }

    public void sentOne( ){
        input=input.append("1");

    }
    public void sentTwo( ){
        input=input.append("2");

    }
    public void sentThree( ){
        input=input.append("3");

    }
    public void sentDel( ){
        input=input.deleteCharAt(input.length()-1);
        //删除最后一个字符

    }
    public void sentZero( ){

        input=input.append("0");
    }
    public void sentPoint( ){
        input=input.append(".");

    }
    public void sentEqual( ){
        input=input.append("=");
        show.setText(input);

        result= calculated(input);
        showView.setText(result);
    }

    public String calculated(StringBuffer input){
        //通过字符串进行计算
        String expression;
        expression=input.toString();

        computing c=new computing();
        String re=c.computing(expression);

        return re;
    }
}