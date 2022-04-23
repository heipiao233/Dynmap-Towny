package org.dynmap.towny;

import org.dynmap.DynmapCommonAPI;
import org.dynmap.DynmapCommonAPIListener;

public class Listener extends DynmapCommonAPIListener {

    private DynmapTownyPlugin plugin;

    @Override
    public void apiEnabled(DynmapCommonAPI dynmapCommonAPI) {
        this.plugin=DynmapTownyPlugin.instance;
        this.plugin.api=dynmapCommonAPI;
    }

    @Override
    public boolean webChatEvent(String source, String name, String message) {
        this.plugin.onWebchatEvent(name, message);
        return true;
    }
}
