package id.ac.ui.cs.mobileprogramming;

import android.view.View;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class Lab2UnitTest {

    private String stringToBeChecked;
    private static final String PACKAGE_NAME = "id.ac.ui.cs.mobileprogramming";

    @Rule
    public ActivityScenario activityScenarioRule = new ActivityScenario<>(MainActivity.class);

    private MainActivity myActivity = null;

    @Before
    public void setUp() throws Exception {
        myActivity = activityScenarioRule.getActivity();
    }

    @Test
    public void testLaunch() {
        View view = myActivity.findViewById(R.id.appMainText);
        assertNotNull(view);
    }

    @After
    public void tearDown() {
        myActivity = null;
    }

}