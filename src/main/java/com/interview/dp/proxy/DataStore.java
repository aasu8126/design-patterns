package com.interview.dp.proxy;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

static List<String> bannedSites = new ArrayList<String>();
	
	static {
		bannedSites.add("abc.com");
		bannedSites.add("pqr.com");
		bannedSites.add("xyz.com");
	}
	
	public static List<String > getDataStore()
	{
		return bannedSites;
	}
}
