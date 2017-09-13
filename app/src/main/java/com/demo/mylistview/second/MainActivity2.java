package com.demo.mylistview.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.demo.mylistview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${momoThree} on 2017/9/13.
 * Title:
 */

public class MainActivity2  extends AppCompatActivity {

    private List<Student> studentList=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylist);
        initStudent();
        StudentAdapter adapter=new StudentAdapter(MainActivity2.this,R.layout.item_list,studentList);
        ListView listView= (ListView) findViewById(R.id.myList_lv);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student=studentList.get(position);
                Toast.makeText(MainActivity2.this, student.getName(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void initStudent() {
        for (int i = 0; i < 2; i++) {
            Student student1=new Student("学生一",R.mipmap.a1);
            studentList.add(student1);
            Student student2=new Student("学生二",R.mipmap.a2);
            studentList.add(student2);
            Student student3=new Student("学生三",R.mipmap.a3);
            studentList.add(student3);
            Student student4=new Student("学生四",R.mipmap.a4);
            studentList.add(student4);
            Student student5=new Student("学生五",R.mipmap.a5);
            studentList.add(student5);
            Student student6=new Student("学生六",R.mipmap.a6);
            studentList.add(student6);
            Student student7=new Student("学生七",R.mipmap.a7);
            studentList.add(student7);
            Student student8=new Student("学生八",R.mipmap.a8);
            studentList.add(student8);
            Student student9=new Student("学生九",R.mipmap.a9);
            studentList.add(student9);
            Student student10=new Student("学生十",R.mipmap.a10);
            studentList.add(student10);
            Student student11=new Student("学生十一",R.mipmap.a11);
            studentList.add(student11);
            Student student12=new Student("学生十二",R.mipmap.a12);
            studentList.add(student12);
            Student student13=new Student("学生十三",R.mipmap.a13);
            studentList.add(student13);

        }
    }


}
