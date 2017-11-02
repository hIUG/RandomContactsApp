package com.allexis.randomcontactsapp.ui.screen.splash;


import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.allexis.randomcontactsapp.R;
import com.allexis.randomcontactsapp.ui.screen.home.HomeActivity;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SplashAndHomeActivityTest {

    private static final String TEST_USER_NAME = "";

    @Rule
    public ActivityTestRule<HomeActivity> mActivityTestRule = new ActivityTestRule<>(HomeActivity.class, true, false);

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }

    @Test
    public void testNotLoggedInName() {
//        mActivityTestRule.getActivity().authDisplayName = TEST_USER_NAME;
        Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Intent intent = new Intent(targetContext, HomeActivity.class);

        mActivityTestRule.launchActivity(intent);

        //User name label should match no name when no user logged in
        onView(withId(R.id.user_profile_name)).check(matches(withText("Hi !")));
//        // Added a sleep statement to match the app's execution delay.
//        // The recommended way to handle such scenarios is to use Espresso idling resources:
//        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
//        try {
//            Thread.sleep(3598767);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        ViewInteraction supportVectorDrawablesButton = onView(
//                allOf(withId(R.id.google_button), withText("Sign in with Google"),
//                        childAtPosition(
//                                allOf(withId(R.id.btn_holder),
//                                        childAtPosition(
//                                                withId(R.id.container),
//                                                0)),
//                                1)));
//        supportVectorDrawablesButton.perform(scrollTo(), click());
//
//        // Added a sleep statement to match the app's execution delay.
//        // The recommended way to handle such scenarios is to use Espresso idling resources:
//        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
//        try {
//            Thread.sleep(3598857);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        ViewInteraction textView = onView(
//                allOf(withText("Hi Hugo Allexis Cardona Escalante!"),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(R.id.main_content_layout),
//                                        0),
//                                0),
//                        isDisplayed()));
//        textView.check(matches(withText("Hi Hugo Allexis Cardona Escalante!")));

    }
}
