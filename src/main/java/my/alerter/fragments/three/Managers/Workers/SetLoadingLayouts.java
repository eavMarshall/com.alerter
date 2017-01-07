package my.alerter.fragments.three.Managers.Workers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.BaseActivityManagersList;
import android.forms.BaseActivity.Managers.LoadingManager;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Worker.Worker;
import android.view.View;
import my.alerter.R;

/**
 * @author Elliott Marshall
 */

public class SetLoadingLayouts<A extends BaseActivity, F extends BaseFragment> extends Worker<A, F> {
    private SetLoadingLayouts() { super(null, null); }
    public SetLoadingLayouts(A activity, F fragment) { super(activity, fragment); }
    @Override
    public void start() {
        View loadingView = getMyActivity().findViewById(R.id.loading);
        View nonLoadingView = getMyActivity().findViewById(R.id.nonLoading);

        LoadingManager lm = (LoadingManager) getMyActivity().getActivityManager(BaseActivityManagersList.LOADING_MANAGER);
        lm.addLoadingLayout(loadingView);
        lm.addMainLayout(nonLoadingView);
        lm.setLoading(true);
    }
}
