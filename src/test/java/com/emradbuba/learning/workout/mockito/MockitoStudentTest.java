package com.emradbuba.learning.workout.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoStudentTest {

    private MockitoStudent studentMock;

    @BeforeEach
    public void setUp() {
        studentMock = mock(MockitoStudent.class, "InitName");
    }

    @Test
    public void testSetName() {
        studentMock.setName("Name1");
        studentMock.setName("Name2");
        verify(studentMock, times(1)).setName("Name1"); // verify that setName("Name1") was invoked once
        verify(studentMock, times(1)).setName("Name2"); // verify that setName("Name2") was invoked once
        studentMock.setName("Name1");
        verify(studentMock, atLeast(1)).setName("Name1");  // verify that setName("Name1") was invoked at least once
    }

    @Test
    public void testSetName2() {
        when(studentMock.getName()).thenReturn("Radek");
        assertEquals("Radek", studentMock.getName());
        doNothing().when(studentMock).setName(argThat(s -> s.startsWith("A")));
    }
}