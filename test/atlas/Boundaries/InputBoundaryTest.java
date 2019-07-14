package atlas.Boundaries;

import itf.Request;
import mock.MockRequest;
import mock.MockUseCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


class InputBoundaryTest
{
    @Test
    void receiveRequest() {
        Request request = new MockRequest();
        InputBoundary test = new MockUseCase();
        assertThrows(ArithmeticException.class,
                ()-> test.receiveRequest(request));
    }
}

