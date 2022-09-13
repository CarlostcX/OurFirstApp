package carlos.torres.ourfirstapp.di.component

import android.app.Application
import carlos.torres.ourfirstapp.MainDaggerApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,

    ]

)

interface AppComponent : AndroidInjector<MainDaggerApp>{
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application) : AppComponent
    }

}