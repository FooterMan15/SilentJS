package dev.footer.silentjs.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;

public class Plugin extends KubeJSPlugin {

    @Override
    public void registerEvents() {
        SilentEventJS.eventGroup.register();
    }

    @Override
    public void initStartup() {
    }
}

