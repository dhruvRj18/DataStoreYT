package com.dhruv.datastoreyt

import androidx.lifecycle.ViewModel
import com.dhruv.datastoreyt.Constants.USER_NAME
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class DataStoreViewModel @Inject constructor(
    private val datastoreRepository : DatastoreRepo
):ViewModel() {

    fun storeUserName(value:String) = runBlocking {
        datastoreRepository.putString(USER_NAME,value)
    }
    fun getUserName():String = runBlocking {
        datastoreRepository.getString(USER_NAME)!!
    }

    fun clearPreferences(key:String) = runBlocking {
        datastoreRepository.clearPReferences(key)
    }

}