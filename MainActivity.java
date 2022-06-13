package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonE,buttonZ,buttonC,buttonPlu,buttonMin,buttonMul,buttonDiv;
    EditText et;
    float res1;
    boolean add,sub,mul,div;
    float answer;
    void storPre()
    {
        res1=Float .parseFloat(et.getText()+"");
    }
    void setFalse()
    {
        add=sub=mul=div=false;
    }
    void clear()
    {
        et.setText(null);
        setFalse();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttonZ=(Button)findViewById(R.id.buttonZ);
        buttonE=(Button)findViewById(R.id.buttonE);
        buttonC=(Button)findViewById(R.id.buttonC);
        buttonDiv=(Button)findViewById(R.id.buttonDiv);
        buttonMul=(Button)findViewById(R.id.buttonMul);
        buttonPlu=(Button)findViewById(R.id.buttonPlu);
        buttonMin=(Button)findViewById(R.id.buttonMin);
        et=(EditText)findViewById(R.id.et);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"9");
            }
        });
        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"0");
            }
        });

        buttonPlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {
                    et.setText("");
                }
                else
                {
                    storPre();
                    setFalse();
                    add=true;
                    et.setText(null);

                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {
                    et.setText("");
                }
                else
                {
                    storPre();
                    setFalse();
                    mul=true;
                    et.setText(null);
                }
            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {
                    et.setText("");
                }
                else
                {
                    storPre();
                    setFalse();
                    sub=true;
                    et.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {
                    et.setText("");
                }
                else
                {
                    storPre();
                    setFalse();
                    div=true;
                    et.setText(null);
                }
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (add)
                {
                    et.setText(res1+Float.parseFloat(et.getText()+"")+"");
                }
                if (sub)
                {
                    et.setText(res1-Float.parseFloat(et.getText()+"")+"");
                }if (mul)
                {
                    et.setText(res1*Float.parseFloat(et.getText()+"")+"");
                }if (div)
                {
                    et.setText(res1/Float.parseFloat(et.getText()+"")+"");
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

    }
}