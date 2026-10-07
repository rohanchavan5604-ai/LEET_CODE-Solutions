# Read from the file file.txt and output the tenth line to stdout.
count=0

while read line
do
    count=$((count + 1))

    if [ $count -eq 10 ]; then
        echo "$line"
        exit 0
    fi
done < file.txt

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna