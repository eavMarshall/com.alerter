package my.alerter.fragments.three;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.ToolBarActivityManager;
import android.forms.Fragments.BaseFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import my.alerter.MyFragmentActivityManager;
import my.alerter.fragments.three.Managers.SetupLoading;
import my.alerter.R;

/**
 * @author Elliott Marshall
 */
public class Fragment3<A extends BaseActivity> extends BaseFragment<A> {
    public final static String KEY = "ExercisesFragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreLoadManager(new SetupLoading(this, getMyActivity()));
        //addPostManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return setView(inflater, container, R.layout.fragment3);
    }

    @Override
    protected void loadSettings() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        ToolBarActivityManager tbm = (ToolBarActivityManager) getMyActivity().getActivityManager(BaseActivity.TOOLBAR_MANAGER);
        bam.enableFabBtn(false);
        tbm.selectNavPosition(2);
        tbm.lockNavDraw(false);
        tbm.setTitle("Fragment 3");
        setHasOptionsMenu(false);
    }

    @Override
    public int getParent() {
        return MyFragmentActivityManager.FRAGMENT1;
    }

    @Override
    protected String getAdmobID() {
        return "123456789";
    }
}