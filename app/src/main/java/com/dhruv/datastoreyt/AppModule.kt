package com.dhruv.datastoreyt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providesDatstoreRepo(
        @ApplicationContext context: Context
    ):DatastoreRepo = DataStoreRepoImpl(context)
}