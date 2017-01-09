package my.alerter.fragments.AlertList_Fragment.Children.CreateAlert_Fragment;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.PopupActivityManager;
import android.forms.BaseActivity.Managers.ToolBarActivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import my.alerter.MyFragmentActivityManager;
import my.alerter.R;
import my.alerter.fragments.AlertFragment;

/**
 * @author Elliott Marshall
 */
public class CreateAlert_Fragment<A extends BaseActivity> extends AlertFragment<A> {
    public final static String KEY = "CreateAlert_Fragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //addPreLoadManager(new SetupButtonManager(this, getMyActivity()));
        //addPostManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return setView(inflater, container, R.layout.fragment1);
    }

    @Override
    protected void loadSettings() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        ToolBarActivityManager tbm = (ToolBarActivityManager) getMyActivity().getActivityManager(BaseActivity.TOOLBAR_MANAGER);
        bam.enableFabBtn(true);
        //tbm.setNavigationMenu(R.menu.activity_main_drawer);
        tbm.setBackButton(false);
        tbm.selectNavPosition(0);
        tbm.lockNavDraw(false);
        tbm.setTitle("Create");
        setHasOptionsMenu(false);
    }

    @Override
    public int getParent() {
        return MyFragmentActivityManager.LIST;
    }
}