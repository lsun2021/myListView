package com.demo.mylistview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView listView;

    String [] data={"学生一","学生二","学生三","学生四","学生五","学生六","学生七","学生八","学生九","学生十","学生十一","学生十二","学生十三"};
   private  int [] imagesId={R.mipmap.aa1,R.mipmap.a1,R.mipmap.a2,R.mipmap.a3,R.mipmap.a4,R.mipmap.a5,R.mipmap.a6,R.mipmap.a7,R.mipmap.a8,R.mipmap.a9,R.mipmap.a10,R.mipmap.a11,R.mipmap.a12,R.mipmap.a13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylist);
        listView = (ListView) findViewById(R.id.myList_lv);

        BaseAdapter baseAdapter=new BaseAdapter() {

            //获取每一行的布局
            @Override
            public int getCount() {
                return data.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            //获取每一行的布局
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

              //获取行布局
                LayoutInflater inflater = getLayoutInflater();
                LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.item_list, null);

                //行布局中的控件
                ImageView image = (ImageView)layout.findViewById(R.id.iv_head);
                TextView tv1 = (TextView)layout.findViewById(R.id.tv_student_name);
              //更新行布局中的内容
                image.setImageResource(imagesId[position]);
                tv1.setText(data[position]);

                return layout;
            }
        };

listView.setAdapter(baseAdapter);
    }


}
