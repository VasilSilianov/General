package com.automationanywhere.botcomand;


import com.automationanywhere.botcommand.data.impl.NumberValue;
import com.automationanywhere.botcommand.exception.BotCommandException;
import com.automationanywhere.commandsdk.annotations.*;
import com.automationanywhere.commandsdk.annotations.rules.NotEmpty;
import com.automationanywhere.commandsdk.model.DataType;

import static com.automationanywhere.commandsdk.model.AttributeType.NUMBER;
import static com.automationanywhere.commandsdk.model.AttributeType.TEXT;


//BotCommand makes a class eligible for being considered as an action.
@BotCommand

//CommandPks adds required information to be dispalable on GUI.
@CommandPkg(
        //Unique name inside a package and label to display.
        name = "RPAMathModule", label = "[[RPA Math Module.label]]",
        node_label = "[[Returns the remainder of the modular division.node_label]]", description = "[[Concatenate.description]]", icon = "pkg.svg",

        //Return type information. return_type ensures only the right kind of variable is provided on the UI.
        return_label = "[[Returns number value, the remainder of the modular division.return_label]]", return_type = DataType.NUMBER, return_required = true,
        return_description = "[[Returns number value, the remainder of the modular division.return_label_description]]")
public class MathModule {


    //Identify the entry point for the action. Returns a Value<String> because the return type is String.
    @Execute
    public NumberValue action(
            //Idx 1 would be displayed first, with a text box for entering the value.
            @Idx(index = "1", type = TEXT)
            //UI labels.
            @Pkg(label = "[[RPAMathModule.firstInt.label]]")
            //Ensure that a validation error is thrown when the value is null.
            @NotEmpty
                    String firstInt,

            @Idx(index = "2", type = TEXT)
            @Pkg(label = "[[RPAMathModule.secondInt.label]]")
            @NotEmpty
                    String secondInt) {

        //Internal validation, to disallow empty strings. No null check needed as we have NotEmpty on firstString.
        int x= Integer.parseInt(firstInt);
        int y= Integer.parseInt(secondInt);
        if (x==0)
            throw new BotCommandException("First int is equal to Zero");

        if (y==0)
            throw new BotCommandException("First int is equal to Zero");

        //Business logic
        int result = y%x;

        //Return StringValue.
        return new NumberValue(result);
    }
}
