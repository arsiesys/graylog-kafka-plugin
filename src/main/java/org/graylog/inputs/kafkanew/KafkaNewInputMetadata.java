package org.graylog2.inputs.kafkanew;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

public class KafkaNewInputMetadata implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "org.graylog2.plugins.graylog-input-kafkanew/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return SyslogKafkaInputNew.class.getCanonicalName();
    }

    @Override
    public String getName() {
        return "KafkaNew Input Plugin";
    }

    @Override
    public String getAuthor() {
        return "Graylog, Inc.";
    }

    @Override
    public URI getURL() {
        return URI.create("https://www.graylog.org");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(1, 0, 0));
    }

    @Override
    public String getDescription() {
        return "Process messages from one or multiple topics of an KafkaNew broker.";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(2, 4, 0));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
