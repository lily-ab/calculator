package com.example.myapplication;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    TextView editText;
    TextView resultField;
    Calculator calculator=new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.numberField);
        resultField = findViewById(R.id.resultField);
    }

    public void opClick(View view) {
        Button button = (Button)view;
        if(editText.length()>50){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Хватит тыкать на кнопки!!!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            editText.append(button.getText());
        }
    }

    public void pointClick(View view) {
    }

    public void calcClick(View view) throws Exception {
        String res="";
        String expr= String.valueOf(editText.getText());
        try {
            expr=calculator.opn(expr);
            res = Double.toString(calculator.calculate(expr));
        }
        catch (Exception ex){
            Toast toast = Toast.makeText(getApplicationContext(),
                    ex.getMessage(), Toast.LENGTH_SHORT);
            toast.show();
        }
        resultField.setText(res);
    }

    public void numClick(View view) {
        Button button = (Button)view;
        if(editText.length()>50){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Хватит тыкать на кнопки!!!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            editText.append(button.getText());
        }
    }

    public void bracketClick(View view) {
        Button button = (Button)view;
        if(editText.length()>50){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Хватит тыкать на кнопки!!!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            editText.append(button.getText());
        }
    }

    public void clearOneClick(View view) {
    }

    public void clearClick(View view) {
        editText.setText("");
    }


}
