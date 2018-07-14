package com.example.tomato.lesson3layouttdgiang.activity;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tomato.lesson3layouttdgiang.R;

public class ExerciseTowActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnColor1, btnColor2, btnColor3, btnClear;
    TextView tvColor;
    int colorCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_tow);


        initView();
        initEvent();
        // lấy text color ban đầu
        if (tvColor.getBackground() instanceof ColorDrawable) {
            ColorDrawable cd = (ColorDrawable) tvColor.getBackground();
            colorCode = cd.getColor();
        }
    }

    private void initEvent() {
        btnClear.setOnClickListener(this);
        btnColor1.setOnClickListener(this);
        btnColor2.setOnClickListener(this);
        btnColor3.setOnClickListener(this);
    }

    private void initView() {
        tvColor = findViewById(R.id.tv_color);
        btnColor1 = findViewById(R.id.btn_color_1);
        btnColor2 = findViewById(R.id.btn_color_2);
        btnColor3 = findViewById(R.id.btn_color_3);
        btnClear = findViewById(R.id.btn_clear);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_color_1:
                tvColor.setBackgroundColor(getResources().getColor(R.color.color_red));
                break;
            case R.id.btn_color_2:
                tvColor.setBackgroundColor(getResources().getColor(R.color.color_yellow));
                break;
            case R.id.btn_color_3:
                tvColor.setBackgroundColor(getResources().getColor(R.color.color_blue));
                break;
            case R.id.btn_clear:
                tvColor.setBackgroundColor(colorCode);
                break;
            default:
                break;
        }
    }
}
