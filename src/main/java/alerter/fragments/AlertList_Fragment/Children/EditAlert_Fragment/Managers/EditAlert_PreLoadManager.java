package alerter.fragments.AlertList_Fragment.Children.EditAlert_Fragment.Managers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Managers.FragmentManager;

/**
 * @author Elliott Marshall
 */

public class EditAlert_PreLoadManager<F extends BaseFragment, A extends BaseActivity> extends FragmentManager<F, A> {
    private EditAlert_PreLoadManager() { super(null, null); }
    public EditAlert_PreLoadManager(F fragment, A activity) {
        super(fragment, activity);
    }

    @Override
    public void execute() {
    }
}
