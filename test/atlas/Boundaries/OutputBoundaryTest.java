package atlas.Boundaries;

import itf.Response;
import mock.MockOutput;
import mock.MockResponse;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class OutputBoundaryTest
{
    @Test
    void receiveRequest() {
        Response response = new MockResponse();
        OutputBoundary test = new MockOutput();
        assertThrows(ArithmeticException.class,
                ()-> test.receiveResponse(response));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme