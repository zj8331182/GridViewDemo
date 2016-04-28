package demo.zmz.com.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Project : GridViewDemo
 * Package : demo.zmz.com.gridviewdemo
 * Todo
 * Created by Zhang Mingzhe on 2016/4/28.
 * Mail : zhangmingzhe@navinfo.com.
 * Update by on .
 * Mail : .
 */
public class GAdapter extends BaseAdapter {

    Context context;
    List<String> list;

    public GAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
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
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        TextView tv = (TextView) view.findViewById(R.id.item_tv);
        tv.setText(list.get(position));
        return view;
    }
}
