package com.emradbuba.learning.workout.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

public class StudentsManagerTest {

    private StudentsManager manager;

    @BeforeEach
    public void setUp() {
        manager = new StudentsManager();
    }

    @Test
    public void testChangeStudentsNames() {
        MockitoStudent mock = mock(MockitoStudent.class);
        ArgumentCaptor<String> argCaptor = ArgumentCaptor.forClass(String.class);
        manager.addStudent(mock);
        manager.changeStudentsNames("StupidName1");
        manager.changeStudentsNames("StupidName2");
        verify(mock, atLeastOnce()).setName(argCaptor.capture());
        argCaptor.getAllValues().contains("StupidName1");  // check if manager invoked setName of mocked student as expected...
        argCaptor.getAllValues().contains("StupidName2");
    }
}