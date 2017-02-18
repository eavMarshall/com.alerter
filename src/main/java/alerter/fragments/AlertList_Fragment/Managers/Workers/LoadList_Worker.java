package alerter.fragments.AlertList_Fragment.Managers.Workers;

import android.elliott.database.Components.DataSet.DataSet;
import android.elliott.database.Components.ListViewUpdater.ListViewUpdater;
import android.forms.BaseActivity.BaseActivity;
import android.forms.Fragments.Worker.Worker;

import alerter.fragments.AlertList_Fragment.AlertList_Fragment;
import my.alerter.R;


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
        DataSet dataSet = getStatementProcessor().rawQuery(getString(R.string.getAllAlerts));
        ListViewUpdater alertList = (ListViewUpdater) getFragView().findViewById(R.id.alert_list);
        alertList.setDataSet(dataSet, R.layout.alertlist_fragment_item);
    }
}
