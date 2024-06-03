package com.example.appnews.data.manager

import android.content.Context
import com.example.appnews.domain.manager.LocalUserManager
import com.example.appnews.util.Constants
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/*
private val Context.dataStore by preferencesDataStore(
    name = Constants.USER_SETTINGS
)*/
data class LocalUserManagerImpl(
    private val context: Context
): LocalUserManager {

    override suspend fun saveAppEntry() {
        // TODO:
    }

    override fun readAppEntry(): Flow<Boolean> {
       return flow {
           emit(true)
       }
    }
}


