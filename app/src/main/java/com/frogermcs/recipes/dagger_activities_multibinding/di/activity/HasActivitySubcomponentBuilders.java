package com.frogermcs.recipes.dagger_activities_multibinding.di.activity;

import android.app.Activity;

/**
 * Created by froger_mcs on 18/09/16.
 */
public interface HasActivitySubcomponentBuilders {
  ActivityComponentBuilder getActivityComponentBuilder(Class<? extends Activity> activityClass);
}
