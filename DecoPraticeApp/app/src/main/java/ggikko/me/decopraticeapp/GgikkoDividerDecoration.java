package ggikko.me.decopraticeapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by ggikko on 2016. 10. 28..
 */

public class GgikkoDividerDecoration extends RecyclerView.ItemDecoration {

    private Drawable divider;

    public GgikkoDividerDecoration(Context context, Drawable drawable) {
        this.divider = drawable;
//        int[] attr = {android.R.attr.listDivider};
//        final TypedArray a = context.obtainStyledAttributes(attr);
//        divider = a.getDrawable(0);
//        a.recycle();
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(0, divider.getIntrinsicHeight(), 0, 0);
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);

//        divider.setBounds(60,60,60,60);
//        divider.draw(c);
//        c.clipRect(new Rect(70,70,70,70));
    }
}
