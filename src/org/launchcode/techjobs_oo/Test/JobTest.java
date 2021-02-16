package org.launchcode.techjobs_oo.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job mainJob1;
    Job mainJob2;
    Job job1;
    Job job2;


    @Before
    public void createJobObjects(){
        mainJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        mainJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         job1 = new Job();
         job2 = new Job();
    }
    @Test
    public void testSettingJobId() {
        assertFalse(job1.equals(job2));
        assertEquals(1, job2.getId() - job1.getId());
        //assertEquals(1, job1.getId());
        }
    @Test
    public void testJobConstructSetsAllFields(){
        assertEquals("Product tester",mainJob1.getName());
        assertEquals("ACME",mainJob1.getEmployer().getValue());
        assertEquals("Desert",mainJob1.getLocation().getValue());
        assertEquals("Quality control", mainJob1.getPositionType().getValue());
        assertEquals("Persistence", mainJob1.getCoreCompetency().getValue());
        assertTrue(mainJob1 instanceof Job);
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(mainJob1.equals(mainJob2));
    }
    @Test
    public void testToStringMethod(){

        assertTrue(mainJob1.toString().endsWith("\n"));
        assertTrue(mainJob1.toString().startsWith("\n"));

        assertEquals("\n" +
                "ID: "+mainJob1.getId()+"\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence" +
                "\n", mainJob1.toString());
    }





}
