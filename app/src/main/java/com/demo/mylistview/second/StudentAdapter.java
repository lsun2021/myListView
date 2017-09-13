package com.demo.mylistview.second;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.demo.mylistview.R;

import java.util.List;

/**
 * Created by ${momoThree} on 2017/9/13.
 * Title:
 */

public class StudentAdapter  extends ArrayAdapter<Student> {
    private  int resourceId;

    public StudentAdapter(@NonNull Context context, @LayoutRes int resource, List<Student> objects) {
        super(context, resource,objects);
       resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student=getItem(position);
        View  view;
        ViewHolder  holder;
        if(convertView==null){
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);//false 表明我们只让在父布局中的layout生效，但不会为这个View添加父布局（只有孤儿才能被领养）
           holder=new ViewHolder();
            holder.studentImage=(ImageView) view.findViewById(R.id.iv_head);
            holder.studentname=(TextView) view.findViewById(R.id.tv_student_name);
            view.setTag(holder);//将viewholder 存储在View中

        }else{
            view=convertView;
            holder= (ViewHolder) view.getTag();
        }

        holder.studentImage.setImageResource(student.getImageId());
        holder.studentname.setText(student.getName());
        return view;
    }
    class ViewHolder{
        ImageView studentImage;
        TextView  studentname;
    }
}
