package carlos.torres.ourfirstapp.di.modules

import carlos.torres.ourfirstapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
//    @ContributesAndroidInjector(
//        modules = [
//              ViewModuleModule::class
//
//        ]
//    )

    abstract fun contributeMainActivity():MainActivity



}