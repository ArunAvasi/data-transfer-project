/*
 * Copyright 2018 The Data Transfer Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.datatransferproject.types.client.datatype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;
import org.datatransferproject.types.common.models.DataVertical;

/** The result of a request to list data types available for export and import. */
public class DataTypes {

  private final Set<DataVertical> dataTypes;

  @JsonCreator
  public DataTypes(@JsonProperty("transferDataTypes") Set<DataVertical> dataTypes) {
    this.dataTypes = dataTypes;
  }

  public Set<DataVertical> getDataTypes() {
    return dataTypes;
  }
}
