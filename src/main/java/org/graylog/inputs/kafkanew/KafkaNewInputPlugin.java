package org.graylog2.inputs.kafkanew;

import org.graylog2.plugin.Plugin;
import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.PluginModule;

import java.util.Collection;

import com.google.auto.service.AutoService;
import com.google.common.collect.ImmutableSet;

@AutoService(Plugin.class)
public class KafkaNewInputPlugin implements Plugin {
    @Override
    public PluginMetaData metadata() {
        return new KafkaNewInputMetadata();
    }

    @Override
    public Collection<PluginModule> modules() {
        return ImmutableSet.<PluginModule>of(new KafkaNewInputModule());
    }
}
