package com.example.admin.timerturial.util

import android.content.Context
import android.preference.Preference
import android.preference.PreferenceManager
import com.example.admin.timerturial.TimerActivity

/**
 * Created by admin on 6/26/2018.
 */
class PrefUtil {
    companion object {
        private const val PREVIOUS_TIMER_LENGTH_SECONDS_ID = "timer.previous_timer_length_seconds"
        private const val SECONDS_REMAINING_ID = "timer.seconds_remaining"
        private const val TIMER_STATE_ID = "timer.timer_state"
        private const val ALARM_SET_TIME_ID = "timer.backgrounded_time"

        fun getTimerLength(context: Context): Int{
            //placeholer
            return 1
        }

        fun getPreviousTimerLengthSeconds(context: Context): Long{
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, 0)
        }

        fun setPreviousTimerLengthSeconds(seconds: Long, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, seconds)
            editor.apply()
        }

        fun getTimerState(context: Context): TimerActivity.TimerState{
            val prefenrences = PreferenceManager.getDefaultSharedPreferences(context)
            val ordinal = prefenrences.getInt(TIMER_STATE_ID, 0)
            return TimerActivity.TimerState.values()[ordinal]
        }

        fun setTimerState(state: TimerActivity.TimerState, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            val ordinal = state.ordinal
            editor.putInt(TIMER_STATE_ID, ordinal)
            editor.apply()
        }

        fun getSecondsRemaining(context: Context): Long{
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SECONDS_REMAINING_ID, 0)
        }

        fun setSecondsRemaining(seconds: Long, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(SECONDS_REMAINING_ID, seconds)
            editor.apply()
        }

        fun getAlarmSetTime(context: Context): Long{
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(ALARM_SET_TIME_ID, 0)
        }

        fun setAlarmSetTime(time: Long, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(ALARM_SET_TIME_ID, time)
            editor.apply()
        }
    }
}