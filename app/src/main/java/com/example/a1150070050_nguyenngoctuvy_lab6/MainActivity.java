package com.example.a1150070050_nguyenngoctuvy_lab6;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnFadeInXml, btnFadeInCode, btnFadeOutXml, btnFadeOutCode;
    private ImageView ivUitLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsByIds();
        initAnimations();
    }

    private void findViewsByIds() {
        ivUitLogo = findViewById(R.id.iv_uit_logo);
        btnFadeInXml = findViewById(R.id.btn_fade_in_xml);
        btnFadeInCode = findViewById(R.id.btn_fade_in_code);
        btnFadeOutXml = findViewById(R.id.btn_fade_out_xml);
        btnFadeOutCode = findViewById(R.id.btn_fade_out_code);
    }

    private void initAnimations() {
        // Tạo ObjectAnimator cho fade-in và fade-out
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(ivUitLogo, "alpha", 0f, 1f);
        fadeIn.setDuration(1000); // Độ dài animation

        ObjectAnimator fadeOut = ObjectAnimator.ofFloat(ivUitLogo, "alpha", 1f, 0f);
        fadeOut.setDuration(1000); // Độ dài animation

        // Gắn sự kiện cho các button
        btnFadeInXml.setOnClickListener(v -> fadeIn.start());
        btnFadeOutXml.setOnClickListener(v -> fadeOut.start());

        btnFadeInCode.setOnClickListener(v -> fadeIn.start());
        btnFadeOutCode.setOnClickListener(v -> fadeOut.start());
    }
}
