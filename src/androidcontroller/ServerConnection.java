package androidcontroller;

import android.app.Service;

public abstract class ServerConnection extends Service {
	public int sendJson(String json) {
		return -1;
	}
	// listOptions provides the options, choose server name from among them, then call connecttoserver with it
	public boolean connectToServer(String serverName) {
		return false;
	}
	public String[] listOptions() { 
		return null;
	}
	
	public void kill() {
		return;
	}
}
