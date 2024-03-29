package alerter.fragments.Setting_Fragment;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.ToolBarActivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alerter.MyFragmentActivityManager;
import alerter.fragments.AlertFragment;
import my.alerter.R;

/**
 * @author Elliott Marshall
 */
public class Setting_Fragment<A extends BaseActivity> extends AlertFragment<A> {
    public final static String KEY = "Setting_Fragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //addPreLoadManager();
        //addPostManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return setView(inflater, container, R.layout.setting);
    }

    @Override
    protected void loadSettings() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        if (null == bam) return;
        ToolBarActivityManager tbm = (ToolBarActivityManager) getMyActivity().getActivityManager(BaseActivity.TOOLBAR_MANAGER);
        if (null == tbm) return;
        bam.enableFabBtn(false);
        tbm.selectNavPosition(1);
        tbm.lockNavDraw(false);
        tbm.setBackButton(false);
        tbm.setTitle(getString(R.string.Setting));
        setHasOptionsMenu(true);
    }

    @Override
    public int getParent() {
        return MyFragmentActivityManager.LIST;
    }
}