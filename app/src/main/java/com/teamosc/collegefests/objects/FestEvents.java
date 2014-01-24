package com.teamosc.collegefests.objects;

import android.content.Context;
import android.content.res.Resources;

import com.teamosc.collegefests.R;

/**
 * Created by championswimmer on 24/1/14.
 */
public class FestEvents {
    private Context c;
    private Integer numEvents;
    private String[] eventCode;
    private String[] eventName;
    private String[] eventDesc;

    public FestEvents(Context context) {
        this.c = context;
        Resources r = c.getResources();
        eventCode = r.getStringArray(R.array.event_codenames);
        eventName = r.getStringArray(R.array.event_names);
        eventDesc = r.getStringArray(R.array.event_desc);
        numEvents = eventCode.length;
    }

    public Integer getNumFromCode(String code) {
        for ( int i = 0; i < numEvents; i++) {
            if (eventCode[i].equalsIgnoreCase(code)) {
                return i;
            }
        }
        return null;
    }
    public Integer getNumFromName(String name) {
        for ( int i = 0; i < numEvents; i++) {
            if (eventName[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return null;
    }

    public String getName(Integer n) {
        return eventName[n];
    }
    public String getDesc(Integer n) {
        return eventDesc[n];
    }
    public String getCode(Integer n) {
        return eventCode[n];
    }

    public String getName(String code) {
        for (int i = 0; i < numEvents; i++) {
            if (code.equalsIgnoreCase(eventCode[i])) {
                return eventName[i];
            }
        }
        return null;
    }

    public String getDesc(String code) {
        for (int i = 0; i < numEvents; i++) {
            if (code.equalsIgnoreCase(eventCode[i])) {
                return eventDesc[i];
            }
        }
        return null;
    }


}
