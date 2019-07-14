package mock;


import itf.Request;
import itf.UseCase;

import static mock.Mock.callSuccess;

public class MockUseCase implements UseCase {

    @Override
    public void execute() {

    }

    @Override
    public boolean receiveRequest(Request request)
    {
        callSuccess(0);
        return true;
    }


}
