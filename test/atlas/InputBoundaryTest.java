package atlas;

import mock.MockModel;
import mock.MockUseCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/*  ArithmeticException is an indicator that
            Mock.callSuccess was called. These are a
            temporary hack for a assertCalls, until
            Mockito is up and running. */

class InputBoundaryTest
{
    @Test
    void acceptsModels() {
        Model model = new MockModel();
        InputBoundary test = new MockUseCase();

        assertThrows(ArithmeticException.class,
                ()-> test.accept(model));
    }
}

