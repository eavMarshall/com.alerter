package my.alerter.fragments.two.Managers.SetupButtonManager.Workers;

import android.elliott.database.Components.ListViewUpdater.ListViewUpdater;
import android.elliott.database.Components.ListViewUpdater.ViewListAdapter;
import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.BaseActivityManagersList;
import android.forms.BaseActivity.Managers.DataBaseManager;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Worker.Worker;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import my.alerter.R;

/**
 * @author Elliott Marshall
 */

public class SetupSearchEditText<A extends BaseActivity, F extends BaseFragment> extends Worker<A, F> {
    private SetupSearchEditText() { super(null, null); }
    public SetupSearchEditText(A activity, F fragment) { super(activity, fragment); }

    private EditText search;
    private ListViewUpdater listView;

    @Override
    public void start() {
        search = (EditText) getMyActivity().findViewById(R.id.search);
        listView = (ListViewUpdater) getMyActivity().findViewById(R.id.commentList);
        resetListView();
        search.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void afterTextChanged(Editable editable) {
                DataBaseManager dbm = (DataBaseManager) getMyActivity().getActivityManager(BaseActivityManagersList.DATABASE_MANAGER);
                if (editable.toString().equals("")) resetListView();
                ViewListAdapter vla = new ViewListAdapter(
                        getMyActivity(),
                        dbm.getDatabaseController().getStatementProcessor().rawQuery(getString(R.string.searchComment), editable.toString()),
                        R.layout.fragment2_comment,
                        listView
                );
                listView.setAdapter(vla);
            }
        });
    }

    public void resetListView() {
        DataBaseManager dbm = (DataBaseManager) getMyActivity().getActivityManager(BaseActivityManagersList.DATABASE_MANAGER);
        ViewListAdapter vla = new ViewListAdapter(
                getMyActivity(),
                dbm.getDatabaseController().getStatementProcessor().rawQuery(getString(R.string.findAllComment)),
                R.layout.fragment2_comment,
                listView
        );

        listView.setAdapter(vla);
    }
}