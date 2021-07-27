package com.anushka.didemo

import com.anushka.didemo.module.MemoryCardModule
import com.anushka.didemo.module.NCBatteryModule
import dagger.Component

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
   fun getSmartPhone() : SmartPhone
}