package my.alerter;

import android.forms.BaseActivity.BaseActivity;
import android.forms.BaseActivity.Managers.FragmentActivityManager;

import my.alerter.fragments.one.Fragment1;
import my.alerter.fragments.three.Fragment3;
import my.alerter.fragments.two.Fragment2;

/**
 * @author Elliott Marshall
 */

public class MyFragmentActivityManager<A extends BaseActivity> extends FragmentActivityManager<A> {
    public final static int
            FRAGMENT1 = 0,
            FRAGMENT2 = 1,
            FRAGMENT3 = 2;

    public MyFragmentActivityManager(A mainActivity) {
        super(mainActivity);
    }

    @Override
    public void changeFragmentTo(int fragmentCode) {
        switch (fragmentCode) {
            case FRAGMENT1: changeFragment(Fragment1.class, Fragment1.KEY); break;
            case FRAGMENT2: changeFragment(Fragment2.class, Fragment2.KEY); break;
            case FRAGMENT3: changeFragment(Fragment3.class, Fragment3.KEY); break;

        }
    }

    @Override
    public void changeFragmentToWithBackAnimation(int fragmentCode) {
        switch (fragmentCode) {
            case FRAGMENT1: changeFragmentWithBackAnimation(Fragment1.class, Fragment1.KEY); break;
            case FRAGMENT2: changeFragmentWithBackAnimation(Fragment2.class, Fragment2.KEY); break;
            case FRAGMENT3: changeFragmentWithBackAnimation(Fragment3.class, Fragment3.KEY); break;
        }
    }

    @Override
    public void changeFragmentToWithForwardAnimation(int fragmentCode) {
        switch (fragmentCode) {
            case FRAGMENT1: changeFragmentWithForwardAnimation(Fragment1.class, Fragment1.KEY); break;
            case FRAGMENT2: changeFragmentWithForwardAnimation(Fragment2.class, Fragment2.KEY); break;
            case FRAGMENT3: changeFragmentWithForwardAnimation(Fragment3.class, Fragment3.KEY); break;
        }
    }

    @Override
    public void backPress() {
        //TODO
    }
}
