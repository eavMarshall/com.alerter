package my.alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.ToolBarActivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import my.alerter.MyFragmentActivityManager;
import my.alerter.R;
import my.alerter.fragments.AlertFragment;

/**
 * @author Elliott Marshall
 */
public class AddNew_Fragment<A extends BaseActivity> extends AlertFragment<A> {
    public final static String KEY = "AddNew_Fragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //addPreLoadManager(new SetupLoading(this, getMyActivity()));
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
        tbm.selectNavPosition(1);
        tbm.lockNavDraw(true);
        tbm.setTitle("Add");
        tbm.setBackButton(true);
        setHasOptionsMenu(false);
    }

    @Override
    public int getParent() {
        return MyFragmentActivityManager.LIST;
    }
}