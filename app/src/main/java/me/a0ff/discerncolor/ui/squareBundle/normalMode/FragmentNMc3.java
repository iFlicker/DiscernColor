package me.a0ff.discerncolor.ui.squareBundle.normalMode;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.a0ff.discerncolor.R;
import me.a0ff.discerncolor.api.SquareFragmentBundle;
import me.a0ff.discerncolor.ui.widget.SquareView;
import me.a0ff.discerncolor.util.RandomColorBuilder;

/**
 * Created by flicker on 16/11/21.
 */

public class FragmentNMc3 extends Fragment implements SquareFragmentBundle {

    @BindView(R.id.c3_11) SquareView sq11;
    @BindView(R.id.c3_12) SquareView sq12;
    @BindView(R.id.c3_13) SquareView sq13;
    @BindView(R.id.c3_21) SquareView sq21;
    @BindView(R.id.c3_22) SquareView sq22;
    @BindView(R.id.c3_23) SquareView sq23;
    @BindView(R.id.c3_31) SquareView sq31;
    @BindView(R.id.c3_32) SquareView sq32;
    @BindView(R.id.c3_33) SquareView sq33;

    private Unbinder unbinder;
    private Map<String, SquareView> sfm = new HashMap<>();
    private RandomColorBuilder rcb = new RandomColorBuilder();

    private final String current = "c3_";
    private int baseint = 3;      //3*3
    private String target;        //随机目标tmp

    public FragmentNMc3() {
        super();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_square_c3, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        contrlView();
        clickView();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void initView() {

        sfm.put("sq11", sq11);
        sfm.put("sq12", sq12);
        sfm.put("sq13", sq13);
        sfm.put("sq21", sq21);
        sfm.put("sq22", sq22);
        sfm.put("sq23", sq23);
        sfm.put("sq31", sq31);
        sfm.put("sq32", sq32);
        sfm.put("sq33", sq33);

    }

    @Override
    public void contrlView() {
        String[] tmp = rcb.getRandomColor(10);  //色差
        target = rcb.getRandomTarget(baseint);

        for (Map.Entry<String, SquareView> entry : sfm.entrySet())
            entry.getValue().setCcolor(Color.parseColor(tmp[0]));

        sfm.get("sq" + target).setCcolor(Color.parseColor(tmp[1]));
    }

    @Override
    public void clickView() {
        for (Map.Entry<String, SquareView> entry : sfm.entrySet())
            entry.getValue().setOnClickListener(new FragmentNMc3.SquareViewClickListener());
    }


    @Override
    public int getId(String sg) {
        int ret = 0;
        try {
            Field f = R.id.class.getField(sg);
            ret = f.getInt(new android.R.id());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return ret;
    }

    private class SquareViewClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            if (v.getId() == getId(current + target)) {
                Toast.makeText(getContext(), "成功击中目标", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "未击中目标", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
