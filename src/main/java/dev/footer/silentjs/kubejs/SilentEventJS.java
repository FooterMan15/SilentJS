package dev.footer.silentjs.kubejs;

import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;
import dev.latvian.mods.kubejs.event.StartupEventJS;

public interface SilentEventJS {
    EventGroup eventGroup = EventGroup.of("SilentEvents");

    EventHandler REGISTRY = eventGroup.startup("registry", () -> StartupEventJS.class);
}
