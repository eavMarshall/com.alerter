package my.alerter.fragments.two.Managers.SetupButtonManager;

import android.forms.BaseActivity.BaseActivity;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Managers.FragmentManager;

import my.alerter.fragments.one.Managers.SetupButtonManager.Workers.SetupFabBtn;
import my.alerter.fragments.two.Managers.SetupButtonManager.Workers.SetupSearchEditText;

/**
 * @author Elliott Marshall
 */

public class SetupButtonManager<F extends BaseFragment, A extends BaseActivity> extends FragmentManager<F, A> {
    private SetupButtonManager() { super(null, null); }
    public SetupButtonManager(F fragment, A activity) {
        super(fragment, activity);
    }

    @Override
    public void execute() {
        new SetupFabBtn(getMyActivity(), getMyFragment()).start();
        new SetupSearchEditText(getMyActivity(), getMyFragment()).start();
    }
}
