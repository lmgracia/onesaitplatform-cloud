/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2013-2019 SPAIN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.minsait.onesait.platform.controlpanel.controller.apimanager;

import java.io.Serializable;

import com.minsait.onesait.platform.config.model.ApiHeader;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

public class ApiHeaderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public ApiHeaderDTO() {

	}

	public ApiHeaderDTO(ApiHeader apiheader) {
		this.name = apiheader.getName();
		this.type = apiheader.getHeader_type();
		this.description = apiheader.getHeader_description();
		this.value = apiheader.getHeader_value();
		this.condition = apiheader.getHeader_condition();
	}

	@ApiModelProperty(value = "Header Name")
	@Getter
	@Setter
	private String name;

	@ApiModelProperty(value = "Header Type")
	@Getter
	@Setter
	private String type;

	@ApiModelProperty(value = "Header Description")
	@Getter
	@Setter
	private String description;

	@ApiModelProperty(value = "Header Value")
	@Getter
	@Setter
	private String value;

	@ApiModelProperty(value = "Header Condition")
	@Getter
	@Setter
	private String condition;

}
