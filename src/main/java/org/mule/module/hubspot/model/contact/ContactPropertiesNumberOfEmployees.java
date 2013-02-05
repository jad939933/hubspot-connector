/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.hubspot.model.contact;

public enum ContactPropertiesNumberOfEmployees {
	_1_5("1-5"),
	_5_25("5-25"),
	_25_50("25-50"),
	_50_100("50-100"),
	_100_500("100-500"),
	_500_1000("500-1000"),
	_1000plus("1000+");
	
	private String value;
	
	private ContactPropertiesNumberOfEmployees(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	
	static public ContactPropertiesNumberOfEmployees getFromString(String value) {
		for (ContactPropertiesNumberOfEmployees obj : ContactPropertiesNumberOfEmployees.values()) {
			if (obj.getValue().equalsIgnoreCase(value)) {
				return obj;
			}
		}
		return null;
	}
}