package mock;

import itf.Request;

import static mock.Mock.callSuccess;

public class MockRequest implements Request
{

    @Override
    public Object get(String userId)
    {
        callSuccess(0);
        return false;
    }
}
