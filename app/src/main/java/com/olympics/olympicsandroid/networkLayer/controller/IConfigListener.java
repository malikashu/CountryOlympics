package com.olympics.olympicsandroid.networkLayer.controller;

import com.olympics.olympicsandroid.model.AppVersionData;
import com.olympics.olympicsandroid.model.ErrorModel;

/**
 * Created   on 7/24/16.
 */
public interface IConfigListener
{

    public void onConfigSuccess(AppVersionData appVersionData);
    public void onConfigFailure(ErrorModel errorModel);
}
