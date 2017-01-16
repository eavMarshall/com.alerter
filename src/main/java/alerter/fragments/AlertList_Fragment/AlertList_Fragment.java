package alerter.fragments.AlertList_Fragment;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.ToolBarActivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alerter.fragments.AlertFragment;
import alerter.fragments.AlertList_Fragment.Managers.AlertList_PreLoadManager;
import my.alerter.R;

/**
 * @author Elliott Marshall
 */
public class AlertList_Fragment<A extends BaseActivity> extends AlertFragment<A> {
    public final static String KEY = "AlertList_Fragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreLoadManager(new AlertList_PreLoadManager(this, getMyActivity()));
        //addPostManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return setView(inflater, container, R.layout.alertlist);
    }

    @Override
    protected void loadSettings() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        ToolBarActivityManager tbm = (ToolBarActivityManager) getMyActivity().getActivityManager(BaseActivity.TOOLBAR_MANAGER);
        bam.enableFabBtn(true);
        tbm.selectNavPosition(0);
        tbm.lockNavDraw(false);
        tbm.setBackButton(false);
        tbm.setTitle("Alerts");
        setHasOptionsMenu(true);
    }

    @Override
    public int getParent() {
        return -1;
    }
}