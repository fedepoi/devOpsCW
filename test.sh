echo ----------Start testing script----------

javac Dec2Hex.java/src/Dec2Hex.java
cd Dec2Hex.java/src
echo ""

echo ----------handle program fail----------
echo ""
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

