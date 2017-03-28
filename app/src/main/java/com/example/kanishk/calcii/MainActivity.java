package com.example.kanishk.calcii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button clear,delete,one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,multiply,divide,equal,point;
    TextView view;
    int opr1,opr2;
    boolean add,sub,div,mul;
    String chr;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        view=(TextView)findViewById(R.id.view);
        
        clear=(Button)findViewById(R.id.clearAll);
        delete=(Button)findViewById(R.id.delete);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        plus=(Button)findViewById(R.id.plus);
        minus=(Button)findViewById(R.id.minus);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        equal=(Button)findViewById(R.id.equal);
        point=(Button)findViewById(R.id.point);
        
        clear.setOnClickListener(this);
        delete.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equal.setOnClickListener(this);
        point.setOnClickListener(this);
        
        view.setCursorVisible(true);
        view.setHint("0");

        /*Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(100); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);*/
        
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.clearAll:
                if(view.getText().length()!=0){
                    view.setText(view.getText().toString().substring(0,view.getText().length() -view.getText().length()));   
                }
                else{
                    view.append("");

                }
                break;
            case R.id.delete:
                
                if(view.getText().length()!=0){
                    view.setText(view.getText().toString().substring(0,view.getText().length() - 1));
                }
                else{
                    view.append("");

                }
                    
                break;
            case R.id.one:
             view.append("1");
                break;
            case R.id.two:
                view.append("2");
                break;
            case R.id.three:
                view.append("3");
                break;
            case R.id.four:
                view.append("4");
                break;
            case R.id.five:
                view.append("5");
                break;
            case R.id.six:
                view.append("6");
                break;
            case R.id.seven:
                view.append("7");
                break;
            case R.id.eight:
                view.append("8");
                break;
            case R.id.nine:
                view.append("9");
                break;
            case R.id.zero:
                view.append("0");
                break;
            case R.id.plus:
                opr1=Integer.parseInt(view.getText()+"");
                add=true;
                view.setText(null);
                //view.append("+");
                break;
            case R.id.minus:
                opr1=Integer.parseInt(view.getText()+"");
                sub=true;
                view.setText(null);
               // view.append("-");
                break;
            case R.id.multiply:
                opr1=Integer.parseInt(view.getText()+"");
                mul=true;
                view.setText(null);
                //view.append("*");
                break;
            case R.id.divide:
                opr1=Integer.parseInt(view.getText()+"");
                div=true;
                view.setText(null);
                //view.append("/");
                break;
            case R.id.equal:
               /* for(int i=0;i>=0;i++)
                {
                chr.charAt(i);
                }
                if(chr.equals("+")){
                    opr2=Integer.parseInt(view.getText().toString());
                    opr1=opr1+opr2;
                    view.setText(Integer.toString(opr1));

                }
                else if(chr.equals("-"))
                {
                    opr2=Integer.parseInt(view.getText().toString());
                    opr1=opr1-opr2;
                    view.setText(Integer.toString(opr1));
                }
                else if(chr.equals("*")) {
                    opr2=Integer.parseInt(view.getText().toString());
                    opr1=opr1*opr2;
                    view.setText(Integer.toString(opr1));
                }
                else if(chr.equals("/")){
                    opr2=Integer.parseInt(view.getText().toString());
                    opr1=opr1/opr2;
                    view.setText(Integer.toString(opr1));

                }
                else if(chr.equals("^")){
                    opr2=Integer.parseInt(view.getText().toString());
                    opr1=opr1^opr2;
                    view.setText(Integer.toString(opr1));
                }*/
                opr2=Integer.parseInt(view.getText()+"");
                if (add==true) {
                    view.setText(opr1+opr2+"");
                    add=false;
                }
                if (sub==true) {
                    view.setText(opr1-opr2+"");
                    sub=false;
                }
                if (mul==true) {
                    view.setText(opr1*opr2+"");
                    mul=false;
                }
                if (div==true) {
                    view.setText(opr1/opr2+"");
                    div=false;
                }
                break;
            case R.id.point:
                view.append(".");
                break;
           
        }
    }
}
   
