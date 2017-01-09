package my.alerter.fragments;

import android.forms.BaseActivity.BaseActivity;
import android.forms.Fragments.BaseFragment;

/**
 * @author Elliott Marshall
 */

public abstract class AlertFragment <A extends BaseActivity> extends BaseFragment<A> {
    @Override
    protected String getAdmobID() {
        return "123456789";
    }
}
