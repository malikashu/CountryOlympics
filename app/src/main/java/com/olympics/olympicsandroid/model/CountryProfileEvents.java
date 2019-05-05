package com.olympics.olympicsandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * This model holds all events for given country (organization)
 */
@Root(name="olympics",strict = false)
public class CountryProfileEvents implements IResponseModel {

    @Element
    private Organization organization;

    public Organization getOrganization() {
        return organization;
    }
}
