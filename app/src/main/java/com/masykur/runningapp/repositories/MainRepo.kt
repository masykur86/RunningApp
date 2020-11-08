package com.masykur.runningapp.repositories

import com.masykur.runningapp.db.Run
import com.masykur.runningapp.db.RunDAO
import javax.inject.Inject


class MainRepo @Inject constructor(val runDAO: RunDAO) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunSortedByDate() = runDAO.getAllsortedByDate()

    fun getAllsortedByDistance() = runDAO.getAllsortedByDistance()

    fun getAllsortedByTimeInMilis() = runDAO.getAllsortedByTimeInMilis()

    fun getAllsortedByCal() = runDAO.getAllsortedByCal()

    fun getAllsortedByAvgSpeed() = runDAO.getAllsortedByAvgSpeed()

    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalTime() = runDAO.getTotalTime()

    fun getTotalcal() = runDAO.getTotalcal()

    fun getAvgSpeed() = runDAO.getAvgSpeed()


}