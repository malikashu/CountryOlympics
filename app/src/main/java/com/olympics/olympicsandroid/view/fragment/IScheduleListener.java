package com.olympics.olympicsandroid.view.fragment;

import com.olympics.olympicsandroid.model.presentationModel.EventResultsViewModel;

public interface IScheduleListener
{
    public void handleItemClick(EventResultsViewModel itemClicked);
}
