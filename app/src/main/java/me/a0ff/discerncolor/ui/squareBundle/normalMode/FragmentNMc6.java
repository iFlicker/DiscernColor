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
import me.a0ff.discerncolor.R;
import me.a0ff.discerncolor.api.SquareFragmentBundle;
import me.a0ff.discerncolor.ui.widget.SquareView;

/**
 * Created by flicker on 16/11/21.
 */

public class FragmentNMc6 extends Fragment implements SquareFragmentBundle {

    @BindView(R.id.c6_11)
    SquareView sq11;
    @BindView(R.id.c6_12)
    SquareView sq12;
    @BindView(R.id.c6_13)
    SquareView sq13;
    @BindView(R.id.c6_14)
    SquareView sq14;
    @BindView(R.id.c6_15)
    SquareView sq15;
    @BindView(R.id.c6_16)
    SquareView sq16;
    @BindView(R.id.c6_21)
    SquareView sq21;
    @BindView(R.id.c6_22)
    SquareView sq22;
    @BindView(R.id.c6_23)
    SquareView sq23;
    @BindView(R.id.c6_24)
    SquareView sq24;
    @BindView(R.id.c6_25)
    SquareView sq25;
    @BindView(R.id.c6_26)
    SquareView sq26;
    @BindView(R.id.c6_31)
    SquareView sq31;
    @BindView(R.id.c6_32)
    SquareView sq32;
    @BindView(R.id.c6_33)
    SquareView sq33;
    @BindView(R.id.c6_34)
    SquareView sq34;
    @BindView(R.id.c6_35)
    SquareView sq35;
    @BindView(R.id.c6_36)
    SquareView sq36;
    @BindView(R.id.c6_41)
    SquareView sq41;
    @BindView(R.id.c6_42)
    SquareView sq42;
    @BindView(R.id.c6_43)
    SquareView sq43;
    @BindView(R.id.c6_44)
    SquareView sq44;
    @BindView(R.id.c6_45)
    SquareView sq45;
    @BindView(R.id.c6_46)
    SquareView sq46;
    @BindView(R.id.c6_51)
    SquareView sq51;
    @BindView(R.id.c6_52)
    SquareView sq52;
    @BindView(R.id.c6_53)
    SquareView sq53;
    @BindView(R.id.c6_54)
    SquareView sq54;
    @BindView(R.id.c6_55)
    SquareView sq55;
    @BindView(R.id.c6_56)
    SquareView sq56;
    @BindView(R.id.c6_61)
    SquareView sq61;
    @BindView(R.id.c6_62)
    SquareView sq62;
    @BindView(R.id.c6_63)
    SquareView sq63;
    @BindView(R.id.c6_64)
    SquareView sq64;
    @BindView(R.id.c6_65)
    SquareView sq65;
    @BindView(R.id.c6_66)
    SquareView sq66;

    //TODO: go on 6

    public FragmentNMc6() {
        super();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_square_c6, container, false);
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
