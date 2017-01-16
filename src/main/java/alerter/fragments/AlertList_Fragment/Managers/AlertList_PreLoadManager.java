package alerter.fragments.AlertList_Fragment.Managers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.Fragments.Managers.FragmentManager;

import alerter.fragments.AlertList_Fragment.AlertList_Fragment;
import alerter.fragments.AlertList_Fragment.Managers.Workers.FabBtnSetup_Worker;

/**
 * @author Elliott Marshall
 */

public class AlertList_PreLoadManager<F extends AlertList_Fragment, A extends BaseActivity> extends FragmentManager<F, A> {
    private AlertList_PreLoadManager() { super(null, null); }
    public AlertList_PreLoadManager(F fragment, A activity) {
        super(fragment, activity);
    }

    @Override
    public void execute() {
        new FabBtnSetup_Worker(getMyActivity(), getMyFragment()).start();
    }
}
