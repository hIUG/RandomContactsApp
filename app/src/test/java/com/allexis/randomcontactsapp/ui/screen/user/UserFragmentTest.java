package com.allexis.randomcontactsapp.ui.screen.user;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by allexis on 11/2/17.
 */


@RunWith(RobolectricTestRunner.class)
public class UserFragmentTest {

    private static final String TEST_USER_NAME = "TEST_USER_NAME";

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    UserFragment fragment;

    @Mock
    UserFragmentViewModel viewModel;

    @Before
    public void setup() {
        fragment = UserFragment.newInstance(TEST_USER_NAME);
    }

    @Test
    public void testDismissButtonClick() {
        fragment.viewModel = viewModel;
        fragment.onUserDismissClick();
        Mockito.verify(fragment.viewModel, Mockito.times(1)).handleDismissClick();
    }
}
