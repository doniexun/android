package org.owntracks.android.clean.injection.modules;


import org.owntracks.android.clean.ui.status.StatusMvvm;
import org.owntracks.android.clean.ui.status.StatusViewModel;

import dagger.Binds;
import dagger.Module;

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
@Module
public abstract class ViewModelModule {

    // Activities

    @Binds
    abstract StatusMvvm.ViewModel bindDetailViewModel(StatusViewModel detailViewModel);


    //// Fragments
    //@Binds
    //abstract IAllCountriesViewModel bindAllCountriesViewModel(AllCountriesViewModel allCountriesViewModel);

    //@Binds
    //abstract IFavoriteCountriesViewModel bindFavoriteCountriesViewModel(FavoriteCountriesViewModel countryViewModel);


    //// View Holders
    //@Binds
    //abstract StatusMvvm.ViewModel bindCountryViewModel(CountryViewModel countryViewModel);

}
