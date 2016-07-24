package me.a0ff.discerncolor.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import me.a0ff.discerncolor.R;

/**
 * Created by flicker on 16/7/24.
 */
public class SquareView extends View {

    private int Ccolor;
    private int Bcolor;

    private Paint mPaint;

    private int h_view;
    private int w_view;

    public SquareView(Context context) {
        this(context,null);
    }

    public SquareView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SquareView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SquareView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        TypedArray a = context.getTheme().
                obtainStyledAttributes(attrs,R.styleable.SquareView,defStyleAttr,defStyleRes);
        Ccolor = a.getColor(R.styleable.SquareView_Ccolor,Color.BLACK);
        Bcolor = a.getColor(R.styleable.SquareView_Bcolor,Color.WHITE);
        a.recycle();

        mPaint = new Paint();
        mPaint.setAntiAlias(true);          //抗锯齿
        mPaint.setColor(Ccolor);            //画笔颜色
        mPaint.setStyle(Paint.Style.FILL);  //画笔风格
        mPaint.setStrokeWidth(5);           //画笔粗细

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        h_view = MeasureSpec.getSize(heightMeasureSpec);
        w_view = MeasureSpec.getSize(widthMeasureSpec);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Bcolor);

        RectF r = new RectF(0,0,h_view,w_view);

        canvas.drawRoundRect(r,100,100,mPaint);

    }
    public void setCcolor(int Cc){
        this.Ccolor = Cc;
    }
}
