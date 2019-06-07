package org.graylog2.inputs.kafkanew;

import org.graylog2.plugin.PluginModule;

public class KafkaNewInputModule extends PluginModule {
	@Override
	protected void configure() {
		addTransport("kafkanew", KafkaNewTransport.class );
		addMessageInput(SyslogKafkaInputNew.class, SyslogKafkaInputNew.Factory.class);
		addMessageInput(GELFKafkaInputNew.class, GELFKafkaInputNew.Factory.class);
		addMessageInput(RawKafkaInputNew.class, RawKafkaInputNew.Factory.class);
	}
}
