package com.rubbertranslator.event;

/**
 * @author Raven
 * @version 1.0
 * date  2020/12/4 15:13
 */
public class SetKeepTopEvent {
    boolean isKeepTop;

    public SetKeepTopEvent(boolean isKeepTop) {
        this.isKeepTop = isKeepTop;
    }

    public boolean isKeepTop() {
        return isKeepTop;
    }
}
