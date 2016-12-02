package me.a0ff.discerncolor.ui.squareBundle.normalMode;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Field;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.a0ff.discerncolor.R;
import me.a0ff.discerncolor.api.SquareFragmentBundle;
import me.a0ff.discerncolor.ui.widget.SquareView;

/**
 * Created by flicker on 16/11/21.
 */

public class FragmentNMc3 extends Fragment implements SquareFragmentBundle {

    @BindView(R.id.c3_11)
    SquareView sq11;
    @BindView(R.id.c3_12)
    SquareView sq12;
    @BindView(R.id.c3_13)
    SquareView sq13;
    @BindView(R.id.c3_21)
    SquareView sq21;
    @BindView(R.id.c3_22)
    SquareView sq22;
    @BindView(R.id.c3_23)
    SquareView sq23;
    @BindView(R.id.c3_31)
    SquareView sq31;
    @BindView(R.id.c3_32)
    SquareView sq32;
    @BindView(R.id.c3_33)
    SquareView sq33;
    private Unbinder unbinder;

    //TODO: go on 3

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
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void initView() {

    }

    @Override
    public void clickView() {

    }

    @Override
    public void contrlView() {

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
}
