package org.owntracks.android.clean.ui.status;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;


import org.owntracks.android.clean.injection.qualifier.AppContext;
import org.owntracks.android.clean.injection.scopes.PerActivity;
import org.owntracks.android.clean.ui.base.viewmodel.BaseViewModel;

import java.util.ArrayList;

import javax.inject.Inject;

/* Copyright 2016 Patrick Löwenstein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

@PerActivity
public class StatusViewModel extends BaseViewModel<StatusMvvm.View> implements StatusMvvm.ViewModel {

    private static final String KEY_BORDERLIST = "borderList";
    private final Context ctx;


    private ArrayList<String> borderList = null;

    public StatusViewModel(@AppContext Context context) {
        this.ctx = context.getApplicationContext();


    }

    @Override
    public void saveInstanceState(@NonNull Bundle outState) {
        outState.putStringArrayList(KEY_BORDERLIST, borderList);
    }

    @Override
    public void restoreInstanceState(@NonNull Bundle savedInstanceState) {
        borderList = savedInstanceState.containsKey(KEY_BORDERLIST) ? savedInstanceState.getStringArrayList(KEY_BORDERLIST) : borderList;
    }

    @Override
    public void detachView() {
        super.detachView();
    }

}
