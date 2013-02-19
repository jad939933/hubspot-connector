/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.hubspot.model.contactproperty;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(include = Inclusion.NON_NULL)
public class CustomContactPropertyOptions {

	private String label;
	private String value;
	private Integer displayOrder;
	
	@JsonProperty
	public String getLabel() {
		return label;
	}
	
	@JsonProperty
	public void setLabel(String label) {
		this.label = label;
	}
	
	@JsonProperty
	public String getValue() {
		return value;
	}
	
	@JsonProperty
	public void setValue(String value) {
		this.value = value;
	}
	
	@JsonProperty
	public Integer getDisplayOrder() {
		return displayOrder;
	}
	
	@JsonProperty
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
}
