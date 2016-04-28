package demo.zmz.com.gridviewdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.GridView;

/**
 * Project : GridViewDemo
 * Package : demo.zmz.com.gridviewdemo
 * Todo
 * Created by Zhang Mingzhe on 2016/4/28.
 * Mail : zhangmingzhe@navinfo.com.
 * Update by on .
 * Mail : .
 */
public class MyGridView extends GridView implements AbsListView.OnScrollListener {

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnScrollListener(this);
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if (scrollState == OnScrollListener.SCROLL_STATE_IDLE){
            View c = view.getChildAt(0);
            if (c != null) {
                int top = -c.getTop();
                if (top < c.getHeight() / 2){
                    view.smoothScrollToPositionFromTop(getFirstVisiblePosition(), 0);
                } else {
                    view.smoothScrollToPositionFromTop(getFirstVisiblePosition() + getNumColumns(), 0);
                }
            }
        }

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }
}
