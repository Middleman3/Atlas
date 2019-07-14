package mock;

import atlas.Boundaries.OutputBoundary;
import itf.Response;

import static mock.Mock.callSuccess;

public class MockOutput implements OutputBoundary
{
    @Override
    public boolean receiveResponse(Response response) {
        callSuccess(0);
        return false;
    }
}
