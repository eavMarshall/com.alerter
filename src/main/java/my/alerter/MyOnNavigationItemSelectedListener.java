package my.alerter;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.FragmentActivityManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

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
            case R.id.frag1: fam.changeFragmentTo(MyFragmentActivityManager.CREATE); break;
            case R.id.frag2: fam.changeFragmentTo(MyFragmentActivityManager.EDIT); break;
            case R.id.frag3: fam.changeFragmentTo(MyFragmentActivityManager.ADD); break;
        }
        return true;
    }
}
