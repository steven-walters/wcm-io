/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2014 wcm.io
 * %%
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
 * #L%
 */
package io.wcm.handler.url;

import io.wcm.handler.url.spi.UrlHandlerConfig;

import java.util.Set;

import org.apache.sling.api.adapter.Adaptable;
import org.apache.sling.api.resource.Resource;
import org.osgi.annotation.versioning.ProviderType;

import com.day.cq.wcm.api.Page;

/**
 * An UrlMode define the externalization logic for URLs depending on context-specific configuration parameters
 * defined in {@link UrlParams}.
 * <p>
 * If you want to implement your own UrlMode you can create a singleton class extending this interface. See
 * {@link UrlModes} class as an example.
 * </p>
 */
@ProviderType
public interface UrlMode {

  /**
   * @return Id uniquely identifying the URL mode
   */
  String getId();

  /**
   * Get prefix (scheme, hostname and context path or integrator placeholder) for externalizing a content page link URL.
   * @param adaptable Either request or resource which can be adapted to model implementations like
   *          {@link UrlHandlerConfig}
   * @param runModes Current sling run modes
   * @param currentPage Current page (is null if not executed in request context)
   * @param targetPage Target page to which internal link points to.
   * @return Prefix or null
   */
  String getLinkUrlPrefix(Adaptable adaptable, Set<String> runModes, Page currentPage, Page targetPage);

  /**
   * Get prefix (scheme, hostname and context path or integrator placeholder) for externalizing a resource URL.
   * @param adaptable Either request or resource which can be adapted to model implementations like
   *          {@link UrlHandlerConfig}
   * @param runModes Current sling run modes
   * @param currentPage Current page (is null if not executed in request context)
   * @param targetResource Target resource to which the resource link points to
   *          (may be null if it could not be resolved)
   * @return Prefix or null
   */
  String getResourceUrlPrefix(Adaptable adaptable, Set<String> runModes, Page currentPage, Resource targetResource);

}
