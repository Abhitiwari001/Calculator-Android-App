package com.abhishek.twonumbercalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText t1,t2;
TextView r;
int a,b,c;
boolean d,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.et1);
        t2=findViewById(R.id.et2);
r=findViewById(R.id.r);
    }
public void first(View v){
        t1.setText("");
d=true;
}

    public void second(View v){
        t2.setText("");
e=true;
    }
public void sum(View v){
a=Integer.parseInt(t1.getText().toString());
    b=Integer.parseInt(t2.getText().toString());
c=a+b;
r.setText(""+c);
    }

    public void sub(View v){

        a=Integer.parseInt(t1.getText().toString());
        b=Integer.parseInt(t2.getText().toString());
        c=a-b;
        r.setText(""+c);

    }

    public void divide(View v){
       double a=Double.parseDouble(t1.getText().toString());
         double b=Double.parseDouble(t2.getText().toString());
        double d=a/b;
        r.setText(""+d);
    }

    public void multiply(View v){
        a=Integer.parseInt(t1.getText().toString());
        b=Integer.parseInt(t2.getText().toString());
        c=a*b;
        r.setText(""+c);
    }
public void clear(View v){
        t1.setText(null);
t2.setText(null);
r.setText("Result");
}
public void sine(View v){

    double a=Double.parseDouble(t1.getText().toString());
    a=Math.toRadians(a);
    r.setText("Sine Value is "+Math.sin(a));

}
    public void cosine(View v){

        double a=Double.parseDouble(t1.getText().toString());
        a=Math.toRadians(a);
        r.setText("Cosine Value is "+Math.cos(a));

    }

    public void tan(View v){

        double a=Double.parseDouble(t1.getText().toString());
        a=Math.toRadians(a);
        r.setText("Tan Value is "+Math.tan(a));

    }
}
