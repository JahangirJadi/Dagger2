package com.anushka.didemo.module

import com.anushka.didemo.MemoryCard
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard(): MemoryCard {
        return MemoryCard()
    }

}