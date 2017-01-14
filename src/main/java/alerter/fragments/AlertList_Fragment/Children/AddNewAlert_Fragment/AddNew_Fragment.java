package alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment;

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
        setBackAsClear();
    }

    @Override
    public int getParent() {
        return MyFragmentActivityManager.LIST;
    }
}