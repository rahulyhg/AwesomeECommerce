package linchange.com.core.delegates;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * Created by lkmc2 on 2017/12/28.
 * Fragment代理基础界面
 */

public abstract class BaseDelegate extends SwipeBackFragment {
    public abstract Object setLayout();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = null;
        if (setLayout() instanceof Integer) {
            rootView = inflater.inflate((Integer) setLayout(), container, false);
        } else if (setLayout() instanceof View) {
            rootView = (View) setLayout();
        }



        return super.onCreateView(inflater, container, savedInstanceState);
    }
}