echo ----------Start testing script----------

javac Dec2Hex.java/src/Dec2Hex.java
cd Dec2Hex.java/src
echo ----------test with no argument----------
java Dec2Hex
echo ""
echo ----------test with integer argument supplied----------
java Dec2Hex 15683
echo ""
echo ----------test with String argument----------
java Dec2Hex 4hundred
echo ""
echo ----------test with a negative number----------
java Dec2Hex -895
echo ""
echo ----------test with a number bigger than the supported one----------
java Dec2Hex 2147483649
echo ""
echo ----------test with more than one value entered----------
java Dec2Hex 85 78999 four 89
echo ""

