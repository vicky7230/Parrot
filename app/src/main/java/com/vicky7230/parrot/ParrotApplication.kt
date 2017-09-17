package com.vicky7230.parrot

import android.app.Application

import timber.log.Timber
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

/**
 * Created by vicky on 16/9/17.
 */

class ParrotApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //Timber initialization
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        //Calligraphy initialization
        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )
    }
}
