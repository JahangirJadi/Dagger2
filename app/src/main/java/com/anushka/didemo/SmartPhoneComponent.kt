package com.anushka.didemo

import com.anushka.didemo.module.MemoryCardModule
import dagger.Component

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {
   fun getSmartPhone() : SmartPhone
}