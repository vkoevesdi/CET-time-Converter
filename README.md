TimeConverter

This is the mainfile to run the TimeConverter tool.
It creates a window in a flow layout and serves one purpose: to convert time from a selected timezone into the Central European Time!
My original plan was to also let the user decide not only from but to which timezone you want to convert to but this variant proved challenging enough (for me) already.

I selected 8 timezones I deemed "worthy" to be included because I thought they were the most relevant ones and stored them in an array (lines 34-43).
This array delivers the content for the JComboBox which represents the dropdown menu in the main window (lines 45-46).

The GUI itself is pretty self-explanatory and nothing too fancy. A number of smaller challenges were represented by the user input.
To make things a little easier to start out with I decided to restrict the input to a "HH:MM" (0-23h) format and check if the time given was valid (i.e. no negative Integers or hours over 23) via the exception handling block (lines 70-108).
Lines 71-72 make sure that it is irrelevant to the program if you include leading "0"'s as in "04:24" for example because it converts all the input until the ":" and the arithmetic operations run by the methods you see in the switch-case-block (lines 79-104) can handle both variants.
Aforementioned methods are part of a subclass called "Conversion" which is also included in this repository!
