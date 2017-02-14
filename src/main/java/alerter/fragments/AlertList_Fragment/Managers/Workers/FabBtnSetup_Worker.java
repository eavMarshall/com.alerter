package alerter.fragments.AlertList_Fragment.Managers.Workers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.FragmentActivityManager;
import android.forms.Fragments.Worker.Worker;
import android.view.View;

import alerter.MyFragmentActivityManager;
import alerter.fragments.AlertList_Fragment.AlertList_Fragment;


/**
 * @author Elliott Marshall
 */

public class FabBtnSetup_Worker<A extends BaseActivity, F extends AlertList_Fragment> extends Worker<A, F> {
    private FabBtnSetup_Worker() {
        super(null, null);
    }

    public FabBtnSetup_Worker(A activity, F fragment) {
        super(activity, fragment);
    }

    @Override
    public void start() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        if (null == bam) return;
        bam.setFabOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivityManager fam = (FragmentActivityManager) getMyActivity().getActivityManager(BaseActivity.FRAGMENT_MANAGER);
                if (null == fam) return;
                fam.changeFragmentToWithForwardAnimation(MyFragmentActivityManager.ADD);
            }
        });
    }
}
