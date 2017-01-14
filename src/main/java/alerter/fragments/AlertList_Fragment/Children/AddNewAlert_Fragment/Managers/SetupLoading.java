package alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment.Managers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Managers.FragmentManager;

import alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment.Managers.Workers.SetLoadingLayouts;
import alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment.Managers.Workers.PauseWorker;

/**
 * @author Elliott Marshall
 */

public class SetupLoading<F extends BaseFragment, A extends BaseActivity> extends FragmentManager<F, A> {
    private SetupLoading() { super(null, null); }
    public SetupLoading(F fragment, A activity) {
        super(fragment, activity);
    }

    @Override
    public void execute() {
        new SetLoadingLayouts(getMyActivity(), getMyFragment()).start();
        new PauseWorker(getMyActivity(), getMyFragment()).start();
    }
}