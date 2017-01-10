package alerter.fragments.AlertList_Fragment.Managers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.Fragments.Managers.FragmentManager;

import alerter.fragments.AlertList_Fragment.Managers.Workers.SetupFabBtn;
import alerter.fragments.AlertList_Fragment.AlertList_Fragment;

/**
 * @author Elliott Marshall
 */

public class PreLoadManager<F extends AlertList_Fragment, A extends BaseActivity> extends FragmentManager<F, A> {
    private PreLoadManager() { super(null, null); }
    public PreLoadManager(F fragment, A activity) {
        super(fragment, activity);
    }

    @Override
    public void execute() {
        new SetupFabBtn(getMyActivity(), getMyFragment()).start();
    }
}
