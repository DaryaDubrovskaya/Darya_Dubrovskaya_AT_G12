package homework.day13.people.junit;

import homework.day13.people.ManualEngineer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManualEngineerTest {

    ManualEngineer engineer = new ManualEngineer(35, 6);

    @Test
    public void skillAutomatedEngineerTest() {
        assertEquals(12, engineer.getSkill());
    }

    @Test
    public void experienceAutomatedEngineerTest() {
        assertEquals(6, engineer.getExperience());
    }

    @Test
    public void ageAutomatedEngineerTest() {
        assertEquals(35, engineer.getAge());
    }

    @Test
    public void setSkillAutomatedEngineerTest() {
        engineer.setSkill(18);
        assertEquals(18, engineer.getSkill());
    }

    @Test
    public void setExperienceAutomatedEngineerTest() {
        engineer.setExperience(9);
        assertEquals(9, engineer.getExperience());
    }

    @Test
    public void setAgeAutomatedEngineerTest() {
        engineer.setAge(26);
        assertEquals(26, engineer.getAge());
    }
}
