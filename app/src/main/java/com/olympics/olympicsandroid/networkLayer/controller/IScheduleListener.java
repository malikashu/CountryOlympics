package com.olympics.olympicsandroid.networkLayer.controller;

import com.olympics.olympicsandroid.model.ErrorModel;
import com.olympics.olympicsandroid.model.OlympicSchedule;

/**
 * Created   on 7/24/16.
 */
public interface IScheduleListener
{
    public void scheduleSuccess(OlympicSchedule olympicSchedule);
    public void scheduleError(ErrorModel errorModel);

}
