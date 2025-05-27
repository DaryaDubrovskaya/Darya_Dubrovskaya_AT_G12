package homework.day13.people.testng;

import homework.day13.people.AutomatedEngineer;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AutomatedEngineerTest {

    AutomatedEngineer engineer = new AutomatedEngineer(30, 5);

    @Test
    public void skillAutomatedEngineerTest() {
        assertEquals(engineer.getSkill(), 15);
    }

    @Test
    public void experienceAutomatedEngineerTest() {
        assertEquals(engineer.getExperience(), 5);
    }

    @Test
    public void ageAutomatedEngineerTest() {
        assertEquals(engineer.getAge(), 30);
    }

    AutomatedEngineer engineer1 = new AutomatedEngineer(30, 5);

    @Test
    public void setSkillAutomatedEngineerTest() {
        engineer1.setSkill(18);
        assertEquals(engineer1.getSkill(), 18);
    }

    @Test
    public void setExperienceAutomatedEngineerTest() {
        engineer1.setExperience(6);
        assertEquals(engineer1.getExperience(), 6);
    }

    @Test
    public void setAgeAutomatedEngineerTest() {
        engineer1.setAge(26);
        assertEquals(engineer1.getAge(), 26);
    }
}
