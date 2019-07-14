# Atlas
The Initiative's take on a plug-in architecture implementation. 

Initial Commit to Stitch into Readme 

Began Project Structuring
 - Test and Source folders are Parallel
  - All Classes have a dedicated interface, and we are coding to the interfaces.
 - Interfaces are found in /itf

 Began Development
 - Test Driven Development with jUnit 4/5
 - Planning on using Mockito for Test Mocking, but currently throwing Arithmetic Errors to hack up a assertCalls.

Progress:
 - Began high level design of Boundary interfaces, Request and Response Data objects.

Questions to be contemplated:
the boundary interfaces hook the fundamental application to its dependencies (database, web/mobile, framework). So should we use generics for the boundary, or should we create sub-interfaces?
