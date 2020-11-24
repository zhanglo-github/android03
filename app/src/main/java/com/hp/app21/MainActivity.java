package com.hp.app21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *  填充listview ，当点击lsitview 的item ，当前 item的内容 在 Activity_main.xml 的帧布局中显示
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * drawerlayout侧滑
     * @param view
     */
    public void cehua1(View view) {
        startActivity(new Intent(this,DrawerActivity.class));
    }


    /**
     * SliderMenuActivity
     * @param view
     */
    public void cehua2(View view) {
        startActivity(new Intent(this,SliderMenuActivity.class));
    }
}

















