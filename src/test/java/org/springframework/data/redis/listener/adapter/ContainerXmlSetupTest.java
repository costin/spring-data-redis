/*
 * Copyright 2011-2013 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.redis.listener.adapter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

/**
 * @author Costin Leau
 */
public class ContainerXmlSetupTest {

	@Test
	public void testContainerSetup() throws Exception {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(
				"/org/springframework/data/redis/listener/container.xml");
		RedisMessageListenerContainer container = ctx.getBean("redisContainer", RedisMessageListenerContainer.class);
		assertTrue(container.isRunning());
	}
}
