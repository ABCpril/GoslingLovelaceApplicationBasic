package com.example.a90904.goslinglovelace;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView2 = (TextView)findViewById(R.id.content2);
        textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        super.onConfigurationChanged(newConfig);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // 加入横屏要处理的代码
            setContentView(R.layout.activity_main2);
            TextView textView2 = (TextView)findViewById(R.id.content2);
            textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            // 加入竖屏要处理的代码
            setContentView(R.layout.activity_main);
            TextView textView = (TextView)findViewById(R.id.content);
            textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
    }
}
