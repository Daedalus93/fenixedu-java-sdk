package org.fenixedu.sdk.android;

import org.fenixedu.sdk.FenixEduClient;

import com.google.gson.JsonObject;

/**
 * This endpoint returns the information for canteen.
 * 
 */
public class GetCanteenAsyncTask extends FenixEduAsyncTask<Void, JsonObject> {

    public GetCanteenAsyncTask(FenixEduClient client) {
        super(client);
    }

    @Override
    protected JsonObject executeInBackground(Void... params) {
        return getClient().publicScope().getCanteen();
    }

}