package alerter.fragments.AlertList_Fragment.Managers.Workers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.FragmentActivityManager;
import android.forms.Fragments.Worker.Worker;
import android.view.View;
import android.widget.EditText;

import alerter.MyFragmentActivityManager;
import alerter.fragments.AlertList_Fragment.AlertList_Fragment;

/**
 * @author Elliott Marshall
 */

public class SetupFabBtn<A extends BaseActivity, F extends AlertList_Fragment> extends Worker<A, F> {
    private SetupFabBtn() { super(null, null); }
    public SetupFabBtn(A activity, F fragment) { super(activity, fragment); }

    private EditText search;

    @Override
    public void start() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        bam.setFabOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentActivityManager fam = (FragmentActivityManager) getMyActivity().getActivityManager(BaseActivity.FRAGMENT_MANAGER);
                fam.changeFragmentToWithForwardAnimation(MyFragmentActivityManager.ADD);
            }
        });
    }
}