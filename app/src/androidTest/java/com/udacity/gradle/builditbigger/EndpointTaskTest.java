package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointTaskTest{
    @Test
    public void testOnPostExecute(){

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();

        endpointsAsyncTask.setListener(new EndpointsAsyncTask.EndpointListener(){
            @Override
            public void onComplete(String joke) {
                checkResults(joke);
            }
        });
        endpointsAsyncTask.execute(InstrumentationRegistry.getContext());

    }

    void checkResults(String joke){
        assertNotNull(joke);
        assertFalse(TextUtils.isEmpty(joke));
        assertTrue(!TextUtils.isEmpty(joke));
        assertEquals(joke, "I am not great at the advice. Can I interest you in a sarcastic comment?");
    }


}
