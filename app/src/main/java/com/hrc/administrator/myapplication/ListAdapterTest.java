package com.hrc.administrator.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/3/17.
 */

public class ListAdapterTest extends BaseAdapter{
    private List<ListData> list;
    private Context context;
    private RelativeLayout relativeLayout;

    public ListAdapterTest(Context context,List<ListData> list){
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        if (list.get(position).getFlag()==ListData.UP){
            relativeLayout= (RelativeLayout) inflater.inflate(R.layout.left,parent,false);
        }else if (list.get(position).getFlag()==ListData.BOTTOM){
            relativeLayout= (RelativeLayout) inflater.inflate(R.layout.right,parent,false);
        }
        TextView tv= (TextView) relativeLayout.findViewById(R.id.tv);
        tv.setText(list.get(position).getContent());
        return relativeLayout;
    }
}
