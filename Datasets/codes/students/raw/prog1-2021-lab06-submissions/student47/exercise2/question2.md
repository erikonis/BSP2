I implemented the functionality of tracking the participation of a passenger or a pilot in one or multiple flights in the flight.java class. 

Here is the output from my Main/Tester class: 

This is the log for flight number: FL1234
This flight is headed from Frankfurt in Germany to Milano in Italy.
The pilot is Linus Sebastian, and the co-pilot is Jake Lafr.
The passenger list consists of: John Doe, Gilles Silvestri, Mark Hamill.

This and the changes I did to the Flight.java class, goes to show the advantages of associating Person's subclasses with Flight.java.
A Flight always has one pilot and one co-pilot, so there it makes obvious sense.
A Flight also has a list of passengers, as seats are reserved and identification is necessary.

A disadvantage would be, that only the Flight Object has the capabilities to see pilots and passengers, but their respective classes don't. Obviously if we want to count "loyalty points" for example
we need a way to track flights within passengers. On the other side, a pilot has no flight parameters, therefor they look "unused" even when participating on a flight. 
All of these problems are however fixable with changes to the respective classes. 