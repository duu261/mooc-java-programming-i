import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtInit() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addExerciseGrowListByOne() {
        management.add("A test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addExerciseIsInList() {
        management.add("addExerciseIsInList");
        assertTrue(management.exerciseList().contains("addExerciseIsInList"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("exerciseCanBeMarkedAsCompleted");
        management.markAsCompleted("exerciseCanBeMarkedAsCompleted");
        assertTrue(management.isCompleted("exerciseCanBeMarkedAsCompleted"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("ifNotMarkedCompletedIsNotCompleted");
        management.markAsCompleted("ifNotMarkedCompletedIsNotCompleted");
        assertFalse(management.isCompleted("some Excercise"));
    }

    @Test
    public void exerciseCanBeRemove() {
        management.add("exerciseCanBeRemove");
        management.remove("exerciseCanBeRemove");
        assertFalse(management.exerciseList().contains("exerciseCanBeRemove"));
    }

}
