package alerter;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.FragmentActivityManager;

import alerter.fragments.AlertList_Fragment.AlertList_Fragment;
import alerter.fragments.AlertList_Fragment.Children.CreateAlert_Fragment.CreateAlert_Fragment;
import alerter.fragments.AlertList_Fragment.Children.AddNewAlert_Fragment.AddNew_Fragment;
import alerter.fragments.AlertList_Fragment.Children.EditAlert_Fragment.EditAlert_Fragment;

/**
 * @author Elliott Marshall
 */

public class MyFragmentActivityManager<A extends BaseActivity> extends FragmentActivityManager<A> {
    public final static int
            CREATE = 0,
            EDIT = 1,
            ADD = 2,
            LIST = 3;

    public MyFragmentActivityManager(A mainActivity) {
        super(mainActivity);
    }

    @Override
    public void changeFragmentTo(int fragmentCode) {
        switch (fragmentCode) {
            case CREATE: changeFragment(CreateAlert_Fragment.class, CreateAlert_Fragment.KEY); break;
            case EDIT: changeFragment(EditAlert_Fragment.class, EditAlert_Fragment.KEY); break;
            case ADD: changeFragment(AddNew_Fragment.class, AddNew_Fragment.KEY); break;
            case LIST: changeFragment(AlertList_Fragment.class, AlertList_Fragment.KEY); break;
        }
    }

    @Override
    public void changeFragmentToWithBackAnimation(int fragmentCode) {
        switch (fragmentCode) {
            case CREATE: changeFragmentWithBackAnimation(CreateAlert_Fragment.class, CreateAlert_Fragment.KEY); break;
            case EDIT: changeFragmentWithBackAnimation(EditAlert_Fragment.class, EditAlert_Fragment.KEY); break;
            case ADD: changeFragmentWithBackAnimation(AddNew_Fragment.class, AddNew_Fragment.KEY); break;
            case LIST: changeFragmentWithBackAnimation(AlertList_Fragment.class, AlertList_Fragment.KEY); break;
        }
    }

    @Override
    public void changeFragmentToWithForwardAnimation(int fragmentCode) {
        switch (fragmentCode) {
            case CREATE: changeFragmentWithForwardAnimation(CreateAlert_Fragment.class, CreateAlert_Fragment.KEY); break;
            case EDIT: changeFragmentWithForwardAnimation(EditAlert_Fragment.class, EditAlert_Fragment.KEY); break;
            case ADD: changeFragmentWithForwardAnimation(AddNew_Fragment.class, AddNew_Fragment.KEY); break;
            case LIST: changeFragmentWithForwardAnimation(AlertList_Fragment.class, AlertList_Fragment.KEY); break;
        }
    }

    @Override
    public void backPress() {
        //TODO
    }
}
