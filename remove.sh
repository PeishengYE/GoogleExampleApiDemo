FILE_LIST=`find -iname "*.java"`
for each in $FILE_LIST
do
    echo your file is: $each
    sed -i -e 's/com.example.android.apis/com.radioyps.apidemos/g' $each
done
