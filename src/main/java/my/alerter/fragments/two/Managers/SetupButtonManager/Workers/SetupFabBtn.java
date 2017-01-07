package my.alerter.fragments.two.Managers.SetupButtonManager.Workers;

import android.content.ContentValues;
import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.BaseActivityManagersList;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.DataBaseManager;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Worker.Worker;
import android.view.View;
import android.widget.EditText;
import my.alerter.R;

/**
 * @author Elliott Marshall
 */

public class SetupFabBtn<A extends BaseActivity, F extends BaseFragment> extends Worker<A, F> {
    private SetupFabBtn() { super(null, null); }
    public SetupFabBtn(A activity, F fragment) { super(activity, fragment); }

    private EditText search;

    @Override
    public void start() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        bam.setFabOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search = (EditText) getMyActivity().findViewById(R.id.search);
                if (search.getText().toString().equals("")) return;

                DataBaseManager dbm = (DataBaseManager) getMyActivity().getActivityManager(BaseActivityManagersList.DATABASE_MANAGER);

                ContentValues cv = new ContentValues();
                cv.put(getString(R.string.CommentText), search.getText().toString());
                dbm.getDatabaseController().getStatementProcessor().insert(cv, getString(R.string.Comment));
                search.setText("");
            }
        });
    }
}