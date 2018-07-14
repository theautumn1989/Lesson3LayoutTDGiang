package com.example.tomato.lesson3layouttdgiang.activity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.tomato.lesson3layouttdgiang.R;

public class ExerciseOneActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton rbtnRed, rbtnWhite, rbtnBlue;
    Button btnSetColor, btnClear;
    TextView tvColor;
    int colorCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_one);

        initView();
        initEvent();

        // lấy text color ban đầu
        if (tvColor.getBackground() instanceof ColorDrawable) {
            ColorDrawable cd = (ColorDrawable) tvColor.getBackground();
            colorCode = cd.getColor();
        }
    }

    private void initEvent() {
        btnSetColor.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    private void initView() {
        rbtnBlue = findViewById(R.id.rbtn_blue);
        rbtnRed = findViewById(R.id.rbtn_red);
        rbtnWhite = findViewById(R.id.rbtn_white);
        btnClear = findViewById(R.id.btn_clear);
        btnSetColor = findViewById(R.id.btn_set_color);
        tvColor = findViewById(R.id.tv_color);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_set_color:
                setColor();
                break;
            case R.id.btn_clear:
                clearColor();
                break;
            default:
                break;
        }
    }

    private void clearColor() {

        tvColor.setBackgroundColor(colorCode);
    }

    private void setColor() {
        if (rbtnRed.isChecked()) {
            tvColor.setBackgroundColor(Color.parseColor(getString(R.string.red_color)));
        }
        if (rbtnWhite.isChecked()) {
            tvColor.setBackgroundColor(Color.parseColor(getString(R.string.white_color)));
        }
        if (rbtnBlue.isChecked()) {
            tvColor.setBackgroundColor(Color.parseColor(getString(R.string.blue_color)));
        }
    }
}
