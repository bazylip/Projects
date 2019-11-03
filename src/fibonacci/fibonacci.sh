# Fibonacci sequence

fib(){
    if [ $1 -eq 0 ]; then
        echo 0
    elif [ $1 -eq 1 ]; then
        echo 1
    else
        echo $(( `fib $(($1-1))` + `fib $(($1-2))` ))
    fi
}

echo "Podaj długość ciągu:"

read precision

echo $(fib $precision)