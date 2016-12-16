package edu.lsdbc.solarsoft.models;

/**
 * Created by Craig S. on 12/6/2016.
 */
public enum AppStatusType {
    draft,
    submitted,
    denied,
    approved;

    @Override
    public String toString() {
        return "StatusType{}";
    }
}
