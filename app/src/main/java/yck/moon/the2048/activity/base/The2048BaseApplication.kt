package yck.moon.the2048.activity.base

import android.app.Application
import timber.log.Timber

class The2048BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }



}