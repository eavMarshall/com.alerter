package alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.ToolBarActivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import alerter.MyFragmentActivityManager;
import alerter.fragments.AlertFragment;
import alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment.Managers.Workers.Save_Worker;
import my.alerter.R;

/**
 * @author Elliott Marshall
 */
public class AddNew_Fragment<A extends BaseActivity> extends AlertFragment<A> {
    public final static String KEY = "AddNew_Fragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //addPreLoadManager(new AddNewAlert_PreLoadManager(this, getMyActivity()));
        //addPostManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return setView(inflater, container, R.layout.add);
    }

    @Override
    protected void loadSettings() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        if (null == bam) return;
        ToolBarActivityManager tbm = (ToolBarActivityManager) getMyActivity().getActivityManager(BaseActivity.TOOLBAR_MANAGER);
        if (null == tbm) return;
        bam.enableFabBtn(false);
        tbm.selectNavPosition(1);
        tbm.lockNavDraw(true);
        tbm.setTitle(getString(R.string.Add));
        tbm.setBackButton(true);
        setHasOptionsMenu(true);
        setBackAsClear();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.add, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save:
                new Save_Worker(getMyActivity(), this).start();
                return true;
        }

        return false;
    }

    @Override
    public int getParent() {
        return MyFragmentActivityManager.LIST;
    }
}