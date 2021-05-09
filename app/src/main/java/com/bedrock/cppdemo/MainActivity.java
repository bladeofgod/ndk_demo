package com.bedrock.cppdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bedrock.cppdemo.databinding.ActivityMainBinding;
import com.bedrock.cppdemo.jni.TestJni;

public class MainActivity extends AppCompatActivity {

    private final TestJni testJni= new TestJni();

    private ActivityMainBinding binding;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(testJni.getStringFromJNI());

        result = binding.tvResult;
        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(testJni.getAddResult(3, 5) + "");
            }
        });
    }


}