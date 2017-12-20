package com.zcy.ghost.vivideo.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Xuanhao on 2016/3/8.
 */
public class UnScrollViewPager extends ViewPager {
    private boolean isScrollable;

    public UnScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UnScrollViewPager(Context context) {
        super(context);
    }

    public void setScrollable(boolean scrollable) {
        isScrollable = scrollable;
    }

    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        return isScrollable && super.onTouchEvent(arg0);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        return isScrollable && super.onInterceptTouchEvent(arg0);
    }
}