package com.springcore.constructor;

import java.util.Set;

public class Store {
	private int proId;
	private String proName;
	private Set<String> proFlavour;
	
	public Store(int proId, String proName, Set<String> proFlavour) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proFlavour = proFlavour;
	}

	@Override
	public String toString() {
		return "Store [proId=" + proId + ", proName=" + proName + ", proFlavour=" + proFlavour + "]";
	}


}
