package com.goodco.basiccalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAdd,btnSub,btnMul,btnDiv;
    private TextView tvresult;
    private EditText etfirst, etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSubtract);
        btnMul = (Button)findViewById(R.id.btnMultiply);
        btnDiv = (Button)findViewById(R.id.btnDivide);
        etfirst = (EditText)findViewById(R.id.etFirstNumber);
        etsecond = (EditText)findViewById(R.id.etSecondNumber);
        tvresult = (TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();
        switch(view.getId()){
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvresult.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvresult.setText(String.valueOf(subtraction));
                break;
            case R.id.btnMultiply:
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvresult.setText(String.valueOf(multiplication));
                break;
            case R.id.btnDivide:
                try {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(division));
                } catch(Exception e) {
                    tvresult.setText("Cannot divide!");
                }
                break;

        }
    }
}
