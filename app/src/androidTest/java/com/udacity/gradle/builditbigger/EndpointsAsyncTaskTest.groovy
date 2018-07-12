package com.udacity.gradle.builditbigger

import android.text.TextUtils

import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4.class)
class EndpointsAsyncTaskTest {
    @Test
    void testOnPostExecute() {

        String mString = null
        Exception mException = null


        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask()

        endpointsAsyncTask.setListener(new EndpointsAsyncTask.EndpointListener(){
            @Override
            void onComplete(String joke, Exception e) {
                mString = joke
                mException = e
                checkResults(joke,e)
            }
        })
        endpointsAsyncTask.execute(this)

    }

    void checkResults(String joke, Exception e){
        assertNull(e)
        assertFalse(TextUtils.isEmpty(joke))
        assertTrue(!TextUtils.isEmpty(joke))
    }
}
