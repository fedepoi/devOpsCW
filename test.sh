#start of the test script
echo ----------Start testing script----------
#compiling java file
javac Dec2Hex.java/src/Dec2Hex.java
#move into java file directory
cd Dec2Hex.java/src
echo ""

echo ----------handle program fail----------
echo ""
#this test will run the program with no argument
echo ----------test with no argument----------
java Dec2Hex
STATUS="${?}"
if [ "${STATUS}" -eq 0 ]
then
	echo test is passed
else
        set -e
        echo -e "the program failed"
fi
echo ""
#this test will run the program giving an integer as input
echo ----------test with integer argument supplied----------
java Dec2Hex 15683
STATUS="${?}"
if [ "${STATUS}" -eq 0 ]
then
        echo test is passed
else
        set -e
        echo -e "the program failed"

fi
echo ""
#this test will run the program with a negative integer as input
echo ----------test with a negative number----------
java Dec2Hex -895  || STATUS=1

if [ "${STATUS}" -eq 0 ]
then
        echo test is passed
else
        set +e
        echo -e  "the program failed"

fi 
echo ""
#this test will run the program with a number bigger than integer
echo ----------test with a number bigger than the supported one----------
java Dec2Hex 2147483649
STATUS="${?}"
if [ "${STATUS}" -eq 0 ]
then
        echo test is passed
else
        set -e
        echo -e  "the program failed"
fi
echo ""
#this test will run the program with more than one argument supplied
echo ----------test with more than one value entered----------
java Dec2Hex 85 78999 four 89 || STATUS=1
if [ "${STATUS}" -eq 0 ]
then
        echo test is passed
else
        set -e
        echo -e  "the program failed"
fi
echo ""
#this test will run the program with a string value input
echo ----------test with String argument----------
java Dec2Hex 4hundred || STATUS=1
if [ "${STATUS}" -eq 0 ]
then
        echo test is passed
else
        set -e
        echo -e  "the program failed"
fi
echo ""

