# Calculator
1、实现了界面但是界面不是很美观，我没有实现在constraintlayout下设置将他们居中，所以最后在手机上运行的截图就是qq上面的那样

（美观度还需更新）

2、实现了逻辑运算，输入字符串，自动得出结果

我在网上看到有人说可以直接用 

ScriptEngineManager maneger = new ScriptEngineManager(); ScriptEngine engine = maneger.getEngineByName("JavaScript"); 

来实现，但是我没有那个javax的包

3、界面传值到后台，我是用的onclick="java代码中的一个函数名" 

//（问题：我的虚拟机上怎么也找不到这个项目，于是我就用真机测试，在我的代码还没有写完的时候，是可以打开的，

//但是后面这个计算器在真机上一直出现闪退的情况，clear也不行，我还没有解决，后面解决了我会更新说明问题） 

//郭老师，我尽力了，但是我在交作业前可能真的解决不了这个问题！！！

目前这个问题已经解决掉了，我之前的代码主要有以下几个问题：

1）逻辑错误，闪退就是逻辑错误造成的

2）我看了老师发的代码和网上的一些代码，是用的onClickListener，但是我觉得我理解不太清楚，我在文档中找到了

/** Called when the user touches the button */
public void sendMessage(View view) {
    // Do something in response to button click
}

这一段代码，当界面中的按钮被点击的时候，调用java函数

3）因为之前很少写java代码，有的时候就会忘记使用对象要先new
