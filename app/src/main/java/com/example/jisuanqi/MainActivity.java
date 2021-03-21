package com.example.jisuanqi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    TextView show;
    TextView showView;
    StringBuffer input=new StringBuffer();
    String result=new String();
    //Button one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show=(TextView)findViewById(R.id.show);//这一行为什么不能放在前面
        showView=(TextView)findViewById(R.id.showView);

        //one=(Button)findViewById(R.id.b41);
    }

   public void sentAC(View view){
        input.delete(0,input.length());
        //input=null;
        //show.setText(input);
       // show.clearComposingText();
       show.setText(input);

        //result=null;

        //showView.setText(result);
        //showView.clearComposingText();
       showView.setText(" ");
    }

    public void sentPlus(View view){
        input=input.append("+");
        show.setText(input);
    }

    public void sentLeft(View view){
        input=input.append("(");
        show.setText(input);
    }

    public void sentRight(View view){
        input=input.append(")");
        show.setText(input);

    }

    public void sentChu(View view){
        input=input.append("/");
        show.setText(input);
    }

    public void sentCheng(View view){
        input=input.append("*");
        show.setText(input);
    }

    public void sentSeven(View view){
        input=input.append("7");
        show.setText(input);
    }
    public void sentEight(View view){
        input=input.append("8");
        show.setText(input);
    }
    public void sentNine(View view){
        input=input.append("9");
        show.setText(input);
    }
    public void sentNegative(View view ){
        input=input.append("-");
        show.setText(input);
    }
    public void sentFour(View view ){
        input=input.append("4");
        show.setText(input);
    }
    public void sentFive( View view){
        input=input.append("5");
        show.setText(input);
    }
    public void sentSix( View view){
        input=input.append("6");
        show.setText(input);
    }

    public void sentOne( View view){System.out.println("*****点击1");

        input.append("1");//input是一个StringBuffer类，需要new一下
        System.out.println("点击1");
        //String i=input.toString();
        show.setText(input);

    }
    public void sentTwo( View view){
        input=input.append("2");
        show.setText(input);
    }
    public void sentThree(View view ){
        input=input.append("3");
        show.setText(input);
    }
    public void sentDel(View view ){
        input=input.deleteCharAt(input.length()-1);
        //删除最后一个字符
        show.setText(input);
        showView.setText(" ");
    }
    public void sentZero(View view ){

        input=input.append("0");
        show.setText(input);
    }
    public void sentPoint( View view){
        input=input.append(".");
        show.setText(input);

    }
    public void sentEqual(View view ){
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
        String re;
        re=c.computing(expression);

        return re;
    }
}