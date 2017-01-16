package alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment.Managers.Workers;

import android.content.ContentValues;
import android.elliott.database.Components.StatementProcessor;
import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.DataBaseManager;
import android.forms.BaseActivity.Managers.FragmentActivityManager;
import android.forms.BaseActivity.Managers.PopupActivityManager;
import android.forms.Fragments.Worker.Worker;
import android.view.View;
import android.widget.EditText;

import alerter.MyFragmentActivityManager;
import alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment.AddNew_Fragment;
import my.alerter.R;


/**
 * @author Elliott Marshall
 */

public class Save_Worker<A extends BaseActivity, F extends AddNew_Fragment> extends Worker<A, F> {
    private Save_Worker() {
        super(null, null);
    }

    public Save_Worker(A activity, F fragment) {
        super(activity, fragment);
    }

    @Override
    public void start() {
        View fragView = getMyFragment().getView();
        if (null == fragView) return;

        FragmentActivityManager fam = (FragmentActivityManager) getMyActivity().getActivityManager(BaseActivity.FRAGMENT_MANAGER);
        if (null == fam) return;

        PopupActivityManager pam = (PopupActivityManager) getMyActivity().getActivityManager(BaseActivity.POPUP_MANAGER);
        if (null == pam) return;

        DataBaseManager dbm = (DataBaseManager) getMyActivity().getActivityManager(BaseActivity.DATABASE_MANAGER);
        if (null == dbm) return;

        StatementProcessor sp = dbm.getDatabaseController().getStatementProcessor();
        EditText addText = (EditText) getMyFragment().getView().findViewById(R.id.addtext);
        if (null == addText) return;

        if (addText.getText().toString().equals("")) {
            pam.sendToastMessage(getString(R.string.Error_EmptyName));
        } else {
            ContentValues cv = new ContentValues();
            cv.put(getString(R.string.Name), addText.getText().toString());
            sp.insert(cv, getString(R.string.AlertName));
            fam.changeFragmentToWithForwardAnimation(MyFragmentActivityManager.LIST);
        }
    }
}
