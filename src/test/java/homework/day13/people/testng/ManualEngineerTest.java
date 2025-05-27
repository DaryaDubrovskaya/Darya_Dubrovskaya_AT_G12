package homework.day13.people.testng;

import homework.day13.people.ManualEngineer;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ManualEngineerTest {

    ManualEngineer engineer = new ManualEngineer(35, 6);

    @Test
    public void skillAutomatedEngineerTest() {
        assertEquals(engineer.getSkill(), 12);
    }

    @Test
    public void experienceAutomatedEngineerTest() {
        assertEquals(engineer.getExperience(), 6);
    }

    @Test
    public void ageAutomatedEngineerTest() {
        assertEquals(engineer.getAge(), 35);
    }

    ManualEngineer engineer1 = new ManualEngineer(35, 6);

    @Test
    public void setSkillAutomatedEngineerTest() {
        engineer1.setSkill(18);
        assertEquals(engineer1.getSkill(), 18);
    }

    @Test
    public void setExperienceAutomatedEngineerTest() {
        engineer1.setExperience(9);
        assertEquals(engineer1.getExperience(), 9);
    }

    @Test
    public void setAgeAutomatedEngineerTest() {
        engineer1.setAge(26);
        assertEquals(engineer1.getAge(), 26);
    }
}
