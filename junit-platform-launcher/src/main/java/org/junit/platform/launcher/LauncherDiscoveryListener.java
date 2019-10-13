/*
 * Copyright 2015-2019 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.platform.launcher;

import org.junit.platform.engine.EngineDiscoveryListener;
import org.junit.platform.engine.UniqueId;

public interface LauncherDiscoveryListener extends EngineDiscoveryListener {

	default void engineDiscoveryStarted(UniqueId engineId) {
	}

	default void engineDiscoveryFinished(UniqueId engineId, EngineDiscoveryResult result) {
	}

}
