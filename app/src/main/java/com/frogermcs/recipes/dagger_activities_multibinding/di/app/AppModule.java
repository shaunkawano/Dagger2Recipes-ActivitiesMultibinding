package com.frogermcs.recipes.dagger_activities_multibinding.di.app;

import com.frogermcs.recipes.dagger_activities_multibinding.Utils;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by froger_mcs on 14/09/16.
 */

@Module public class AppModule {

  public AppModule() {
  }

  @Provides @Singleton public Utils provideUtils() {
    return new Utils();
  }
}
