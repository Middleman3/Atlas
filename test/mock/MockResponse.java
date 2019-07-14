package mock;

import itf.Response;

import static mock.Mock.callSuccess;

public class MockResponse implements Response {

    @Override
    public Object get(String userId) {
        callSuccess(0);
        return null;
    }
}
