package alerter;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.FragmentActivityManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import my.alerter.R;

/**
 * @author Elliott Marshall
 */
public class MyOnNavigationItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener {
    private BaseActivity mainActivity;
    private MyOnNavigationItemSelectedListener() {}
    public MyOnNavigationItemSelectedListener(BaseActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        DrawerLayout drawer = (DrawerLayout) mainActivity.findViewById(android.forms.R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        FragmentActivityManager fam = (FragmentActivityManager) mainActivity.getActivityManager(BaseActivity.FRAGMENT_MANAGER);
        switch (item.getItemId()) {
            case R.id.nav_home: fam.changeFragmentTo(MyFragmentActivityManager.LIST); break;
            case R.id.nav_settings: fam.changeFragmentTo(MyFragmentActivityManager.SETTING); break;
        }
        return true;
    }
}
