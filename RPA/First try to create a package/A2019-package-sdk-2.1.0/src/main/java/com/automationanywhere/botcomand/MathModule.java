package com.automationanywhere.botcomand;


import com.automationanywhere.botcommand.data.Value;
import com.automationanywhere.botcommand.data.impl.NumberValue;
import com.automationanywhere.botcommand.data.impl.StringValue;
import com.automationanywhere.botcommand.exception.BotCommandException;
import com.automationanywhere.commandsdk.annotations.*;
import com.automationanywhere.commandsdk.annotations.rules.NotEmpty;
import com.automationanywhere.commandsdk.i18n.Messages;
import com.automationanywhere.commandsdk.i18n.MessagesFactory;
import com.automationanywhere.commandsdk.model.DataType;

import static com.automationanywhere.commandsdk.model.AttributeType.NUMBER;


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
            @Idx(index = "1", type = NUMBER)
            //UI labels.
            @Pkg(label = "[[RPAMathModule.firstInt.label]]")
            //Ensure that a validation error is thrown when the value is null.
            @NotEmpty
                    int firstInt,

            @Idx(index = "2", type = NUMBER)
            @Pkg(label = "[[RPAMathModule.secondInt.label]]")
            @NotEmpty
                    int secondInt) {

        //Internal validation, to disallow empty strings. No null check needed as we have NotEmpty on firstString.
        if ("".equals(firstString.trim()))
            throw new BotCommandException(MESSAGES.getString("emptyInputString", "firstString"));

        if ("".equals(secondString.trim()))
            throw new BotCommandException(MESSAGES.getString("emptyInputString", "secondString"));

        //Business logic
        String result = firstString + secondString;

        //Return StringValue.
        return new StringValue(result);
    }
}
