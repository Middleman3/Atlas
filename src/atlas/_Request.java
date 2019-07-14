package atlas;

import itf.Request;

/**
 * This UI Request embodies everything that the View
 * might try to pass into the application, but interfaced
 * through our object, on our terms. You can generate these
 * objects whether you use the web, mobile, jUnit, or some
 * mocking service. It bridges the application to the UI and
 * makes the View a plugin of sorts. It's mostly a dataObject,
 * however we will not pass these objects. Instead we will
 * pass around Request interfaces, a universal theme in
 * Atlas.
 */
public class _Request implements Request {

    @Override
    public Object get(String userId) {

        return null;
    }
}
