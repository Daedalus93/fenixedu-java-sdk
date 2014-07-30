package org.fenixedu.sdk.android;

import org.fenixedu.sdk.FenixEduClient;

import com.google.gson.JsonArray;

/**
 * Groups are used in courses for a wide range of purposes. The most typical are for creating teams of students for laboratories
 * or projects.
 * Some groups are shared among different courses. The enrolment of student groups may be atomic or individual, and may be
 * restricted to an enrolment period.
 */
public class GetCourseGroupsAsyncTask extends FenixEduAsyncTask<String, JsonArray> {

    public GetCourseGroupsAsyncTask(FenixEduClient client) {
        super(client);
    }

    @Override
    protected JsonArray executeInBackground(String... params) {
        return getClient().publicScope().getCourseGroups(params[0]);
    }

}
