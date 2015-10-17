#Unit Test Project
I made a Proof of concept of a code seperated sysytem with associated unit tests.

##Design Choices
- I chose the framework that required the least amount of setup so I could concentrate on the modules.

- In order to enable easier passing around of joystick values, I packaged them into an array.

- I abstracted out the control of several collections wpilib objects to several classes.

##Please Discuss
- Is this a workable concept? Are there others we could explore before build season?
- Do the abstractions made for subsystems make sense? Should we assign sensors to a entirely seperate subsystems or integrate them into mechanical ones?
- Is there anything to learn from this, patterns to continue and pitfalls to avoid?

##Test Checklist
- [ ] Test Translation

- [ ] Test Rotation

- [ ] Test simultanious Translation and Rotation

- The bug I most expect is misaligned Talon's, or switched sine and cosine.
- If the bug is more than that please gather all information possible about it's occurence.
##Building
It now uses GradleRIO to build and deploy check GradleRIO4Dummies for more  info.

Thank you!!
