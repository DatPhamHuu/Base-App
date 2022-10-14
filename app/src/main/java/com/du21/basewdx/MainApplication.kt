package com.du21.basewdx

import android.app.Application
import com.du21.basewdx.di.appNetworkModule
import com.du21.basewdx.di.appViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                appNetworkModule,
                appViewModelModule
            )
        }
    }
}