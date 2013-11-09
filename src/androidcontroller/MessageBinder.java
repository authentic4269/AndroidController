package androidcontroller;

import android.os.Binder;

public abstract class MessageBinder extends Binder {
    public ServerConnection getService() {
        // Return this instance of LocalService so clients can call public methods
        return null;
    }
}
