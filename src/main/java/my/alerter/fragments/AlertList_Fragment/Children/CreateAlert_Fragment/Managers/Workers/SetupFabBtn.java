package my.alerter.fragments.AlertList_Fragment.Children.CreateAlert_Fragment.Managers.Workers;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.ButtonActivityManager;
import android.forms.BaseActivity.Managers.PopupActivityManager;
import android.forms.Fragments.BaseFragment;
import android.forms.Fragments.Worker.Worker;
import android.view.View;

/**
 * @author Elliott Marshall
 */

public class SetupFabBtn<A extends BaseActivity, F extends BaseFragment> extends Worker<A, F> {
    private SetupFabBtn() { super(null, null); }
    public SetupFabBtn(A activity, F fragment) { super(activity, fragment); }
    @Override
    public void start() {
        ButtonActivityManager bam = (ButtonActivityManager) getMyActivity().getActivityManager(BaseActivity.BUTTON_MANAGER);
        bam.setFabOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupActivityManager pam = (PopupActivityManager) getMyActivity().getActivityManager(BaseActivity.POPUP_MANAGER);
                pam.sendToastMessage("You click the FAB button");
            }
        });
    }
}
