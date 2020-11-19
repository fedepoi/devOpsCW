echo ----------Start testing script----------

javac Dec2Hex.java/src/Dec2Hex.java
#cd Dec2Hex.java/src
echo ----------test with no argument----------
java Dec2Hex.java/src/Dec2Hex.java
echo ""
echo ----------test with integer argument supplied----------
java Dec2Hex.java/src/Dec2Hex.java 15683
echo ""
echo ----------test with String argument----------
java Dec2Hex.java/src/Dec2Hex.java 4hundred
echo ""
echo ----------test with a negative number----------
java Dec2Hex.java/src/Dec2Hex.java -895
echo ""


