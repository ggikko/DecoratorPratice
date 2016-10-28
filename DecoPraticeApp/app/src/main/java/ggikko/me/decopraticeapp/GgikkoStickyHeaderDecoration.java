package ggikko.me.decopraticeapp;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by ggikko on 2016. 10. 28..
 */

public class GgikkoStickyHeaderDecoration extends RecyclerView.ItemDecoration {

    //TODO : header view의 offset
    //TODO : onDrawOver에


    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
        View header = LayoutInflater.from(parent.getContext()).inflate(R.layout.testlayout, parent, false);
        Rect headerOffset = new Rect();

    }
}
