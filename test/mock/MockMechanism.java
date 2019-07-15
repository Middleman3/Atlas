package mock;

import atlas.InputBoundary;
import atlas.Model;

import static mock.Mock.callSuccess;

public class MockMechanism implements InputBoundary
{
    @Override
    public boolean accept(Model model) {
        callSuccess(0);
        return false;
    }
}
