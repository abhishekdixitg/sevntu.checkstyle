package com.puppycrawl.tools.checkstyle.checks.coding;

import com.puppycrawl.tools.checkstyle.BaseCheckTestSupport;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import java.io.File;
import org.junit.Test;

public class OverridableMethodInConstructorTest extends BaseCheckTestSupport {

    @Test
    public final void testNoWarnings() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
        };

      System.setProperty("testinputs.dir",
      "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");

        verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor1.java"), expected);
    }
	
    @Test
    public final void testWarning() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = { "10:27: " + createMsg("overrideMe") };
        
        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor2.java"), expected);
    }
    
    @Test
    public final void test2WarningsIn2Ctors() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);
        
        
        String[] expected = { 
                "10:27: " + createMsg("overrideMe"),
                "15:27: " + createMsg("overrideMe")
                };

       System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");

                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor3.java"), expected);
    }
    
    @Test
    public final void testWarningInSecondDepth() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = { "10:32: " + createMsg("overrideMe") };

        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");

        verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor4.java"), expected);
    }


    @Test
    public final void testWarningsInThirdDepth() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = { "10:32: " + createMsg("overrideMe"),
        		"11:27: " + createMsg("overrideMe"),};

        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor5.java"), expected);
    }


    @Test
    public final void testCloneNoWarningsSimple() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
                };

        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");

                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor6.java"), expected);
    }

    @Test
    public final void testCloneNoWarnings() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
                };

        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor7.java"), expected);
    }

    @Test
    public final void testCloneWarnings() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
        		"20:37: Overridable method 'doSmth' called in \"clone()\" method.",
        		"37:37: Overridable method 'doSmth' called in \"clone()\" method.",
                };

        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor8.java"), expected);
    }

    @Test
    public final void testCloneSecondDepth() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
        		"25:37: Overridable method 'doSmth' called in \"clone()\" method.",
        		"26:20: Overridable method 'doSmth2' called in \"clone()\" method.",               
        };

        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor9.java"), expected);
    }
    
    @Test
    public final void testCloneThirdDepthImplementation() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
        		"25:37: Overridable method 'doSmth' called in \"clone()\" method.",
        		"26:19: Overridable method 'accept' called in \"clone()\" method.",    
        		"27:24: Overridable method 'accept' called in \"clone()\" method.", 
        		"62:37: Overridable method 'doSmth' called in \"clone()\" method.", 
        };

        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor13.java"), expected);
    }
    
    @Test
    public final void testSerializableNoWarnings() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
                };

        System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor10.java"), expected);
    }
    
    @Test
    public final void testSerializableWarning() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
        		"31:20: Overridable method 'doSmth' called in \"readObject()\" method.",
                };

       System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor11.java"), expected);
    }
    
    @Test
    public final void testSerializable3WarningsInThirdDepth() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
        		"30:20: Overridable method 'doSmth' called in \"readObject()\" method.",
        		"31:25: Overridable method 'doSmth' called in \"readObject()\" method.",
        		"32:28: Overridable method 'doSmth' called in \"readObject()\" method.",        		
                };

       System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor12.java"), expected);
    }
    
    @Test
    public final void testSerializableThirdDepthImplementation() throws Exception {
        DefaultConfiguration checkConfig = createCheckConfig(OverridableMethodInConstructorCheck.class);

        String[] expected = {
        		"34:32: Overridable method 'doSmth' called in \"readObject()\" method.",
        		"60:19: Overridable method 'doSmth' called in \"readObject()\" method.",
        		"61:24: Overridable method 'doSmth' called in \"readObject()\" method.",
        		"62:20: Overridable method 'doSmth2' called in \"readObject()\" method.",   
        		"63:25: Overridable method 'doSmth2' called in \"readObject()\" method.", 
        		"77:23: Overridable method 'doSmth' called in \"readObject()\" method.", 
        		"78:28: Overridable method 'doSmth' called in \"readObject()\" method.", 
                };

       System.setProperty("testinputs.dir",
        "/media/data/Work/Git repository clone = Eclipse workspace/sevntu.checkstyle/checkstyle-sevntu/src/testinputs/com/puppycrawl/tools/checkstyle");
        
                verify(checkConfig, getPath("coding" + File.separator + "InputOverridableMethodInConstructor14.java"), expected);
    }
    
    public String createMsg(String methodName) {
        return "Overridable method '" + methodName + "' called in constructor.";
    }

}