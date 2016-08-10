package org.owntracks.android.clean.ui.status;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import org.owntracks.android.R;
import org.owntracks.android.clean.ui.base.BaseActivity;
import org.owntracks.android.clean.ui.base.navigator.Navigator;
import org.owntracks.android.databinding.ActivityStatusBinding;

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
public class ActivityStatus extends BaseActivity<ActivityStatusBinding, StatusMvvm.ViewModel> implements StatusMvvm.View {

    private Menu menu = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setAndBindContentView(R.layout.activity_status, savedInstanceState);

        setSupportActionBar((Toolbar) binding.fragmentToolbar);
        //viewModel.update(Parcels.unwrap(getIntent().getParcelableExtra(Navigator.EXTRA_ARGS)), false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_status, menu);
        this.menu = menu;
        //MenuItem favoriteItem = menu.findItem(R.id.menu_item_favorite);
        //MenuItem mapItem = menu.findItem(R.id.menu_item_maps);
        //favoriteItem.setIcon(viewModel.getBookmarkDrawable());
        //tintMenuIcon(favoriteItem);
        //tintMenuIcon(mapItem);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //switch(item.getItemId()) {
        //    case android.R.id.home: {
        //        finish();
        //        break;
        //    }
        //    case R.id.menu_item_favorite: {
        //        viewModel.onBookmarkClick(null);
        //        break;
        //    }
        //    case R.id.menu_item_maps: {
        //        viewModel.onMapClick(null);
        //        break;
        //    }
        //}

        return super.onOptionsItemSelected(item);
    }

    private static void tintMenuIcon(MenuItem menuItem) {
        Drawable favoriteIcon = DrawableCompat.wrap(menuItem.getIcon().mutate());
        DrawableCompat.setTint(favoriteIcon, 0xFFFFFFFF);
        menuItem.setIcon(favoriteIcon);
    }
}
