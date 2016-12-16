/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fabric8.kubernetes.client.mock;

import io.fabric8.kubernetes.client.Watch;
import io.fabric8.kubernetes.client.Watcher;
import io.fabric8.kubernetes.client.dsl.Rollable;
import io.fabric8.kubernetes.client.dsl.ScaleableResource;
import io.fabric8.kubernetes.client.dsl.TimeoutImageEditReplacePatchable;
import org.easymock.IExpectationSetters;

public interface MockRollableScaleableResource<T, D, B> extends ScaleableResource<T, IExpectationSetters<T>, D, IExpectationSetters<B>, IExpectationSetters<Watch>, Watcher<T>>,
  Rollable<TimeoutImageEditReplacePatchable<T, IExpectationSetters<T>, D>> {
}