import com.automationanywhere.botcomand.MathModule;
import com.automationanywhere.botcommand.data.impl.NumberValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModularDivision {
    @Test
    public void TestReturnCorrectValue(){
        //conditions
        String firstInt = "3";
        String secondInt = "5";

        //Create instance of MathModule
        MathModule mathModule = new MathModule();
        //Invoke
        NumberValue output =mathModule.action(firstInt,secondInt);

        //Assert
        Assert.assertEquals(output.getAsDouble(),2.0);
    }

    @Test
    public void TestReturnCorrectValueWithMinus(){
        //conditions
        String firstInt = "-3";
        String secondInt = "5";

        //Create instance of MathModule
        MathModule mathModule = new MathModule();
        //Invoke
        NumberValue output =mathModule.action(firstInt,secondInt);

        //Assert
        Assert.assertEquals(output.getAsDouble(),2.0);
    }

    @Test
    public void TestReturnCorrectValueWith2(){
        //conditions
        String firstInt = "33";
        String secondInt = "55";

        //Create instance of MathModule
        MathModule mathModule = new MathModule();
        //Invoke
        NumberValue output =mathModule.action(firstInt,secondInt);

        //Assert
        Assert.assertEquals(output.getAsDouble(),22.0);
    }

    @Test
    public void TestReturnIncorrectValueWith(){
        //conditions
        String firstInt = "5";
        String secondInt = "3";

        //Create instance of MathModule
        MathModule mathModule = new MathModule();
        //Invoke
        NumberValue output =mathModule.action(firstInt,secondInt);

        //Assert
        Assert.assertNotEquals(output.getAsDouble(),2.0);
    }

    @Test
    public void firstInEqualZero(){
        //conditions
        String firstInt = "0";
        String secondInt = "3";

        //Create instance of MathModule
        MathModule mathModule = new MathModule();
        //Invoke
        NumberValue output =mathModule.action(firstInt,secondInt);

        //Assert
        Assert.assertNotEquals(output.getAsDouble(),2.0);
    }
}
