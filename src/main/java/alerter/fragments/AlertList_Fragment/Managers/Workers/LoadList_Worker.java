package alerter.fragments.AlertList_Fragment.Managers.Workers;

import android.elliott.database.Components.StatementProcessor;
import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.DataBaseManager;
import android.forms.Fragments.Worker.Worker;
import android.view.View;

import alerter.fragments.AlertList_Fragment.AlertList_Fragment;


/**
 * @author Elliott Marshall
 */

public class LoadList_Worker<A extends BaseActivity, F extends AlertList_Fragment> extends Worker<A, F> {
    private LoadList_Worker() {
        super(null, null);
    }

    public LoadList_Worker(A activity, F fragment) {
        super(activity, fragment);
    }

    @Override
    public void start() {
        View fragView = getMyFragment().getView();
        if (null == fragView) return;
        DataBaseManager dm = (DataBaseManager) getMyActivity().getActivityManager(BaseActivity.DATABASE_MANAGER);
        if (null == dm) return;
        StatementProcessor sp = dm.getDatabaseController().getStatementProcessor();
        if (null == sp) return;
    }
}
