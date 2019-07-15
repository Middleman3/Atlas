package mock;


import atlas.Model;
import atlas.UseCase;

import static mock.Mock.callSuccess;

public class MockUseCase implements UseCase {


    @Override
    public void execute() {

    }

    @Override
    public boolean accept(Model model) {
        callSuccess(0);
        return false;
    }
}
