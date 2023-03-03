def decToOctal(n):
    oct = ""
    quot = n

    while(quot != 0):
        rem = quot % 8
        oct = str(rem) + oct
        quot = quot // 8

    return oct or 0


print(decToOctal(49))
print(decToOctal(0))
