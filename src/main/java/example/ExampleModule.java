package example;

import com.cab404.wifu.base.WifiLoginModule;

/**
 * Example login module
 * Created at 12:09 on 02/12/15
 *
 * @author cab404
 */
public class ExampleModule implements WifiLoginModule {
    @Override
    public boolean handle(WifiContextInfo info, Log log) {
        // Do something with network here
        return false;
    }

    @Override
    public long repeatDelay() {
        return -1;
    }

    @Override
    public int canHandle(WifiContextInfo info) {
        return 0;
    }
}
