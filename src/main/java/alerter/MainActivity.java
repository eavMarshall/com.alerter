package alerter;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.FragmentActivityManager;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.View;

import my.alerter.R;

public class MainActivity extends BaseActivity {
    @Override public String getDataBaseName() { return getString(R.string.DATABASE_NAME); }
    @Override public Integer getDataBaseVersion() { return getResources().getInteger(R.integer.DATABASE_VERSION); }
    @Override public String[] getCreateScripts() { return getResources().getStringArray(R.array.CREATE_DATABASE); }
    @Override public NavigationView.OnNavigationItemSelectedListener getOnNavigationItemSelectedListener() {
        return new MyOnNavigationItemSelectedListener(this);
    }
    @Override public View getLoadingLayout(LayoutInflater inflater) { return inflater.inflate(R.layout.fragment_loading_screen, null); }

    public void loadManagers() {
        addManager(FRAGMENT_MANAGER, new MyFragmentActivityManager<MainActivity>(this));
    }

    @Override
    public String getCurrPackageName() {
        return getPackageName();
    }

    @Override
    protected void onFinishLoadManagers() {
        FragmentActivityManager fam = (FragmentActivityManager) getActivityManager(FRAGMENT_MANAGER);
        fam.changeFragmentTo(MyFragmentActivityManager.LIST);
    }
}
