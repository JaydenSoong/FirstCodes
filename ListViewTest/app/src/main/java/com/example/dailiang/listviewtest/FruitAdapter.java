package com.example.dailiang.listviewtest;

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

import java.util.List;

/**
 * Created by DaiLiang on 2017/4/14.
 * 自定义适配器
 */

class FruitAdapter extends ArrayAdapter<Fruit> {
    private  int resourceId;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);

        // 通过 convertView 对布局进行缓存
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        // assert 判断水果不能为空，否则将退出。
        assert fruit != null;
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());

        //View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        //ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        //TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);


        //fruitImage.setImageResource(fruit.getImageId());
        //fruitName.setText(fruit.getName());

        return view;
    }

    FruitAdapter(@NonNull Context context, @LayoutRes int textViewResourceId, @NonNull List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }


    private class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
}
