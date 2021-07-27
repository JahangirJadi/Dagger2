package com.anushka.didemo.module

import com.anushka.didemo.Battery
import com.anushka.didemo.NickelCadmiumBattery
import dagger.Module
import dagger.Provides

@Module
class NCBatteryModule {

    @Provides
    fun providesNCBattery(nickelCadmiumBattery: NickelCadmiumBattery):Battery{
        return nickelCadmiumBattery
    }
}