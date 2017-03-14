package com.example.imac.sansheng;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        tv = (TextView) findViewById(R.id.qwe);
//        tv.setText(position + "");
        switch (position){
            case 0: tv.setText(getResources().getString(R.string.baiqian));break;
            case 1: tv.setText(getResources().getString(R.string.yehua));break;
            case 2: tv.setText(getResources().getString(R.string.zheyan));break;
            case 3: tv.setText(getResources().getString(R.string.fengjiu));break;
            case 4: tv.setText(getResources().getString(R.string.qingcang));break;
            case 5: tv.setText(getResources().getString(R.string.donghua));break;
        }
    }
}
