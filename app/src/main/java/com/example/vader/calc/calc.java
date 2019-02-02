package com.example.vader.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class calc extends AppCompatActivity {
    double num, ans;
    int calculation;

    @BindView(R.id.a4)
    Button a4;
    @BindView(R.id.a5)
    Button a5;
    @BindView(R.id.a12)
    Button a12;
    @BindView(R.id.a6)
    Button a6;
    @BindView(R.id.a3)
    Button a3;
    @BindView(R.id.a2)
    Button a2;
    @BindView(R.id.a13)
    Button a13;
    @BindView(R.id.a1)
    Button a1;
    @BindView(R.id.a9)
    Button a9;
    @BindView(R.id.a8)
    Button a8;
    @BindView(R.id.a7)
    Button a7;
    @BindView(R.id.a11)
    Button a11;
    @BindView(R.id.a10)
    Button a10;
    @BindView(R.id.a0)
    Button a0;
    @BindView(R.id.a14)
    Button a14;
    @BindView(R.id.a00)
    Button a00;
    @BindView(R.id.editText)
    TextView text1;
    @BindView(R.id.editText2)
    TextView text2;
    @BindView(R.id.clear)
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.a4, R.id.a5, R.id.a12, R.id.a6, R.id.a3, R.id.a2, R.id.a13, R.id.a1, R.id.a9, R.id.a8, R.id.a7, R.id.a11, R.id.a10, R.id.a0, R.id.a14, R.id.a00})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.a4:
                text2.setText(text2.getText() + "4");
                break;
            case R.id.a5:
                text2.setText(text2.getText() + "5");
                break;
            case R.id.a12:
                num = Double.parseDouble(String.valueOf(text2.getText()));
                calculation = 2;
                text2.setText("");
                text1.setText(num + "-");
                break;
            case R.id.a6:
                text2.setText(text2.getText() + "6");
                break;
            case R.id.a3:
                text2.setText(text2.getText() + "3");
                break;
            case R.id.a2:
                text2.setText(text2.getText() + "2");
                break;
            case R.id.a13:
                num = Double.parseDouble(String.valueOf(text2.getText()));
                calculation = 3;
                text2.setText("");
                text1.setText(num + "*");
                break;
            case R.id.a1:
                text2.setText(text2.getText() + "1");
                break;
            case R.id.a9:
                text2.setText(text2.getText() + "9");
                break;
            case R.id.a8:
                text2.setText(text2.getText() + "8");
                break;
            case R.id.a7:
                text2.setText(text2.getText() + "7");
                break;
            case R.id.a11:
                num = Double.parseDouble(String.valueOf(text2.getText()));
                calculation = 1;
                text2.setText("");
                text1.setText(num + "+");
                break;
            case R.id.a10:
                Double neww;
                String oldd;
                neww = Double.parseDouble(String.valueOf(text2.getText()));
                oldd = String.valueOf(text1.getText());
                //calculation=1;
                //jTextArea1.setText("");
                text1.setText(oldd + neww);


                arithmetic_operation();
                break;
            case R.id.a0:
                text2.setText(text2.getText() + "0");
                break;
            case R.id.a14:
                num = Double.parseDouble(String.valueOf(text2.getText()));
                calculation = 4;
                text2.setText("");
                text1.setText(num + "/");
                break;
            case R.id.a00:
                text2.setText(text2.getText() + ".");
                break;
        }
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("");
                text2.setText("");
                calculation=0;
            }
        });
    }

    public void arithmetic_operation() {
        switch (calculation) {
            case 1:
                ans = num + Double.parseDouble(String.valueOf(text2.getText()));
                text2.setText(Double.toString(ans));
                break;
            case 2:
                ans = num - Double.parseDouble(String.valueOf(text2.getText()));
                text2.setText(Double.toString(ans));
                break;
            case 3:
                ans = num * Double.parseDouble(String.valueOf(text2.getText()));
                text2.setText(Double.toString(ans));
                break;
            case 4:
                ans = num / Double.parseDouble(String.valueOf(text2.getText()));
                text2.setText(Double.toString(ans));
                break;
                
            default:
                Toast.makeText(this, "No Operation has been Selected", Toast.LENGTH_SHORT).show();

        }

    }
}
