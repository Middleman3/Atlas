package mock;

import atlas.Model;

import static mock.Mock.callSuccess;

public class MockModel implements Model
{

    @Override
    public Object get(String key)
    {
        callSuccess(0);
        return false;
    }
}
