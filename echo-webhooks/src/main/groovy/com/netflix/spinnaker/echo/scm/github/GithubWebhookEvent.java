/*
 * Copyright 2019 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.echo.scm.github;

import com.netflix.spinnaker.echo.api.events.Event;
import java.util.Map;

public interface GithubWebhookEvent {
  String getFullRepoName(Event event, Map postedEvent);

  String getRepoProject(Event event, Map postedEvent);

  String getSlug(Event event, Map postedEvent);

  String getHash(Event event, Map postedEvent);

  String getBranch(Event event, Map postedEvent);

  String getAction(Event event, Map postedEvent);
}
