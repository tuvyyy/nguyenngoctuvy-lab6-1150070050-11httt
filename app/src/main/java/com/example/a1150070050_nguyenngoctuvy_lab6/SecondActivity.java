package com.example.a1150070050_nguyenngoctuvy_lab6;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Đảm bảo animation có sẵn khi vào Activity
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void onBackPressed() {
        // Gọi phương thức getOnBackPressedDispatcher().onBackPressed() thay cho super.onBackPressed()
        getOnBackPressedDispatcher().onBackPressed();

        // Đảm bảo animation có sẵn khi quay lại
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

