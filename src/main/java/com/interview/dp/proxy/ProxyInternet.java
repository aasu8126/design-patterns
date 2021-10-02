package com.interview.dp.proxy;

import java.util.List;

public class ProxyInternet implements Internet{

	Internet internet = new RealInternet();
	//	List<String> bannedSites = DataStore.getDataStore();
	@Override
	public void connectTo(String serverHost) throws Exception {
		List<String> bannedSites = DataStore.getDataStore();
		if(bannedSites.contains(serverHost.toLowerCase()))
		{
			throw new Exception("Access denied on : "+serverHost);
		}
		
		internet.connectTo(serverHost);
	}

}
