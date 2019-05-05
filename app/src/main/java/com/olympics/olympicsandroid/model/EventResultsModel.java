package com.olympics.olympicsandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="olympics",strict = false)
public class EventResultsModel implements IResponseModel
{
    @Element(required = false)
    private OlympicEvent event;

    public OlympicEvent getEvent() {
        return event;
    }
}
