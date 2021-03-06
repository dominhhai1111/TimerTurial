package com.example.admin.timerturial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.admin.timerturial.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        // TODO: This method is called when the BroadcastReceiver is receiving
        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
