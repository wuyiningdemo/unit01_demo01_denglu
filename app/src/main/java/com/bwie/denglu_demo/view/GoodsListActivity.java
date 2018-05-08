package com.bwie.denglu_demo.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by 武医宁 on 2018/5/8.
 */

public class GoodsListActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=new Intent(GoodsListActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
