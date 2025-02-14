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
package com.minsait.onesait.platform.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Configurable;

import com.minsait.onesait.platform.config.model.base.AuditableEntityWithUUID;

import lombok.Getter;
import lombok.Setter;

@Configurable
@Entity
@Table(name = "BASE_LAYER")
public class BaseLayer extends AuditableEntityWithUUID {

	private static final long serialVersionUID = 1L;

	@Column(name = "IDENTIFICATION", length = 50, unique = true, nullable = false)
	@NotNull
	@Getter
	@Setter
	private String identification;

	@Column(name = "NAME", length = 50, unique = false, nullable = false)
	@NotNull
	@Getter
	@Setter
	private String name;

	@Column(name = "TECHNOLOGY", length = 50, unique = false, nullable = false)
	@NotNull
	@Getter
	@Setter
	private String technology;

	@Column(name = "URL", length = 1024, unique = false, nullable = false)
	@NotNull
	@Getter
	@Setter
	private String url;
}
