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
package io.wcm.config.editor;

/**
 * Properties to define the edit capabilities of configuration parameters.
 */
public final class EditorProperties {

  private EditorProperties() {
    // only constants
  }

  /**
   * Name of the property to set the widget type
   */
  public static final String WIDGET_TYPE = "widgetType";

  /**
   * Name of the property to set the the application id of the parameter
   */
  public static final String PARAMETER_NAME = "name";

  /**
   * Name of the property to set the the application id of the parameter
   */
  public static final String PARAMETER_VALUE = "value";

  /**
   * Name of the property to set the the application id of the parameter
   */
  public static final String INHERITED_VALUE = "inheritedValue";

  /**
   * Name of the property to set the the application id of the parameter
   */
  public static final String APPLICATION_ID = "application";

  /**
   * Name of the property to set the the group of the parameter
   */
  public static final String GROUP = "group";

  /**
   * Name of the property to set the the description of the parameter
   */
  public static final String DESCRIPTION = "description";

  /**
   * Name of the property to set the minimum length value for the text field
   */
  public static final String MINLENGTH = "minlength";

  /**
   * Name of the property to set the maximum length value for the text field
   */
  public static final String MAXLENGTH = "minlength";

  /**
   * Name of the property to set the number of rows on the text area
   */
  public static final String ROWS = "rows";

  /**
   * Name of the property to set the "required" flag
   */
  public static final String REQUIRED = "required";

  /**
   * Name of the property to set the validation pattern
   */
  public static final String PATTERN = "pattern";

  /**
   * Name of the property to set root path for the browser
   */
  public static final String ROOT_PATH = "rootPath";

  /**
   * Name of the property to set the flag whether the parameter value is inherited
   */
  public static final String INHERITED = "inherited";

  /**
   * Name of the property to set the flag whether the parameter value is locked
   */
  public static final String LOCKED = "locked";

  /**
   * Name of the property to set the flag whether the parameter value was locked and cannot be unlocked
   */
  public static final String LOCKED_INHERITED = "lockedInherited";

}