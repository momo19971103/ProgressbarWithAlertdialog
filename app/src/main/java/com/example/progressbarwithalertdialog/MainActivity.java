package com.example.progressbarwithalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
int count=0;
    ProgressDialogUtil progressDialogUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialogUtil = new ProgressDialogUtil();
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    ProgressDialogUtil.showProgressDialog(MainActivity.this);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ProgressDialogUtil.dismiss(); //你想要延遲執行的程式碼
                    }
                }, 1000);



            }

        });
    }
}
