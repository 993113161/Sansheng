package com.example.imac.sansheng;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tv;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        tv = (TextView) findViewById(R.id.qwe);
        iv = (ImageView) findViewById(R.id.iv);
//        tv.setText(position + "");
        switch (position){
            case 0:
                break;
            case 1:
                tv.setText(getResources().getString(R.string.yehua));
                iv.setImageDrawable(getResources().getDrawable(R.drawable.yehua));
                break;
            case 2:
                tv.setText(getResources().getString(R.string.zheyan));
                iv.setImageDrawable(getResources().getDrawable(R.drawable.zheyan));
                break;
            case 3:
                tv.setText(getResources().getString(R.string.fengjiu));
                iv.setImageDrawable(getResources().getDrawable(R.drawable.fengjiu));
                break;
            case 4:
                tv.setText(getResources().getString(R.string.qingcang));
                iv.setImageDrawable(getResources().getDrawable(R.drawable.qingcang));
                break;
            case 5:
                tv.setText(getResources().getString(R.string.donghua));
                iv.setImageDrawable(getResources().getDrawable(R.drawable.donghua));
                break;
        }
    }
}
