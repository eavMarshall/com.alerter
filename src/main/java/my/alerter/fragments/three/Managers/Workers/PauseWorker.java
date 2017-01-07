package my.alerter.fragments.three.Managers.Workers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.BaseActivityManagersList;
import android.forms.BaseActivity.Managers.LoadingManager;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Worker.Worker;

/**
 * @author Elliott Marshall
 */

public class PauseWorker<A extends BaseActivity, F extends BaseFragment> extends Worker<A, F> {
    private PauseWorker() { super(null, null); }
    public PauseWorker(A activity, F fragment) { super(activity, fragment); }
    @Override
    public void start() {
        try{ Thread.sleep(5000); } catch (Exception e) {}
        LoadingManager lm = (LoadingManager) getMyActivity().getActivityManager(BaseActivityManagersList.LOADING_MANAGER);
        lm.setLoading(false);
    }
}
