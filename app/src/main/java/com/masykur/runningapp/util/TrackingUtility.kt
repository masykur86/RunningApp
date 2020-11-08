package com.masykur.runningapp.util

import android.content.Context
import android.os.Build
import pub.devrel.easypermissions.EasyPermissions
import java.util.concurrent.TimeUnit
import java.util.jar.Manifest

object TrackingUtility {

    fun hasLocationPermission(context: Context) =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            EasyPermissions.hasPermissions(
                context,
                android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.ACCESS_COARSE_LOCATION
            )
        } else {
            EasyPermissions.hasPermissions(
                context,
                android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.ACCESS_COARSE_LOCATION,
                android.Manifest.permission.ACCESS_BACKGROUND_LOCATION

            )

        }

    fun getFormattedStopWacthTIme(ms: Long, includeMilis: Boolean = false): String {
        var miliseconds = ms
        val hours = TimeUnit.MILLISECONDS.toHours(miliseconds)
        miliseconds -= TimeUnit.HOURS.toMillis(hours)
        val minutes = TimeUnit.MILLISECONDS.toMinutes(miliseconds)
        miliseconds -= TimeUnit.MINUTES.toMillis(hours)
        val second = TimeUnit.MILLISECONDS.toSeconds(miliseconds)
        if (!includeMilis) {
            // klo jam nya kurang dari 2 digit ditambahkan 0 didepannya
            return "${if (hours < 10) "0" else ""}$hours :" +
                    "${if (minutes < 10) "0" else ""}$minutes :" +
                    "${if (second < 10) "0" else ""}$second :"
        }
        miliseconds -= TimeUnit.SECONDS.toMillis(second)
        miliseconds /= 10
        return "${if (hours < 10) "0" else ""}$hours :" +
                "${if (minutes < 10) "0" else ""}$minutes :" +
                "${if (second < 10) "0" else ""}$second :"+
                "${if (miliseconds < 10) "0" else ""}$miliseconds"

    }
}