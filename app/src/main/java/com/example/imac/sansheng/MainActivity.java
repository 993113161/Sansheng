package com.example.imac.sansheng;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private int[] imageIds = new int[]{R.drawable.baiqian, R.drawable.yehua, R.drawable.zheyan, R.drawable.fengjiu, R.drawable.qingcang, R.drawable.donghua};
    private String[] names = new String[]{"白浅", "夜华", "折颜", "凤九", "擎苍", "东华"};
    private String[] anames = new String[]{"杨幂", "赵又廷", "张智尧", "迪丽热巴", "连奕名", "高伟光"};
    private String[] jianjie = new String[]{
            "九尾白狐青丘帝姬,\n战神墨渊之徒\n......",
            "九重天上的天君长孙太子，\n深沉稳重喜着玄衣\n......",
            "开天辟地第一只凤凰，\n退隐三界\n......",
            "四海八荒独一无二的九尾红狐\n淳美灵动\n......",
            "现任翼君离镜的父亲，\n有断袖之癖\n......",
            "无父无母生于碧海苍灵，\n位天地共主\n......"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题
        setContentView(R.layout.activity_main);


        // 创建一个List集合，List集合的元素是Map
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItem.put("anames", anames[i]);
            listItem.put("jianjie", jianjie[i]);
            listItems.add(listItem);
        }


        ListView list = (ListView) findViewById(R.id.mylist);

        // 创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                listItems,
                R.layout.simple_item,
                new String[]{"header", "personName", "anames","jianjie"},
                new int[]{R.id.header, R.id.names, R.id.anames, R.id.jianjie});

        // 为ListView设置Adapter
        list.setAdapter(simpleAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this
                        , DetailActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);

            }
        });

    }
}
