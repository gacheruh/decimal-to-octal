function decToOctal(n){
    let quot = n;
    let oct = "";

    while(quot !== 0){
        rem = quot % 8
        oct = rem + oct
        quot = Math.floor(quot / 8)
    }

    return oct || 0
}

console.log(decToOctal(49))
console.log(decToOctal(0))

