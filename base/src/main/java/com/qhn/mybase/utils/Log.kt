package com.qhn.mybase.utils

import com.orhanobut.logger.Logger

/**
 * Created by G on 2017/11/6 0006.
 */
fun d(print : Any?){
    Logger.d(print)
}
fun e(print : String?){
    Logger.e(print?:"null")
}
fun j(print: String?){
    Logger.json(print)
}