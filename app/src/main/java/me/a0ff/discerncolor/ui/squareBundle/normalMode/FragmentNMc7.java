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

public class FragmentNMc7 extends Fragment implements SquareFragmentBundle {

    @BindView(R.id.c7_11)
    SquareView sq11;
    @BindView(R.id.c7_12)
    SquareView sq12;
    @BindView(R.id.c7_13)
    SquareView sq13;
    @BindView(R.id.c7_14)
    SquareView sq14;
    @BindView(R.id.c7_15)
    SquareView sq15;
    @BindView(R.id.c7_16)
    SquareView sq16;
    @BindView(R.id.c7_17)
    SquareView sq17;
    @BindView(R.id.c7_21)
    SquareView sq21;
    @BindView(R.id.c7_22)
    SquareView sq22;
    @BindView(R.id.c7_23)
    SquareView sq23;
    @BindView(R.id.c7_24)
    SquareView sq24;
    @BindView(R.id.c7_25)
    SquareView sq25;
    @BindView(R.id.c7_26)
    SquareView sq26;
    @BindView(R.id.c7_27)
    SquareView sq27;
    @BindView(R.id.c7_31)
    SquareView sq31;
    @BindView(R.id.c7_32)
    SquareView sq32;
    @BindView(R.id.c7_33)
    SquareView sq33;
    @BindView(R.id.c7_34)
    SquareView sq34;
    @BindView(R.id.c7_35)
    SquareView sq35;
    @BindView(R.id.c7_36)
    SquareView sq36;
    @BindView(R.id.c7_37)
    SquareView sq37;
    @BindView(R.id.c7_41)
    SquareView sq41;
    @BindView(R.id.c7_42)
    SquareView sq42;
    @BindView(R.id.c7_43)
    SquareView sq43;
    @BindView(R.id.c7_44)
    SquareView sq44;
    @BindView(R.id.c7_45)
    SquareView sq45;
    @BindView(R.id.c7_46)
    SquareView sq46;
    @BindView(R.id.c7_47)
    SquareView sq47;
    @BindView(R.id.c7_51)
    SquareView sq51;
    @BindView(R.id.c7_52)
    SquareView sq52;
    @BindView(R.id.c7_53)
    SquareView sq53;
    @BindView(R.id.c7_54)
    SquareView sq54;
    @BindView(R.id.c7_55)
    SquareView sq55;
    @BindView(R.id.c7_56)
    SquareView sq56;
    @BindView(R.id.c7_57)
    SquareView sq57;
    @BindView(R.id.c7_61)
    SquareView sq61;
    @BindView(R.id.c7_62)
    SquareView sq62;
    @BindView(R.id.c7_63)
    SquareView sq63;
    @BindView(R.id.c7_64)
    SquareView sq64;
    @BindView(R.id.c7_65)
    SquareView sq65;
    @BindView(R.id.c7_66)
    SquareView sq66;
    @BindView(R.id.c7_67)
    SquareView sq67;
    @BindView(R.id.c7_71)
    SquareView sq71;
    @BindView(R.id.c7_72)
    SquareView sq72;
    @BindView(R.id.c7_73)
    SquareView sq73;
    @BindView(R.id.c7_74)
    SquareView sq74;
    @BindView(R.id.c7_75)
    SquareView sq75;
    @BindView(R.id.c7_76)
    SquareView sq76;
    @BindView(R.id.c7_77)
    SquareView sq77;

    //TODO: go on 7

    public FragmentNMc7() {
        super();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_square_c7, container, false);
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
