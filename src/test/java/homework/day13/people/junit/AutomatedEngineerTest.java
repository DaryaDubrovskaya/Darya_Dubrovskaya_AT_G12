package homework.day13.people.junit;

import homework.day13.people.AutomatedEngineer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomatedEngineerTest {

    AutomatedEngineer engineer = new AutomatedEngineer(30, 5);

    @Test
    public void skillAutomatedEngineerTest() {
        assertEquals(15, engineer.getSkill());
    }

    @Test
    public void experienceAutomatedEngineerTest() {
        assertEquals(5, engineer.getExperience());
    }

    @Test
    public void ageAutomatedEngineerTest() {
        assertEquals(30, engineer.getAge());
    }

    @Test
    public void setSkillAutomatedEngineerTest() {
        engineer.setSkill(18);
        assertEquals(18, engineer.getSkill());
    }

    @Test
    public void setExperienceAutomatedEngineerTest() {
        engineer.setExperience(6);
        assertEquals(6, engineer.getExperience());
    }

    @Test
    public void setAgeAutomatedEngineerTest() {
        engineer.setAge(26);
        assertEquals(26, engineer.getAge());
    }
}
