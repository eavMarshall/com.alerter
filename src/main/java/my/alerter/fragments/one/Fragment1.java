package my.alerter.fragments.one;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.PopupActivityManager;
import android.forms.BaseActivity.Managers.ToolBarActivityManager;
import android.forms.Fragments.BaseFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import my.alerter.R;
import my.alerter.fragments.one.Managers.SetupButtonManager.SetupButtonManager;

/**
 * @author Elliott Marshall
 */
public class Fragment1<A extends BaseActivity> extends BaseFragment<A> {
    public final static String KEY = "ExercisesFragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreLoadManager(new SetupButtonManager(this, getMyActivity()));
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
        tbm.setNavigationMenu(R.menu.activity_main_drawer);
        tbm.setBackButton(false);
        tbm.selectNavPosition(0);
        tbm.lockNavDraw(false);
        tbm.setTitle("Fragment 1");
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.frag1_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        PopupActivityManager pam = (PopupActivityManager) getMyActivity().getActivityManager(BaseActivity.POPUP_MANAGER);
        switch (item.getItemId()) {
            case R.id.item1: pam.sendToastMessage("You pressed item 1"); return true;
            case R.id.item2: pam.sendToastMessage("You pressed item 2"); return true;
            case R.id.item3: pam.sendToastMessage("You pressed item 3"); return true;
            case R.id.item4: pam.sendToastMessage("You pressed item 4"); return true;
            case R.id.item5: pam.sendToastMessage("You pressed item 5"); return true;
            default: break;
        }

        return false;
    }

    @Override
    public int getParent() {
        return -1;
    }

    @Override
    protected String getAdmobID() {
        return "123456789";
    }
}