package alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment.Managers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Managers.FragmentManager;

/**
 * @author Elliott Marshall
 */

public class AddNewAlert_PreLoadManager<F extends BaseFragment, A extends BaseActivity> extends FragmentManager<F, A> {
    private AddNewAlert_PreLoadManager() { super(null, null); }
    public AddNewAlert_PreLoadManager(F fragment, A activity) {
        super(fragment, activity);
    }
}
